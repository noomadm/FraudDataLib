package th.co.ktb.fraud.monitas.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.ktb.fraud.monitas.models.UserRole;

@Repository
public interface UserRoleRepository extends CrudRepository<UserRole, Integer> {
	
	@Modifying
	@Query("DELETE FROM UserRole ur WHERE ur.user_id =:user_id")
	public void deleteUserRole(@Param("user_id") int user_id);
	
	@Modifying
	@Query("DELETE FROM UserRole ur WHERE ur.role_id =:role_id")
	public void deleteByRoleId(@Param("role_id") int role_id);
}
