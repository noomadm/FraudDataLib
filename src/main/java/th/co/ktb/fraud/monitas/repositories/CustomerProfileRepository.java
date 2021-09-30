package th.co.ktb.fraud.monitas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.ktb.fraud.monitas.models.CustomerProfile;


@Repository
public interface CustomerProfileRepository extends CrudRepository<CustomerProfile, String>{
	
	@Query("select cust from CustomerProfile cust where lastname = :lastname and account_id in (:accountNumber)")
	public List<CustomerProfile> getFraudTransferAccount(
			@Param("accountNumber") List<String> accountNumber,
			@Param("lastname") String lastname);
	
	
	@Query("select count(cp) from CustomerProfile cp where last_name = :lastname and account_id = :accountNumber")
	public int hasTellerLastName(@Param("accountNumber") String accountNumber,
			@Param("lastname") String lastname);
	
	@Query("select count(cp) from CustomerProfile cp where flg_staff = 'Y' and account_id = :accountNumber")
	public int hasKTBStaff(@Param("accountNumber") String accountNumber);
	
	@Query("select cp from CustomerProfile cp where customer_id = :customerId")
	public CustomerProfile getCustomer(@Param("customerId")double customerId);
	
	@Query("select cp from CustomerProfile cp where account_id = :accountNumber")
	public CustomerProfile getCustIdByAccount(@Param("accountNumber")String accountNumber);

}
