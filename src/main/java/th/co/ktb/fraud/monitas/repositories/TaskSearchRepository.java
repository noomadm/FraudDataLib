package th.co.ktb.fraud.monitas.repositories;

import java.sql.Date;
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
public interface TaskSearchRepository extends PagingAndSortingRepository<Case, Long>{

	@Query(value = 
			"select\n"
			+ "task.id as id,        "
			+ "cast(task.alert_id as varchar),\n"
			+ "				cast(task.status as varchar),\n"
			+ "				cast(task.alert_datetime as timestamp),\n"
			+ "				cast(r.rule_name as varchar),\n"
			+ "				cast(task.trxn_code as varchar),\n"
			+ "				cast(task.account_no as varchar),\n"
			+ "				cast(task.account_open_date as date),\n"
			+ "				cast(task.primary_cif as varchar),\n"
			+ "				cast(task.cif_branch as varchar),\n"
			+ "				cast(task.teller_id as varchar),\n"
			+ "				cast(task.amount as numeric),\n"
			+ "				cast(task.user_id as int4)\n"
			+ "    from\n"
			+ "        mnt_case task \n"
			+ "    left join\n"
			+ "        mnt_user u \n"
			+ "            on task.user_id = u.id \n"
			+ "    left join\n"
			+ "        mnt_user_group ug \n"
			+ "            on u.id = ug.user_id \n"
			+ "		left join mnt_rule r on r.id = rule_id\n"
			+ "where task.alert_datetime between :startDate and :endDate \n"
			+ "and (:owners is null and task.user_id in (:owners))\n"
			+ "and (:groupIds is null and ug.group_id in (:groupIds))\n"
			//+ "and (:userIds is null and u.id in (:userIds))\n"
			+ "and (:alertStatus is null and task.status in (:alertStatus))\n"
			//+ "and (:ruleIds is null and task.rule_id in (:ruleIds))\n"
			+ "\n"
			+ "",nativeQuery = true)
	public Page<Map<String,Object>> search(
			@Param("startDate") Date startDate,
			@Param("endDate") Date endDate,
			//List<String> accountTypes,
			@Param("owners") List<Integer> owners,
			//String keyword,
			@Param("groupIds") List<Integer> groupIds,
			//@Param("userIds") List<Integer> userIds,
			@Param("alertStatus") List<String> alertStatus,
			//@Param("ruleIds") List<Integer> ruleIds,
			//List<String> channels,
			//List<String> transactionCodes,
			//Double fromBalance,
			//Double toBalance,
			//List<String> transactionBranch,
			//List<String> transactionCountry,
			//List<String> transactionProvince,
			//List<String> respCode,
			Pageable pageable);

	@Query("select distinct ug.user_id from UserGroup ug where ug.group_id in (:groupIds)")
	public List<Integer> getUserInGroups(@Param("groupIds") List<Integer> groupIds);

	
}
