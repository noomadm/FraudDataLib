package th.co.ktb.fraud.monitas.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(TellerAccountResultIds.class)
public class TellerAccountResult {
	
	@Id
	private String user_id;
	@Id
	private String account_number;
	private int trans_count;
	private int unread_count;
	private String last_trxn;
	private double last_amount;
	private Double trans_amount;
	private DTJIds dtjId;
	
	public TellerAccountResult(String user_id,String account_number,long trans_count) {
		this.user_id = user_id;
		this.account_number = account_number;
		this.trans_count = (int)trans_count;
		//this.trans_amount = trans_amount;
	}
	
	public TellerAccountResult(String user_id,String account_number,long trans_count,Double trans_amount) {
		this.user_id = user_id;
		this.account_number = account_number;
		this.trans_count = (int)trans_count;
		this.trans_amount = trans_amount;
	}
	
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
	public int getTrans_count() {
		return trans_count;
	}
	public void setTrans_count(int trans_count) {
		this.trans_count = trans_count;
	}
	public int getUnread_count() {
		return unread_count;
	}
	public void setUnread_count(int unread_count) {
		this.unread_count = unread_count;
	}
	public String getLast_trxn() {
		return last_trxn;
	}
	public void setLast_trxn(String last_trxn) {
		this.last_trxn = last_trxn;
	}
	public double getLast_amount() {
		return last_amount;
	}
	public void setLast_amount(double last_amount) {
		this.last_amount = last_amount;
	}

	public Double getTrans_amount() {
		return trans_amount;
	}

	public void setTrans_amount(Double trans_amount) {
		this.trans_amount = trans_amount;
	}

	public DTJIds getDtjId() {
		return dtjId;
	}

	public void setDtjId(DTJIds dtjId) {
		this.dtjId = dtjId;
	}
	
	

}
