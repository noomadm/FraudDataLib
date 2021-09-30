package th.co.ktb.fraud.monitas.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cbs_branch_list")
public class Branch {

	@Id
	private int branch_id;
	private String branch_type;
	private String main_branch_id;
	private String branch_name;
	private String branch_name_shrt;
	private String branch_address1;
	private String branch_address2;
	private String branch_address3;
	private String branch_city;
	private String branch_state;
	private String branch_zip;
	private String branch_country;
	private String branch_status;
	private String bsr_code;
	private String branch_phone;
	private String branch_fax;
	private String branch_email;
	private Timestamp branch_close_time;
	public int getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}
	public String getBranch_type() {
		return branch_type;
	}
	public void setBranch_type(String branch_type) {
		this.branch_type = branch_type;
	}
	public String getMain_branch_id() {
		return main_branch_id;
	}
	public void setMain_branch_id(String main_branch_id) {
		this.main_branch_id = main_branch_id;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	
	public String getBranch_name_shrt() {
		return branch_name_shrt;
	}
	public void setBranch_name_shrt(String branch_name_shrt) {
		this.branch_name_shrt = branch_name_shrt;
	}
	public String getBranch_address1() {
		return branch_address1;
	}
	public void setBranch_address1(String branch_address1) {
		this.branch_address1 = branch_address1;
	}
	public String getBranch_address2() {
		return branch_address2;
	}
	public void setBranch_address2(String branch_address2) {
		this.branch_address2 = branch_address2;
	}
	public String getBranch_address3() {
		return branch_address3;
	}
	public void setBranch_address3(String branch_address3) {
		this.branch_address3 = branch_address3;
	}
	public String getBranch_city() {
		return branch_city;
	}
	public void setBranch_city(String branch_city) {
		this.branch_city = branch_city;
	}
	public String getBranch_state() {
		return branch_state;
	}
	public void setBranch_state(String branch_state) {
		this.branch_state = branch_state;
	}
	public String getBranch_zip() {
		return branch_zip;
	}
	public void setBranch_zip(String branch_zip) {
		this.branch_zip = branch_zip;
	}
	public String getBranch_country() {
		return branch_country;
	}
	public void setBranch_country(String branch_country) {
		this.branch_country = branch_country;
	}
	public String getBranch_status() {
		return branch_status;
	}
	public void setBranch_status(String branch_status) {
		this.branch_status = branch_status;
	}
	public String getBsr_code() {
		return bsr_code;
	}
	public void setBsr_code(String bsr_code) {
		this.bsr_code = bsr_code;
	}
	public String getBranch_phone() {
		return branch_phone;
	}
	public void setBranch_phone(String branch_phone) {
		this.branch_phone = branch_phone;
	}
	public String getBranch_fax() {
		return branch_fax;
	}
	public void setBranch_fax(String branch_fax) {
		this.branch_fax = branch_fax;
	}
	public String getBranch_email() {
		return branch_email;
	}
	public void setBranch_email(String branch_email) {
		this.branch_email = branch_email;
	}
	public Timestamp getBranch_close_time() {
		return branch_close_time;
	}
	public void setBranch_close_time(Timestamp branch_close_time) {
		this.branch_close_time = branch_close_time;
	}
	
	
}
