package th.co.ktb.fraud.monitas.models;

import java.io.Serializable;

public class CustFileId implements Serializable{

	private long cust_id;
	private long file_id;
	public long getCust_id() {
		return cust_id;
	}
	public void setCust_id(long cust_id) {
		this.cust_id = cust_id;
	}
	public long getFile_id() {
		return file_id;
	}
	public void setFile_id(long file_id) {
		this.file_id = file_id;
	}
	
	
	
}
