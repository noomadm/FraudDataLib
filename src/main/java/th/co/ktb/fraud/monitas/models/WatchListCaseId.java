package th.co.ktb.fraud.monitas.models;

import java.io.Serializable;

public class WatchListCaseId implements Serializable{

	private int watch_list_id;
	private int case_id;
	public int getWatch_list_id() {
		return watch_list_id;
	}
	public void setWatch_list_id(int watch_list_id) {
		this.watch_list_id = watch_list_id;
	}
	public int getCase_id() {
		return case_id;
	}
	public void setCase_id(int case_id) {
		this.case_id = case_id;
	}
	
	
	
}
