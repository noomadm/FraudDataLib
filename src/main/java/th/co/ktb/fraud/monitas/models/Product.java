package th.co.ktb.fraud.monitas.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cbs_product_list")
public class Product {

	@Id
	private int type;
	private String des;
	private String cls;
	private String grp;
	private Double weightage;
	private String grp2;
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public String getCls() {
		return cls;
	}
	public void setCls(String cls) {
		this.cls = cls;
	}
	public String getGrp() {
		return grp;
	}
	public void setGrp(String grp) {
		this.grp = grp;
	}
	public Double getWeightage() {
		return weightage;
	}
	public void setWeightage(Double weightage) {
		this.weightage = weightage;
	}
	public String getGrp2() {
		return grp2;
	}
	public void setGrp2(String grp2) {
		this.grp2 = grp2;
	}
	
}
