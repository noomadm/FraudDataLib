package th.co.ktb.fraud.monitas.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@IdClass(UserGroupIds.class)
@Table(name = "MNT_USER_GROUP")
public class UserGroup {
	
	@Id
	@Column(insertable = false,updatable = false)
	private int user_id;
	@Id
	@Column(insertable = false,updatable = false)
	private int group_id;
	private String created_by;
	private Timestamp created_datetime;
	
	@ManyToOne
	@JoinColumn(name = "user_id",nullable = false,insertable = false,updatable = false)
	User user;
	
	@ManyToOne
	@JoinColumn(name = "group_id",nullable = false,insertable = false,updatable = false)
	Group group;
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getGroup_id() {
		return group_id;
	}
	public void setGroup_id(int group_id) {
		this.group_id = group_id;
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	
	

}
