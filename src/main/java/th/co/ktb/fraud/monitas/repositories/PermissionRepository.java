package th.co.ktb.fraud.monitas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.ktb.fraud.monitas.models.Permission;

@Repository
public interface PermissionRepository extends CrudRepository<Permission, Integer> {
	
	@Modifying
	@Query("delete from Permission b where b.role_id =:role_id")
	public void clearRolePermissions(@Param("role_id") int role_id);
	
	@Query("SELECT u FROM Permission u WHERE permission = :permission")
	public Permission findPermission(@Param("permission") String permission);
	
	@Query("SELECT u FROM Permission u WHERE role_id = :role_id order by permission")
	public List<Permission> permissionList(@Param("role_id") int role_id);
	
	@Query("SELECT u.permission FROM Permission u WHERE role_id = :role_id order by permission")
	public List<String> getRolePermissions(@Param("role_id") int role_id);
	
	@Query("SELECT distinct p.permission FROM Permission p JOIN UserRole ur ON p.role_id = ur.role_id WHERE ur.user_id=:user_id")
	public List<String> getUserPermission(@Param("user_id") int user_id);
	
}
