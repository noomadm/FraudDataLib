package th.co.ktb.fraud.monitas.repositories;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.ktb.fraud.monitas.models.InvestigationLog;

@Repository
public interface InvestigationLogRepository  extends CrudRepository<InvestigationLog, Integer>{

	@Query(value = "select log.* ,mft.name as fraud_type"
			+ " from mnt_case_history log "
			+ " left join mnt_fraud_type mft on log.fraud_type_id = mft.id "
			+ " where case_id = :caseId order by created_datetime desc",
			nativeQuery = true)
	public List<Map<String,Object>> getInvestigationLog(@Param("caseId") long caseId);
	
	@Query(value = "select \n"
			+ "trans_amount,\n"
			+ "ending_balance,\n"
			+ "ovrid ,"
			+ "beneficiary_code as bank_code, "
			+ "mtt.*\n"
			+ "from mnt_dtj dtj\n"
			+ "left join mnt_transaction_type mtt on dtj.external_trans_code = mtt.trxn_code \n"
			+ "where trans_sequence_no = :trxnCode and lower(mtt.channel) = :area",nativeQuery = true)
	public Map<String,Object> getTransactionInfo(@Param("trxnCode")Long trxnCode,@Param("area")String area);
	
	@Query(value = "select \n"
			+ "trans_amount,\n"
			+ "ending_balance,\n"
			+ "ovrid ,"
			+ "beneficiary_code as bank_code, "
			+ "mtt.*\n"
			+ "from mnt_dtj dtj\n"
			+ "left join mnt_transaction_type mtt on dtj.external_trans_code = mtt.trxn_code \n"
			+ "where trans_date = :tranDate "
			+ "and date_time = :datetime "
			+ "and account_number = :accountNumber "
			+ "and trans_sequence_no = :sequenceNo ",nativeQuery = true)
	public Map<String,Object> getTransactionInfo(
			@Param("tranDate")Date tranDate,
			@Param("datetime")Date datetime,
			@Param("accountNumber")String accountNumber,
			@Param("sequenceNo")Long sequenceNo);
	
	@Modifying
	@Query("DELETE FROM InvestigationLog ug WHERE ug.to_user_id =:to_user_id")
	public void deleteInvestigationLog(@Param("to_user_id") int to_user_id);
	
	@Query(value ="select customer_id\n"
			+ "from mnt_case\n"
			+ "inner join cbs_customer_profile ccp on ccp.account_id = mnt_case.account_no \n"
			+ "where id = :caseId",nativeQuery = true)
	public Integer getCaseCustomerId(@Param("caseId")Long caseId);
	
}
