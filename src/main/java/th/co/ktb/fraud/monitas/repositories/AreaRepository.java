package th.co.ktb.fraud.monitas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import th.co.ktb.fraud.monitas.models.Area;

public interface AreaRepository extends CrudRepository<Area, String>{

	@Query("select a from Area a order by area")
	public List<Area> getAll();
	
}
