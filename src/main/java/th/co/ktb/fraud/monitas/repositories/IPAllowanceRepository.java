package th.co.ktb.fraud.monitas.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import th.co.ktb.fraud.monitas.models.IPAllowance;

@Repository
public interface IPAllowanceRepository extends CrudRepository<IPAllowance, Integer>{

	@Query("select allow from IPAllowance allow")
	public Page<IPAllowance> search(Pageable pagable);
	
}
