package th.co.ktb.fraud.monitas.repositories;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityResult;
import javax.persistence.FieldResult;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.ktb.fraud.monitas.models.DTJ;
import th.co.ktb.fraud.monitas.models.PatternAnalysis;

@SqlResultSetMapping(
        name = "PatternAnalysis",
        entities = @EntityResult(
                entityClass = PatternAnalysis.class,
                fields = {
                		
                	@FieldResult(name = "user_id", column = "user_id"),
                    @FieldResult(name = "area", column = "area"),
                    @FieldResult(name = "trans_date", column = "trans_date"),
                    @FieldResult(name = "trans_amount", column = "trans_amount"),
                	@FieldResult(name = "to_ac_no", column = "to_ac_no"),
                	@FieldResult(name = "ending_balance", column = "ending_balance"),
                	@FieldResult(name = "trxn_branch_name", column = "trxn_branch_name"),
                	@FieldResult(name = "trxn_branch_province", column = "trxn_branch_province"),
                	@FieldResult(name = "date_time", column = "date_time"),
                	@FieldResult(name = "trans_type", column = "trans_type"),
                	@FieldResult(name = "to_cust_name", column = "to_cust_name"),
                	@FieldResult(name = "to_ac_name", column = "to_ac_name"),
                	@FieldResult(name = "to_branch_name", column = "to_branch_name"),
                	@FieldResult(name = "trans_amount", column = "trans_amount"),
                	@FieldResult(name = "to_branch_code", column = "to_branch_code")
                 }
            )
        )

@Repository
public interface PatternAnalysisRepository extends PagingAndSortingRepository<DTJ, Long>{
	
	
	
	@Query(value = "select \n"
		+ "	dtj.user_id,\n"
		+ "	dtj.area,\n"
		+ "	dtj.trans_date,\n"
		+ "	dtj.trans_amount,\n"
		+ "	dtj.account_number as to_ac_no,\n"
		+ "	dtj.trans_trace_number,\n"
		+ "	dtj.response_code,\n"
		+ "	dtj.ending_balance,\n"
		+ "	dtj.branch_code,\n"
		+ "	branch.branch_name as trxn_branch_name,\n"
		+ "	branch.branch_state as trxn_branch_province,\n"
		+ "	dtj.date_time,\n"
		+ "	dtj.trans_type,\n"
		+ "	concat(title,' ',first_name,' ',last_name) as to_cust_name,\n"
		+ "	acctname as to_ac_name,\n"
		+ "	branch.branch_name as to_branch_name,\n"
		+ "	dtj.branch_code as to_branch_code,\n"
		+ " tt.mode,tt.channel,tt.type "
		+ "from mnt_dtj dtj\n"
		+ "left join cbs_account_additional_info account on cast(dtj.account_number as int8) = account.account_id\n"
		+ "left join cbs_customer_profile profile on dtj.account_number = profile.account_id\n"
		+ "left join cbs_branch_list branch on cast(dtj.branch_code as int4) = branch.branch_id\n"
		+ "left join mnt_transaction_type tt on tt.trxn_code = dtj.external_trans_code\n"
		+ "where trans_date between :startDate and :endDate "
		+ "and account_number = :accountNumber",
		nativeQuery = true)
	public List<Map<String,Object>> findPatternAnalysis(
			@Param("startDate") Date startDate,
			@Param("endDate") Date endDate,
			@Param("accountNumber") String accountNumber);
}
