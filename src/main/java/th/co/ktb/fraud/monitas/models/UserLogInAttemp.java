package th.co.ktb.fraud.monitas.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "MNT_USER_LOGIN_ATTEMP")
public class UserLogInAttemp {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long id;
	protected int user_id;
	protected String ip;
	//@javax.persistence.Temporal(TemporalType.TIMESTAMP)
	//@javax.persistence.Column(updatable = false,insertable = true)
	protected Timestamp login_time;
	protected int session_minute;
	protected String bearer_key;
	protected String client_name;
	protected String browser_info;
	protected boolean active;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	public Timestamp getLogin_time() {
		return login_time;
	}
	public void setLogin_time(Timestamp login_time) {
		this.login_time = login_time;
	}
	public int getSession_minute() {
		return session_minute;
	}
	public void setSession_minute(int session_minute) {
		this.session_minute = session_minute;
	}
	public String getBearer_key() {
		return bearer_key;
	}
	public void setBearer_key(String bearer_key) {
		this.bearer_key = bearer_key;
	}
	public String getClient_name() {
		return client_name;
	}
	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}
	public String getBrowser_info() {
		return browser_info;
	}
	public void setBrowser_info(String browser_info) {
		this.browser_info = browser_info;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
}
