package th.co.ktb.fraud.monitas.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MNT_FILE")
public class DatabaseFile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String file_name;
	private int file_size;
	private String file_type;
	private String encrypt_key;
	private String file_path;
	private Timestamp created_datetime;
	private String created_by;
	private Timestamp deleted_datetime;
	private String deleted_by;
	private boolean is_delete;
	private String remark;

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	public int getFile_size() {
		return file_size;
	}

	public void setFile_size(int file_size) {
		this.file_size = file_size;
	}

	public String getFile_type() {
		return file_type;
	}

	public void setFile_type(String file_type) {
		this.file_type = file_type;
	}

	public String getEncrypt_key() {
		return encrypt_key;
	}

	public void setEncrypt_key(String encrypt_key) {
		this.encrypt_key = encrypt_key;
	}

	public String getFile_path() {
		return file_path;
	}

	public void setFile_path(String file_path) {
		this.file_path = file_path;
	}

	public Timestamp getCreated_datetime() {
		return created_datetime;
	}

	public void setCreated_datetime(Timestamp created_datetime) {
		this.created_datetime = created_datetime;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public Timestamp getDeleted_datetime() {
		return deleted_datetime;
	}

	public void setDeleted_datetime(Timestamp deleted_datetime) {
		this.deleted_datetime = deleted_datetime;
	}

	public String getDeleted_by() {
		return deleted_by;
	}

	public void setDeleted_by(String deleted_by) {
		this.deleted_by = deleted_by;
	}

	public boolean isIs_delete() {
		return is_delete;
	}

	public void setIs_delete(boolean is_delete) {
		this.is_delete = is_delete;
	}

}
