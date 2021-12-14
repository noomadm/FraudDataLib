package th.co.ktb.fraud.monitas.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.ktb.fraud.monitas.models.WatchList;

@Repository
public interface WatchListRepository extends CrudRepository<WatchList, Integer>{

	@Query("select wl from WatchList wl where :keyword = :keyword")
	public Page<WatchList> search(@Param("keyword") String keyword,Pageable pagable);
	
}
