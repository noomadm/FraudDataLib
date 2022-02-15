package th.co.ktb.fraud.monitas.repositories;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.ktb.fraud.monitas.models.Case;
import th.co.ktb.fraud.monitas.models.Rule;
import th.co.ktb.fraud.monitas.models.TellerAccountResult;

@Repository
public interface RuleRepository extends CrudRepository<Rule, Integer>{

	@Query("select new TellerAccountResult( dtj.user_id,dtj.account_number ,count(*) as trans_count) "
			+ "			from DTJ dtj "
			+ "			where "
			+ "			external_trans_code in (:tranTypes) "
			+ "			and trans_date = :tranDate"
			+ "			and trans_amount >= :tranAmount "
			+ "			and (user_id is not null or trim(user_id) <> '')"
			+ "			GROUP BY user_id,account_number"
			+ "			having count(*) >= :tranCount and sum(case when detected_date is null then 1 else 0 end) > 0 "
			+ "			ORDER BY count(*) desc")
	public List<TellerAccountResult> getAccountTTWID(
			@Param("tranTypes")List<String> tranTypes,
			@Param("tranAmount")double tranAmount,
			@Param("tranCount")long tranCount,
			@Param("tranDate")Date tranDate);
	
	@Query("select c from Case c where status = 'WATCHING' and teller_id = :tellerId and account_no = :account_number and rule_id = :ruleId order by alert_datetime desc")
	public List<Case> getWatchingList(
			@Param("tellerId") String tellerId,
			@Param("account_number") String account_number,
			@Param("ruleId") int ruleId);
	
	@Query("select rule from Rule rule where active = true")
	public List<Rule> getActiveRuleList();
	
	@Query("select new TellerAccountResult( dtj.user_id,dtj.account_number ,count(*) as trans_count,sum(trans_amount)) "
			+ "			from DTJ dtj "
			+ "			where "
			+ "			external_trans_code in (:tranTypes) "
			+ "			and trans_date = :tranDate"
			+ "			and (user_id is not null or trim(user_id) <> '')"
			+ "			GROUP BY user_id,account_number"
			+ "			having sum(trans_amount) >= :sumAmount and sum(case when detected_date is null then 1 else 0 end) > 0 "
			+ "			ORDER BY count(*) desc")
	public List<TellerAccountResult> getTransactionSumOver(
			@Param("tranTypes") List<String> tranTypes,
			@Param("sumAmount") double sumAmount,
			@Param("tranDate") Date tranDate);
	
	@Query("select new TellerAccountResult( dtj.user_id,dtj.account_number ,count(*) as trans_count,sum(trans_amount)) "
			+ "			from DTJ dtj "
			+ "			where "
			+ "			external_trans_code in (:tranTypes) "
			+ "			and trans_date = :tranDate"
			+ "			and trans_amount >= :tranAmount "
			+ "			and (user_id is not null or trim(user_id) <> '')"
			+ "			GROUP BY user_id,account_number"
			+ "			having sum(trans_amount) >= :tranAmount and sum(case when detected_date is null then 1 else 0 end) > 0 "
			//+ "			having sum(trans_amount) >= :tranAmount"
			+ "			ORDER BY count(*) desc")
	public List<TellerAccountResult> getTellerAmountOver(
			@Param("tranTypes") List<String> tranTypes,
			@Param("tranAmount") double tranAmount,
			@Param("tranDate") Date tranDate);
	
	@Query("select new TellerAccountResult( dtj.user_id,dtj.account_number ,count(*) as trans_count,sum(trans_amount)) "
			+ "			from DTJ dtj "
			+ "			where "
			+ "			external_trans_code in (:tranTypes) "
			+ "			and trans_date = :tranDate"
			+ "			and (trans_amount < 0 and trans_amount <= :tranAmount) "
			+ "			and (user_id is not null or trim(user_id) <> '')"
			+ "			GROUP BY user_id,account_number "
			+ "			HAVING sum(case when detected_date is null then 1 else 0 end) > 0 "
			+ "			ORDER BY count(*) desc")
	public List<TellerAccountResult> getTellerCancelTransaction(
			@Param("tranTypes") List<String> tranTypes,
			@Param("tranAmount") double tranAmount,
			@Param("tranDate") Date tranDate);
	
	@Query("select new TellerAccountResult( dtj.user_id,dtj.account_number ,count(*) as trans_count,sum(trans_amount)) "
			+ "			from DTJ dtj "
			+ "			where "
			+ "			external_trans_code in (:tranTypes) "
			+ "			and trans_date = :tranDate"
			+ "			and (trans_amount < 0 and trans_amount <= :tranAmount) "
			+ "			and (user_id is not null or trim(user_id) <> '')"
			+ "			GROUP BY user_id,account_number"
			+ "			having count(*) >= :transCount and sum(case when detected_date is null then 1 else 0 end) > 0 "
			+ "			ORDER BY count(*) desc")
	public List<TellerAccountResult> getTellerCancelTransaction(
			@Param("tranTypes")List<String> tranTypes,
			@Param("tranAmount")double tranAmount,
			@Param("transCount")long transCount,
			@Param("tranDate")Date tranDate);
	
	@Query("select r from Rule r where active = true order by rule_name")
	public List<Rule> findRules();
	
	
}
