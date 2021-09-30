package th.co.ktb.fraud.monitas.models;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TaskSearchResult {

	@Id
	private long id;
	private String alert_id;
	private String status;
	private Timestamp alert_datetime;
	private String rule_name;
	private String description;
	private String trxn_code;
	private String account_no;
	private Date account_open_date;
	private String primary_cif;
	private String cif_branch;
	private String teller_id;
	private Double amount;
	private Integer user_id;
	public String getAlert_id() {
		return alert_id;
	}
	public void setAlert_id(String alert_id) {
		this.alert_id = alert_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Timestamp getAlert_datetime() {
		return alert_datetime;
	}
	public void setAlert_datetime(Timestamp alert_datetime) {
		this.alert_datetime = alert_datetime;
	}
	public String getRule_name() {
		return rule_name;
	}
	public void setRule_name(String rule_name) {
		this.rule_name = rule_name;
	}
	public String getTrxn_code() {
		return trxn_code;
	}
	public void setTrxn_code(String trxn_code) {
		this.trxn_code = trxn_code;
	}
	public String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public Date getAccount_open_date() {
		return account_open_date;
	}
	public void setAccount_open_date(Date account_open_date) {
		this.account_open_date = account_open_date;
	}
	public String getPrimary_cif() {
		return primary_cif;
	}
	public void setPrimary_cif(String primary_cif) {
		this.primary_cif = primary_cif;
	}
	public String getCif_branch() {
		return cif_branch;
	}
	public void setCif_branch(String cif_branch) {
		this.cif_branch = cif_branch;
	}
	public String getTeller_id() {
		return teller_id;
	}
	public void setTeller_id(String teller_id) {
		this.teller_id = teller_id;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
