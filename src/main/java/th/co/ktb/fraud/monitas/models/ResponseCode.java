package th.co.ktb.fraud.monitas.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cbs_response_code")
public class ResponseCode {

	@Id
	private int response_code;
	private String descr;
	private Integer enabled_flag;
	
	public int getResponse_code() {
		return response_code;
	}
	public void setResponse_code(int response_code) {
		this.response_code = response_code;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public Integer getEnabled_flag() {
		return enabled_flag;
	}
	public void setEnabled_flag(Integer enabled_flag) {
		this.enabled_flag = enabled_flag;
	}
	
}
