package th.co.ktb.fraud.monitas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import th.co.ktb.fraud.monitas.models.Province;

@Repository
public interface ProvinceRepository extends CrudRepository<Province, Integer> {

	@Query("select p from Province p order by code")
	public List<Province> findProvinces();
	
}

