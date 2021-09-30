package th.co.ktb.fraud.monitas.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cbs_country_list")
public class Country {

	@Id
	private String cntry;
	private String descr;
	private String postvalid1;
	private String postvalid2;
	private String isoc;
	
	
	public String getCntry() {
		return cntry;
	}
	public void setCntry(String cntry) {
		this.cntry = cntry;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public String getPostvalid1() {
		return postvalid1;
	}
	public void setPostvalid1(String postvalid1) {
		this.postvalid1 = postvalid1;
	}
	public String getPostvalid2() {
		return postvalid2;
	}
	public void setPostvalid2(String postvalid2) {
		this.postvalid2 = postvalid2;
	}
	public String getIsoc() {
		return isoc;
	}
	public void setIsoc(String isoc) {
		this.isoc = isoc;
	}
	
	
	
}
