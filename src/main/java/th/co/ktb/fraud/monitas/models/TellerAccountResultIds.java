package th.co.ktb.fraud.monitas.models;

import java.io.Serializable;

public class TellerAccountResultIds implements Serializable{

	private String user_id;
	private String account_number;
	
	
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	
	
	
}
