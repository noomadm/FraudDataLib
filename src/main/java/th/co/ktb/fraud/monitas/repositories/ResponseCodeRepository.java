package th.co.ktb.fraud.monitas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import th.co.ktb.fraud.monitas.models.ResponseCode;

public interface ResponseCodeRepository extends CrudRepository<ResponseCode, Integer>{

	@Query("select resp from ResponseCode resp order by response_code")
	public List<ResponseCode> findResponseCode();
	
}
