package th.co.ktb.fraud.monitas.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.ktb.fraud.monitas.models.FraudType;

@Repository
public interface FraudTypeSearchRepository extends PagingAndSortingRepository<FraudType, Integer>{

	@Query("select ft from FraudType ft where upper(name) like %:keyword%")
	public Page<FraudType> search(
			@Param("keyword") String keyword,
			Pageable pageable);
	
}
