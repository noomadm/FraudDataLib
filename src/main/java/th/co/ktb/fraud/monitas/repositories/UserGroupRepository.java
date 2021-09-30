package th.co.ktb.fraud.monitas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.ktb.fraud.monitas.models.UserGroup;
import th.co.ktb.fraud.monitas.models.UserGroupId;

@Repository
public interface UserGroupRepository extends CrudRepository<UserGroup, UserGroupId> {

	@Modifying
	@Query("DELETE FROM UserGroup ur WHERE ur.user_id =:user_id")
	public void deleteUserGroup(@Param("user_id") int user_id);
	
	@Modifying
	@Query("delete from UserGroup ur where ur.group_id = :groupId")
	public void clearUsersInGroups(@Param("groupId") int groupId);
	
	@Query("select ug.user_id from UserGroup ug where group_id in (:groupId)")
	public List<Integer> getUsersInGroups(@Param("groupId") List<Integer> groupId);
}
