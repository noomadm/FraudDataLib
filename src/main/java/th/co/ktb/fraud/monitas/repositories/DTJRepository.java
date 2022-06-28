package th.co.ktb.fraud.monitas.repositories;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import th.co.ktb.fraud.monitas.models.DTJ;
import th.co.ktb.fraud.monitas.models.DTJIds;



public interface DTJRepository extends CrudRepository<DTJ, Long>{

	@Query( value = "select dtj "
			+ "			from DTJ dtj "
			+ "			where "
			+ "			external_trans_code in (:tranTypes) "
			+ "			and trans_date = :tranDate"
			+ "			and trans_amount >= :tranAmount "
			+ "			and (user_id is not null or trim(user_id) <> '')"
			+ "			and account_number = :account_number "
			)
	public List<DTJ> getTTWIDTransaction(
			@Param("tranTypes") List<String> tranTypes,
			@Param("account_number") String account_number,
			@Param("tranAmount") double tranAmount,
			@Param("tranDate") Date tranDate);
	
	@Query("select dtj "
			+ "			from DTJ dtj "
			+ "			where "
			+ "			external_trans_code in (:tranTypes) "
			+ "			and trans_date = :tranDate"
			+ "			and user_id = :userId")
	public List<DTJ> getTellerTransactions(
			@Param("tranTypes") List<String> tranTypes,
			@Param("userId") String userId,
			@Param("tranDate") Date tranDate);
	
	@Query("select dtj "
			+ "			from DTJ dtj "
			+ "			where "
			+ "			external_trans_code in (:tranTypes) "
			+ "			and trans_date = :tranDate"
			+ "			and account_number = :accountNumber")
	public List<DTJ> getAccountTransactions(
			@Param("tranTypes") List<String> tranTypes,
			@Param("accountNumber") String accountNumber,
			@Param("tranDate") Date tranDate);
	
	@Query("select dtj "
			+ "			from DTJ dtj "
			+ "			where "
			+ "			external_trans_code in (:tranTypes) "
			+ "			and trans_date = :tranDate"
			+ "			and account_number = :accountNumber"
			+ "			and user_id = :userId")
	public List<DTJ> getTellerTransactions(
			@Param("tranTypes") List<String> tranTypes,
			@Param("userId") String userId,
			@Param("accountNumber") String accountNumber,
			@Param("tranDate") Date tranDate);
	
	@Query("select dtj "
			+ "			from DTJ dtj "
			+ "			where "
			+ "			external_trans_code in (:tranTypes) "
			+ "			and trans_date = :tranDate"
			+ "			and account_number = :accountNumber"
			+ "			order by sequence_no ")
	public List<DTJ> getTransacitonByTransType(
			@Param("tranTypes") List<String> tranTypes,
			@Param("accountNumber") String accountNumber,
			@Param("tranDate") Date tranDate);
	
	@Query("select dtj "
			+ "from DTJ dtj "
			+ "where account_number = :accountNumber "
			+ "and trans_date between :startDate and :endDate "
			+ "order by trans_date desc,trans_sequence_no desc")
	public List<DTJ> getTransactionByAccount(
			@Param("startDate")Date startDate,
			@Param("endDate")Date endDate,
			@Param("accountNumber")String accountNumber);
	
	@Query(value="select matrutiy_date from cbs_account_additional_info where :accountNumber != 'NA' and account_id = cast(:accountNumber as int8)",nativeQuery = true)
	public Timestamp getAccountMatrutiyDate(@Param("accountNumber")String accountNumber);
	
	@Query(value="select count(*) from mnt_dtj where trans_date between :startDate and :endDate and account_number = :accountNumber and external_trans_code in (:tranTypes)",
			nativeQuery = true)
	public Long countTransactionWithinDate(
			@Param("accountNumber")String accountNumber,
			@Param("startDate")Date startDate,
			@Param("endDate")Timestamp endDate,
			@Param("tranTypes")List<String> tranTypes);
	
	@Query(value="select * from mnt_dtj where trans_date = :trans_date and account_number = :account_number and trans_sequence_no = :trans_sequence_no",nativeQuery = true)
	public DTJ get(Date trans_date,String account_number,int trans_sequence_no);
	
	@Modifying
	@Query(value="delete from mnt_dtj where trans_date = :trans_date and account_number = :account_number and trans_sequence_no = :trans_sequence_no",nativeQuery = true)
	public DTJ delete(Date trans_date,String account_number,int trans_sequence_no);
	
	@Query(value="select dtj from DTJ dtj "
			+ "where trans_date between :startDate and :endDate "
			+ "and (:accountNumber is null or trim(:accountNumber) = '' or upper(account_number) like :accountNumber% ) "
			//+ "and (:transSequence is null or cast(trans_sequence_no as varchar) = cast(:transSequence as varchar) ) "
			+ "and (:externalTransType is null or trim(:externalTransType) = '' or upper(external_trans_code) like :externalTransType% )"
			+ ""
			)
	public Page<DTJ> search(
			@Param("startDate") Date startDate,
			@Param("endDate") Date endDate,
			@Param("accountNumber") String accountNumber,
			//@Param("transSequence") Integer transSequence,
			@Param("externalTransType") String externalTransType,
			Pageable pagable);
	
	@Query("select "
			+ "case when max(dtj.trans_sequence_no) is null then 1 else (max(dtj.trans_sequence_no) + 1) end "
			+ "from DTJ dtj where account_number = :accountNumber and date_time = :dateTime")
	public int getNewSequenceNo(
			@Param("accountNumber") String accountNumber,
			@Param("dateTime") Date dateTime);
	
	/*@Query(value = "select count(*) "
			+ "from mnt_dtjfm "
			+ "where trans_date = :date "
			+ "and account_number like :accountNumber "
			+ "and data_item_changed like '%STAT%' "
			+ "and trim(new_value_unformat) = '0' "
			+ "and (old_value like '1%' or old_value like '2%')",nativeQuery = true)*/
	@Query(value = "select count(*) "
			+ "from kafka_account_maintenance "
			+ "where trans_date = :date "
			+ "and data_item_changed like '%STAT%' "
			+ "and account_number = :accountNumber "
			+ "and new_value_unformat = '0' "
			+ "and (old_value like '1%' or old_value like '2%') ",nativeQuery = true)
	public Integer hasChangeStatusToActive(@Param("accountNumber")String accountNumber,@Param("date")Date date);
}
