package th.co.ktb.fraud.monitas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.ktb.fraud.monitas.models.Group;

@Repository
public interface GroupRepository extends CrudRepository<Group, Integer> {

	@Query("SELECT u FROM Group u WHERE upper(group_name)=:name and id != :id")
	public Group checkGroupName(@Param("name") String name,@Param("id") int id);

	@Query("SELECT u FROM Group u order by group_name asc")
	public List<Group> findGroupList();

	@Query("SELECT u FROM Group u WHERE id = :id")
	public Group findGroup(@Param("id") int id);

	@Modifying
	@Query("delete from Group b where b.id =:id")
	public void deleteGroup(@Param("id") int id);

	@Modifying
	@Query("DELETE FROM UserGroup ug WHERE ug.group_id =:id")
	public void deleteUserGroup(@Param("id") int id);
	
	@Query("SELECT ug.user_id FROM UserGroup ug WHERE ug.group_id = :groupId")
	public List<Integer> getUserInGroup(@Param("groupId") int groupId);

}
