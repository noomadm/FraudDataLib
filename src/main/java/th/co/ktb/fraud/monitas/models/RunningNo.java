package th.co.ktb.fraud.monitas.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MNT_RUNNING_NO")
public class RunningNo {
	
	@Id
	private String prefix;
	private int current;
	private String updated_by;
	private Timestamp updated_datetime;
	
	public RunningNo() {
		
	}
	
	public RunningNo(String prefix,int current) {
		this.prefix = prefix;
		this.current = current;
	}
	
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public int getCurrent() {
		return current;
	}
	public void setCurrent(int current) {
		this.current = current;
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
