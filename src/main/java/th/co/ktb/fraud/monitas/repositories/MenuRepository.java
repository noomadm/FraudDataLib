package th.co.ktb.fraud.monitas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.ktb.fraud.monitas.models.Menu;

@Repository
public interface MenuRepository extends CrudRepository<Menu, Long> {
	
	@Query("SELECT m FROM Menu m WHERE upper(req_permission) IN (:req_permission) and m.active = true")
	public List<Menu> findMenu(@Param("req_permission") List<String> req_permission);
}
