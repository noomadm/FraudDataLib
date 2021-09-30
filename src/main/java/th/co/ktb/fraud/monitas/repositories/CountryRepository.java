package th.co.ktb.fraud.monitas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import th.co.ktb.fraud.monitas.models.Country;
import th.co.ktb.fraud.monitas.models.CountryCode;

@Repository
public interface CountryRepository extends CrudRepository<Country, Integer> {

	@Query("select c from Country c order by descr")
	public List<Country> findCountries();
	
	@Query("select c from CountryCode c order by country_code")
	public List<CountryCode> findCountryCode();
	
}

