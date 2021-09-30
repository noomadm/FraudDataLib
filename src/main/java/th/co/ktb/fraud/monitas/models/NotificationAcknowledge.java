package th.co.ktb.fraud.monitas.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MNT_NOTIFICATION_ACKNOWLEDGE")
public class NotificationAcknowledge {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long notification_id;
	private int user_id;
	private String type;
	private String created_by;
	private Timestamp created_datetime;
	private Boolean acknowledge;
	private String acknowledge_by;
	private Timestamp acknowledge_datetime;
	
	/*@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "notification_id",nullable = false)*/
	//private Notification notification;
	
	public long getNotification_id() {
		return notification_id;
	}
	public void setNotification_id(long notification_id) {
		this.notification_id = notification_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public Timestamp getCreated_datetime() {
		return created_datetime;
	}
	public void setCreated_datetime(Timestamp created_datetime) {
		this.created_datetime = created_datetime;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	/*public Notification getNotification() {
		return notification;
	}
	public void setNotification(Notification notification) {
		this.notification = notification;
	}*/
	public Boolean getAcknowledge() {
		return acknowledge;
	}
	public void setAcknowledge(Boolean acknowledge) {
		this.acknowledge = acknowledge;
	}
	public String getAcknowledge_by() {
		return acknowledge_by;
	}
	public void setAcknowledge_by(String acknowledge_by) {
		this.acknowledge_by = acknowledge_by;
	}
	public Timestamp getAcknowledge_datetime() {
		return acknowledge_datetime;
	}
	public void setAcknowledge_datetime(Timestamp acknowledge_datetime) {
		this.acknowledge_datetime = acknowledge_datetime;
	}
	
	
}
