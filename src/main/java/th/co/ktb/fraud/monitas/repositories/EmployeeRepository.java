package th.co.ktb.fraud.monitas.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import th.co.ktb.fraud.monitas.models.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, String> {

}
