package th.co.ktb.fraud.monitas.models;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "MNT_CASE_FILE")
@IdClass(CaseFileId.class)
public class CaseFile implements Serializable{

	@Id
	private long case_id;
	@Id
	private long file_id;
	private String created_by;
	private Timestamp created_datetime;
	private String updated_by;
	private Timestamp updated_datetime;
	private String remark;
	public long getCase_id() {
		return case_id;
	}
	public void setCase_id(long case_id) {
		this.case_id = case_id;
	}
	public long getFile_id() {
		return file_id;
	}
	public void setFile_id(long file_id) {
		this.file_id = file_id;
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
