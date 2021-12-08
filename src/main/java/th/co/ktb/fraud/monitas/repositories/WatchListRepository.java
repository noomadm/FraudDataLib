package th.co.ktb.fraud.monitas.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import th.co.ktb.fraud.monitas.models.WatchList;

@Repository
public interface WatchListRepository extends CrudRepository<WatchList, Integer>{

	
	
}
