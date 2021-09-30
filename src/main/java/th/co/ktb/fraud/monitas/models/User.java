package th.co.ktb.fraud.monitas.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;


@Entity
@Table(name = "MNT_USER")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Size(min = 5, max = 50, message = "Username must be 5-50 characters long.")
	@NotNull(message = "Username is required")
	@NotBlank(message = "Username is required")
	//@Min(value = 5,message = "Username must more than 5 characters")
	//@Pattern(regexp = "^[a-zA-Z0-9]{5,50}$",message = "Username allow letter A-Z, a-z, 0-9 only")
	private String username;
	
	private String password;
	
	/*@Size(min = 1, max = 250, message = "Email must be 1-250 characters long.")
	@NotNull(message = "Email is required")
	@NotBlank(message = "Email is required")*/
	private String email;
	
	/*@Size(min = 1, max = 250, message = "Firstname must be 1-250 characters long.")
	@NotNull(message = "Firstname is required")
	@NotBlank(message = "Firstname is required")*/
	private String firstname;
	
	/*@Size(min = 1, max = 250, message = "Lastname must be 1-250 characters long.")
	@NotNull(message = "Lastname is required")
	@NotBlank(message = "Lastname is required")*/
	private String lastname;
	
	//@Size(min = 1, max = 50, message = "Lastname must be 1-50 characters long.")
	private String mobile;
	private Timestamp last_login;
	private Timestamp expire_time;
	private Boolean active;
	@Type(type = "jsonb")
	@Column(name="pattern_analyze_config", columnDefinition = "jsonb")
	private PatternAnalysisConfig pattern_analyze_config;
	
	private Boolean supervisor;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Timestamp getLast_login() {
		return last_login;
	}
	public void setLast_login(Timestamp last_login) {
		this.last_login = last_login;
	}
	public Timestamp getExpire_time() {
		return expire_time;
	}
	public void setExpire_time(Timestamp expire_time) {
		this.expire_time = expire_time;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public PatternAnalysisConfig getPattern_analyze_config() {
		
		if(pattern_analyze_config == null) {
			pattern_analyze_config = new PatternAnalysisConfig();
		}
		
		return pattern_analyze_config;
	}
	public void setPattern_analyze_config(PatternAnalysisConfig pattern_analyze_config) {
		this.pattern_analyze_config = pattern_analyze_config;
	}
	public Boolean getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(Boolean supervisor) {
		this.supervisor = supervisor;
	}

	
	
}
