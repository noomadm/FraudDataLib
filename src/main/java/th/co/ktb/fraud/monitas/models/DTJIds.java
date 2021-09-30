package th.co.ktb.fraud.monitas.models;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

public class DTJIds implements Serializable{

	private Date trans_date;
	private Timestamp date_time;
	private String account_number;
	private int trans_sequence_no;
	
	public Date getTrans_date() {
		return trans_date;
	}
	public void setTrans_date(Date trans_date) {
		this.trans_date = trans_date;
	}
	public Timestamp getDate_time() {
		return date_time;
	}
	public void setDate_time(Timestamp date_time) {
		this.date_time = date_time;
	}
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public int getTrans_sequence_no() {
		return trans_sequence_no;
	}
	public void setTrans_sequence_no(int trans_sequence_no) {
		this.trans_sequence_no = trans_sequence_no;
	}
	
	
	
}
