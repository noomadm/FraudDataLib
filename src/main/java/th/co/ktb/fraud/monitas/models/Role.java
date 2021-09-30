package th.co.ktb.fraud.monitas.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "MNT_ROLE")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Size(min = 1, max = 50, message = "Permissions must be 1-50 characters")
	@NotNull(message = "Role is required")
	@NotBlank(message = "Role is required")
	private String role;
	
	@Size(min = 1, max = 500, message = "Description must be 1-500 characters")
	private String description;
	@Column(insertable = true,updatable = false)
	private String created_by;
	@Column(insertable = true,updatable = false)
	private Timestamp created_datetime;
	@Column(insertable = false,updatable = true)
	private String updated_by;
	@Column(insertable = false,updatable = true)
	private Timestamp updated_datetime;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public String getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	public Timestamp getUpdated_datetime() {
		return updated_datetime;
	}
	public void setUpdated_datetime(Timestamp updated_datetime) {
		this.updated_datetime = updated_datetime;
	}
	
	
}
