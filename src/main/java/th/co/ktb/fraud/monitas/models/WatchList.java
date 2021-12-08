package th.co.ktb.fraud.monitas.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MNT_WATCH_LIST")
public class WatchList {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String card_no;
	private String teller_id;
	private String account_no;
	private String cif_no;
	private boolean active;
	private String created_by;
	private Timestamp created_datetime;
	private String deactive_by;
	private Timestamp deactive_datetime;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCard_no() {
		return card_no;
	}
	public void setCard_no(String card_no) {
		this.card_no = card_no;
	}
	public String getTeller_id() {
		return teller_id;
	}
	public void setTeller_id(String teller_id) {
		this.teller_id = teller_id;
	}
	public String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public String getCif_no() {
		return cif_no;
	}
	public void setCif_no(String cif_no) {
		this.cif_no = cif_no;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
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
	public String getDeactive_by() {
		return deactive_by;
	}
	public void setDeactive_by(String deactive_by) {
		this.deactive_by = deactive_by;
	}
	public Timestamp getDeactive_datetime() {
		return deactive_datetime;
	}
	public void setDeactive_datetime(Timestamp deactive_datetime) {
		this.deactive_datetime = deactive_datetime;
	}
	
	
	
}
