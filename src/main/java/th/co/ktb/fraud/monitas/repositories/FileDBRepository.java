package th.co.ktb.fraud.monitas.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.ktb.fraud.monitas.models.DatabaseFile;

@Repository
public interface FileDBRepository extends JpaRepository<DatabaseFile, Long> {
	
	@Query("select file from DatabaseFile file where id =:id and (is_delete is null or is_delete = false)")
	public DatabaseFile findFile(@Param("id") Long id);
	
	@Query(nativeQuery = true,value = "select file.*,c.alert_id as alert_no "
			+ "from mnt_file file "
			+ "inner join mnt_case_file caseFile on file.id = caseFile.file_id "
			+ "inner join mnt_case c on c.id = caseFile.case_id "
			+ "where case_id = :caseId and (is_delete is null or is_delete = false)")
	public List<Map<String,Object>> findFileFromCaseId(@Param("caseId") int caseId);
	
	@Query(value = "select * from ("
			+ "select files.*,task.alert_id as alert_no\n"
			+ "from mnt_file files\n"
			+ "inner join mnt_case_file mcf on files.id = mcf.file_id \n"
			+ "inner join mnt_case task on task.id = mcf.case_id \n"
			+ "left join cbs_customer_profile cust on cust.account_id = task.account_no \n"
			+ "where cust.customer_id = :custId and (files.is_delete is null or files.is_delete = false)\n"
			+ "\n"
			+ "union \n"
			+ "\n"
			+ "select custFile.*,null as alert_no\n"
			+ "from mnt_file custFile\n"
			+ "inner join mnt_cust_file cust on custFile.id = cust.file_id \n"
			+ "where cust.cust_id = :custId and (custFile.is_delete is null or custFile.is_delete = false)\n"
			+ ") files",nativeQuery = true)
	public Page<Map<String,Object>> findFileFromCustId(@Param("custId") int custId,Pageable page);
	
	
	@Modifying
	@Query("update DatabaseFile file set "
			+ "is_delete = true,"
			+ "deleted_by = :username,"
			+ "deleted_datetime = NOW() "
			+ "where id = :id")
	public int deleteFile(
			@Param("id") long id,
			@Param("username") String username);

}
