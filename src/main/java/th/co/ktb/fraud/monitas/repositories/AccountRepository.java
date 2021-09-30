package th.co.ktb.fraud.monitas.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.ktb.fraud.monitas.models.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long>{

	//join from customer profile
	@Query(value = "select ac.*,cust.account_id as account_no,card.card_no,card.limit_profile_name,salt.mobileno,salt.registerdate\n"
			+ "from cbs_account_additional_info ac \n"
			+ "left join cbs_customer_profile cust on ac.account_id = cast(cust.account_id as numeric)\n"
			+ "left join cbs_crdi_info cinfo on cinfo.account_id = cust.account_id\n"
			+ "left join cbs_crdi card on card.card_no = cinfo.card_no\n"
			+ "left join cbs_smsalt_by_acct salt on salt.account_id = cust.account_id \n"
			+ "left JOIN cbs_product_list pl ON cast(cust.product_type as int4) = pl.type \n"
			+ "where cust.customer_id = :custId "
			+ "and pl.grp2 = :type",nativeQuery = true)
	public List<Map<String,Object>> getAccountList(
			@Param("custId") double custId,
			@Param("type") String type);
	
}
