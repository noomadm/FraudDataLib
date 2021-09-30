package th.co.ktb.fraud.monitas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import th.co.ktb.fraud.monitas.models.TransactionType;

@Repository
public interface TransactionTypeRepository extends CrudRepository<TransactionType, String>{

	@Query(value = "select distinct type from mnt_transaction_type order by type",nativeQuery = true)
	public List<String> getTransactionTypes();
	
	@Query(value = "select distinct channel from mnt_transaction_type order by channel",nativeQuery = true)
	public List<String> getChannels();
	
	@Query(value = "select distinct mode from mnt_transaction_type order by mode",nativeQuery = true)
	public List<String> getModes();
	
	@Query(value = "select distinct trxn_code from mnt_transaction_type mtt order by trxn_code ", nativeQuery = true)
	public List<String> findTransCode();
	
}
