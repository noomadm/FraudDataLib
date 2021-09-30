package th.co.ktb.fraud.monitas.repositories;


import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.ktb.fraud.monitas.models.Case;


@Repository
public interface CaseRepository extends PagingAndSortingRepository<Case, Long> {

	@Query( value =  "SELECT "
			+ "c.id,c.created_by,c.created_datetime,"
			+ "c.alert_id,c.status,c.alert_datetime,"
			+ "c.account_no,"
			+ "c.primary_cif,c.user_id,"
			+ "c.amount,r.description,c.teller_id,"
			+ "dtj.branch_code,"
			+ "dtj.external_trans_code as trxn_code,"
			+ "cc.conv_cif_id,"
			+ "ccp.profile_creationdate  ,"
			+ "ccp.branch_id ,"
			+ "dtj.trans_amount,"
			+ "r.rule_name "
			+ "FROM mnt_case c "
			+ "inner join mnt_rule r on c.rule_id = r.id "
			+ "left join mnt_dtj dtj on (\n"
			+ "				c.json_data is not null \n"
			+ "				and to_timestamp(cast(c.json_data -> 'dtjId' ->> 'date_time' as int8) / 1000) = dtj.date_time \n"
			+ "				and to_timestamp(cast(c.json_data -> 'dtjId' ->> 'trans_date' as int8) / 1000) = dtj.trans_date\n"
			+ "				and c.json_data -> 'dtjId' ->> 'account_number' = dtj.account_number \n"
			+ "				and cast(c.json_data -> 'dtjId' ->> 'trans_sequence_no' as int8) = dtj.trans_sequence_no \n"
			+ "			)\n"
			+ "			left join cbs_customer_profile ccp on ccp.account_id = c.account_no \n"
			+ "			left join cbs_cust cc on cast(cc.cust_id as int8) = ccp.customer_id "
			+ "WHERE c.status not in ('CLOSED_FRAUD','CLOSED_NOT_FRAUD','FORCE_CLOSED','CLOSED_SUSPECT') "
			+ "and ( upper(trxn_code) like %:keyword% "
			+ "or upper(account_no) like %:keyword% "
			+ "or upper(alert_id) like %:keyword%) "
			+ "and c.user_id = :userId "
			+ "and (:area is null or upper(c.area) = :area)",nativeQuery = true)
	public Page<Map<String,Object>> findTask(
			@Param("keyword") String keyword,
			@Param("area") String area,
			@Param("userId") int userId,
			Pageable pagable);
	
	@Query( value =  "SELECT count(*) "
			+ "FROM mnt_case c "
			+ "inner join mnt_rule r on c.rule_id = r.id "
			+ "WHERE c.status not in ('CLOSED_FRAUD','CLOSED_NOT_FRAUD','FORCE_CLOSED','CLOSED_SUSPECT') "
			+ "and user_id = :userId "
			+ "",nativeQuery = true)
	public Integer taskCount(
			@Param("userId") int userId);
	
	

}
