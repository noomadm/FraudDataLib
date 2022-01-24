package th.co.ktb.fraud.monitas.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.ktb.fraud.monitas.models.User;

@Repository
public interface SearchUserRepository extends PagingAndSortingRepository<User, Integer> {

	@Query("SELECT c FROM User c WHERE "
			+ "( upper(username) like %:keyword% "
			+ "or upper(firstname) like %:keyword% "
			+ "or upper(lastname) like %:keyword% "
			+ "or upper(email) like %:keyword% "
			+ "or mobile like %:keyword%)")
	public Page<User> findUser(@Param("keyword") String keyword,Pageable pagable);
}
