package th.co.ktb.fraud.monitas.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MNT_AREA")
public class Area {
	
	@Id
	private String area;
	private String description;
	@Column(insertable = true,updatable = false)
	private String created_by;
	@Column(insertable = true,updatable = false)
	private Timestamp created_datetime;
	@Column(insertable = false,updatable = true)
	private String updated_by;
	@Column(insertable = false,updatable = true)
	private Timestamp updated_datetime;
	private String color_css;
	private String icon_css;
	
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
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
	public String getColor_css() {
		return color_css;
	}
	public void setColor_css(String color_css) {
		this.color_css = color_css;
	}
	public String getIcon_css() {
		return icon_css;
	}
	public void setIcon_css(String icon_css) {
		this.icon_css = icon_css;
	}
	
	
	
}
