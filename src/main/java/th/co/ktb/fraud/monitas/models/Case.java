package th.co.ktb.fraud.monitas.models;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

@Entity
@Table(name = "MNT_CASE")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class Case implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String created_by;
	private Timestamp created_datetime;
	private String updated_by;
	private Timestamp updated_datetime;
	private String alert_id;
	private Integer rule_id;
	private Timestamp alert_datetime;
	private String trxn_code;
	private String account_no;
	private Timestamp account_open_date;
	private String primary_cif;
	private String cif_branch;
	private Double amount;
	private Integer fraud_type_id;
	private Integer user_id;
	private String status;
	private String teller_id;

	@Type(type = "jsonb")
	@Column(name="json_data", columnDefinition = "jsonb")
	private CaseAdditionData json_data;
	
	@Type(type = "jsonb")
	@Column(name="draft_data", columnDefinition = "jsonb")
	private InvestigationLog draft_data;
	
	private String area;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getAlert_id() {
		return alert_id;
	}
	public void setAlert_id(String alert_id) {
		this.alert_id = alert_id;
	}
	public Timestamp getAlert_datetime() {
		return alert_datetime;
	}
	public void setAlert_datetime(Timestamp alert_datetime) {
		this.alert_datetime = alert_datetime;
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
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Integer getFraud_type_id() {
		return fraud_type_id;
	}
	public void setFraud_type_id(Integer fraud_type_id) {
		this.fraud_type_id = fraud_type_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Integer getRule_id() {
		return rule_id;
	}
	public void setRule_id(Integer rule_id) {
		this.rule_id = rule_id;
	}
	public Timestamp getAccount_open_date() {
		return account_open_date;
	}
	public void setAccount_open_date(Timestamp account_open_date) {
		this.account_open_date = account_open_date;
	}
	public CaseAdditionData getJson_data() {
		return json_data;
	}
	public void setJson_data(CaseAdditionData json_data) {
		this.json_data = json_data;
	}
	public String getTeller_id() {
		return teller_id;
	}
	public void setTeller_id(String teller_id) {
		this.teller_id = teller_id;
	}
	public InvestigationLog getDraft_data() {
		return draft_data;
	}
	public void setDraft_data(InvestigationLog draft_data) {
		this.draft_data = draft_data;
	}
	
	
	
	

}
