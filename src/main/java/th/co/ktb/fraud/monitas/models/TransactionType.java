package th.co.ktb.fraud.monitas.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mnt_transaction_type")
public class TransactionType {

	@Id
	private String trxn_code;
	
	private String datasource;
	private String short_description;
	private String long_description;
	private String channel;
	private String mode;
	private String type;
	private String group;
	private Integer playment_flag;
	private Integer fee;
	private Integer is_request;
	private Integer status;
	
	public String getTrxn_code() {
		return trxn_code;
	}
	public void setTrxn_code(String trxn_code) {
		this.trxn_code = trxn_code;
	}
	public String getDatasource() {
		return datasource;
	}
	public void setDatasource(String datasource) {
		this.datasource = datasource;
	}
	public String getShort_description() {
		return short_description;
	}
	public void setShort_description(String short_description) {
		this.short_description = short_description;
	}
	public String getLong_description() {
		return long_description;
	}
	public void setLong_description(String long_description) {
		this.long_description = long_description;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public Integer getPlayment_flag() {
		return playment_flag;
	}
	public void setPlayment_flag(Integer playment_flag) {
		this.playment_flag = playment_flag;
	}
	public Integer getFee() {
		return fee;
	}
	public void setFee(Integer fee) {
		this.fee = fee;
	}
	public Integer getIs_request() {
		return is_request;
	}
	public void setIs_request(Integer is_request) {
		this.is_request = is_request;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
	
}
