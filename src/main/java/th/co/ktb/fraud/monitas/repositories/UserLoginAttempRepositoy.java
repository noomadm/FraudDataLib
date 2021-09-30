package th.co.ktb.fraud.monitas.repositories;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.ktb.fraud.monitas.models.User;
import th.co.ktb.fraud.monitas.models.UserLogInAttemp;

@Repository
public interface UserLoginAttempRepositoy extends CrudRepository<UserLogInAttemp, Long> {

	@Modifying
	@Query("UPDATE UserLogInAttemp SET active = false WHERE active = true AND user_id = :userId" )
	public void disablePreviousLoginAttemp(@Param("userId") int userId);
	
	@Query("select attemp from UserLogInAttemp attemp where bearer_key = :token and active = true")
	public UserLogInAttemp isTokenValid(@Param("token") String token);
	
	@Query("select user from User user where username = :username")
	public User getUser(@Param("username") String username);
	
	@Modifying
	@Query("update UserLogInAttemp set active = false where bearer_key = :token")
	public void logout(@Param("token") String token);

}
