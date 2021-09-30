package th.co.ktb.fraud.monitas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.ktb.fraud.monitas.models.FraudType;


@Repository
public interface FraudTypeRepository extends CrudRepository<FraudType, Integer> {
	
	@Query("select status from FraudType status")
	public List<FraudType> findStatus();
	
	@Query("select ft from FraudType ft order by ft.name")
	public List<FraudType> getByArea(@Param("area") String area);
	
	@Query("select ft from FraudType ft where name = :name and id != :id and area = :area")
	public FraudType checkDuplicateName(
			@Param("id") int id,
			@Param("name") String name,
			@Param("area") String area);
	
}
