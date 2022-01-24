package th.co.ktb.fraud.monitas.repositories;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.ktb.fraud.monitas.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	@Query("SELECT u FROM User u WHERE username = :username and password = :hashedPassword")
	public User authen(
			@Param("username") String username,
			@Param("hashedPassword") String hashedPassword);

	@Modifying
	@Query("UPDATE User SET LAST_LOGIN = :now WHERE id = :userId")
	public void updateLastLogin(
			@Param("userId") int userId,
			@Param("now")  Timestamp now);

	@Query("SELECT u FROM User u WHERE id = :id")
	public User findUser(@Param("id") int id);

	@Query("SELECT u FROM User u WHERE upper(username)=:name")
	public User checkUserName(@Param("name") String name);

	@Query("SELECT u FROM User u WHERE upper(username)=:name and id != :id")
	public User isUsernameExist(@Param("name") String name,@Param("id") int id);

	@Query("SELECT u FROM User u")
	public List<User> getUser();

	@Query("SELECT u FROM User u WHERE USERNAME = :username")
	public User getUserByUsername(@Param("username") String username);

	@Query("SELECT u FROM UserGroup ug JOIN ug.user u WHERE ug.group_id = :groupId or :groupId is null order by u.username")
	public List<User> getUserByGroup(@Param("groupId") int groupId);

	@Modifying
	@Query("DELETE FROM UserGroup ug WHERE ug.user_id =:user_id")
	public void deleteUserGroup(@Param("user_id") int user_id);

	@Modifying
	@Query("delete from User b where b.id =:id")
	public void deleteUser(@Param("id") int id);
	
	@Query("SELECT u FROM User u where u.active = true order by firstname,lastname")
	public List<User> getActiveUsers();

	@Query("SELECT u FROM User u order by firstname,lastname")
	public List<User> findUsers();
	
	@Query("select u from User u where id = :id")
	public User getUser(@Param("id") int id);
	
	@Query(value="select group_id from mnt_user_group where user_id = :id",nativeQuery = true)
	public List<Integer> getUserGroupId(@Param("id") int id);
	
	@Query(value="select role_id from mnt_user_role where user_id = :id",nativeQuery = true)
	public List<Integer> getUserRoleId(@Param("id") int id);
}
