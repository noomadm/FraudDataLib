package th.co.ktb.fraud.monitas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import th.co.ktb.fraud.monitas.models.Product;

public interface ProductRepository extends CrudRepository<Product,Integer>{

	@Query("select distinct p.grp2 from Product p order by grp2")
	public List<String> findProductList(); 
	
}
