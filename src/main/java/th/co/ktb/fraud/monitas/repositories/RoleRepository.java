package th.co.ktb.fraud.monitas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.ktb.fraud.monitas.models.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
	
	@Modifying
	@Query("delete from Role b where b.id = :id")
	public void deleteRole(@Param("id") int id);
	
	@Query("SELECT u FROM Role u WHERE id = :id")
	public Role findRole(@Param("id") int id);
	
	@Query("SELECT u FROM Role u WHERE upper(role) = :role and id != :id")
	public Role findRoleName(@Param("role") String role,@Param("id") int id);
	
	@Query("SELECT u FROM Role u")
	public List<Role> findRoleList();

}
