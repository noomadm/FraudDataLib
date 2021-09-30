package th.co.ktb.fraud.monitas.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.ktb.fraud.monitas.models.Group;

@Repository
public interface SearchGroupRepository extends PagingAndSortingRepository<Group, Integer> {

	@Query("SELECT c FROM Group c WHERE "
			+ "( upper(group_name) like %:keyword% "
			+ "or upper(description) like %:keyword% )")
	public Page<Group> findGroup(@Param("keyword") String keyword,Pageable pagable);
}
