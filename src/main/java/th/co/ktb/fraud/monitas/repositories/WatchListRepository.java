package th.co.ktb.fraud.monitas.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.ktb.fraud.monitas.models.Case;
import th.co.ktb.fraud.monitas.models.WatchList;

@Repository
public interface WatchListRepository extends CrudRepository<WatchList, Integer>{

	@Query("select wl from WatchList wl where :keyword = :keyword")
	public Page<WatchList> search(@Param("keyword") String keyword,Pageable pagable);
	
	@Query("select wl from WatchList wl where active = true")
	public List<WatchList> getActiveWatchlist();
	
	@Query("select c "
			+ "from Case c "
			+ "where status not like '%CLOSED%' "
			+ "and teller_id = :teller_id")
	public List<Case> countExistTellerCase(@Param("teller_id") String teller_id);
	
	@Query("select c "
			+ "from Case c "
			+ "where status not like '%CLOSED%' "
			+ "and primary_cif = :primary_cif")
	public List<Case> countExistCIFCase(@Param("primary_cif") String primary_cif);
	
	@Query("select c "
			+ "from Case c "
			+ "where status not like '%CLOSED%' "
			+ "and account_no = :account_no")
	public List<Case> countExistAccountCase(@Param("account_no") String account_no);
	
}
