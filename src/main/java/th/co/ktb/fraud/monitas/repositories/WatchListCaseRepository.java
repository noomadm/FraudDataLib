package th.co.ktb.fraud.monitas.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import th.co.ktb.fraud.monitas.models.WatchListCase;
import th.co.ktb.fraud.monitas.models.WatchListCaseId;

@Repository
public interface WatchListCaseRepository extends CrudRepository<WatchListCase, WatchListCaseId>{

}
