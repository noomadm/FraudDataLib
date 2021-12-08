package th.co.ktb.fraud.monitas.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "MNT_WATCH_LIST_CASE")
@IdClass(WatchListCaseId.class)
public class WatchListCase {

	@Id
	private int watch_list_id;
	@Id
	private int case_id;
	private String created_by;
	private Timestamp created_datetime;
	
	public int getWatch_list_id() {
		return watch_list_id;
	}
	public void setWatch_list_id(int watch_list_id) {
		this.watch_list_id = watch_list_id;
	}
	public int getCase_id() {
		return case_id;
	}
	public void setCase_id(int case_id) {
		this.case_id = case_id;
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
	
	
}
