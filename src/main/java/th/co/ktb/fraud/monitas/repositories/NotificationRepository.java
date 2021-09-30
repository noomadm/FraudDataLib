package th.co.ktb.fraud.monitas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.ktb.fraud.monitas.models.Notification;
import th.co.ktb.fraud.monitas.models.NotificationAcknowledge;

@Repository
public interface NotificationRepository extends CrudRepository<Notification, Long>{

	@Query("SELECT act from NotificationAcknowledge act where user_id = :userId and acknowledge = false")
	public List<NotificationAcknowledge> getUnactknowledgeNotice(@Param("userId") int userId);
	
	@Modifying
	@Query("UPDATE NotificationAcknowledge "
			+ "set acknowledge = true,"
			+ "acknowledge_datetime = NOW(),"
			+ "acknowledge_by = :username "
			+ "where id = :acknowledgeId ")
	public void acknowledge(@Param("acknowledgeId") long acknowledgeId,@Param("username") String username);
	
	@Modifying
	@Query("UPDATE NotificationAcknowledge "
			+ "set "
			+ "type = 'CLEAR' "
			+ "where notification_id = :noticeId ")
	public void clearOtherUserNotice(@Param("noticeId") long noticeId);
	
	
}
