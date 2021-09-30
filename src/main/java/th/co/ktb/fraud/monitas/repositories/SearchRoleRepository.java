package th.co.ktb.fraud.monitas.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.ktb.fraud.monitas.models.Role;

@Repository
public interface SearchRoleRepository extends PagingAndSortingRepository<Role, Integer> {

	@Query("SELECT c FROM Role c WHERE "
			+ "( upper(role) like %:keyword% "
			+ "or upper(description) like %:keyword% )")
	public Page<Role> findRole(@Param("keyword") String keyword,Pageable pagable);
}
