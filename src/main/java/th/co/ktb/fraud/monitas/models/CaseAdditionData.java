package th.co.ktb.fraud.monitas.models;

import java.io.Serializable;

public class CaseAdditionData implements Serializable{

	private DTJIds dtjId;
	private String tranDate;

	public DTJIds getDtjId() {
		return dtjId;
	}

	public void setDtjId(DTJIds dtjId) {
		this.dtjId = dtjId;
	}

	public String getTranDate() {
		return tranDate;
	}

	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}
	
	
	
}
