package th.co.ktb.fraud.monitas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import th.co.ktb.fraud.monitas.models.Branch;

@Repository
public interface BranchRepository extends CrudRepository<Branch, Integer> {

	@Query("select b from Branch b order by branch_type")
	public List<Branch> findBranchs();
	
}
