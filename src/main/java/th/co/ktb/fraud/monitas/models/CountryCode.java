package th.co.ktb.fraud.monitas.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cbs_country_code")
public class CountryCode {
	
	@Id
	private String country_code;
	private String country_alpha2;
	private String country_alpha3;
	private String country_name;
	
	public String getCountry_code() {
		return country_code;
	}
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	public String getCountry_alpha2() {
		return country_alpha2;
	}
	public void setCountry_alpha2(String country_alpha2) {
		this.country_alpha2 = country_alpha2;
	}
	public String getCountry_alpha3() {
		return country_alpha3;
	}
	public void setCountry_alpha3(String country_alpha3) {
		this.country_alpha3 = country_alpha3;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	
	
	
}
