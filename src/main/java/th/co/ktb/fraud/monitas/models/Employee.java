package th.co.ktb.fraud.monitas.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CBS_EMP")
public class Employee {

	@Id
	private String ktb_emp_no; 
	private String ktb_emp_title_name;
	private String ktb_emp_first_name;
	private String ktb_emp_last_name;
	private String ktb_field_map;
	private String ktb_pos_group1;
	private String empl_status;
	private String empl_class2;
	private String empl_type; 
	private String ktb_qualificat_grp;
	private String ktb_major_grp;
	private String ktb_account_no;
	private String report_to;
	private String emailid;
	private String sys_file_code;
	private String as_of_date;
	
	public String getKtb_emp_no() {
		return ktb_emp_no;
	}
	public void setKtb_emp_no(String ktb_emp_no) {
		this.ktb_emp_no = ktb_emp_no;
	}
	public String getKtb_emp_title_name() {
		return ktb_emp_title_name;
	}
	public void setKtb_emp_title_name(String ktb_emp_title_name) {
		this.ktb_emp_title_name = ktb_emp_title_name;
	}
	public String getKtb_emp_first_name() {
		return ktb_emp_first_name;
	}
	public void setKtb_emp_first_name(String ktb_emp_first_name) {
		this.ktb_emp_first_name = ktb_emp_first_name;
	}
	public String getKtb_emp_last_name() {
		return ktb_emp_last_name;
	}
	public void setKtb_emp_last_name(String ktb_emp_last_name) {
		this.ktb_emp_last_name = ktb_emp_last_name;
	}
	public String getKtb_field_map() {
		return ktb_field_map;
	}
	public void setKtb_field_map(String ktb_field_map) {
		this.ktb_field_map = ktb_field_map;
	}
	public String getKtb_pos_group1() {
		return ktb_pos_group1;
	}
	public void setKtb_pos_group1(String ktb_pos_group1) {
		this.ktb_pos_group1 = ktb_pos_group1;
	}
	public String getEmpl_status() {
		return empl_status;
	}
	public void setEmpl_status(String empl_status) {
		this.empl_status = empl_status;
	}
	public String getEmpl_class2() {
		return empl_class2;
	}
	public void setEmpl_class2(String empl_class2) {
		this.empl_class2 = empl_class2;
	}
	public String getEmpl_type() {
		return empl_type;
	}
	public void setEmpl_type(String empl_type) {
		this.empl_type = empl_type;
	}
	public String getKtb_qualificat_grp() {
		return ktb_qualificat_grp;
	}
	public void setKtb_qualificat_grp(String ktb_qualificat_grp) {
		this.ktb_qualificat_grp = ktb_qualificat_grp;
	}
	public String getKtb_major_grp() {
		return ktb_major_grp;
	}
	public void setKtb_major_grp(String ktb_major_grp) {
		this.ktb_major_grp = ktb_major_grp;
	}
	public String getKtb_account_no() {
		return ktb_account_no;
	}
	public void setKtb_account_no(String ktb_account_no) {
		this.ktb_account_no = ktb_account_no;
	}
	public String getReport_to() {
		return report_to;
	}
	public void setReport_to(String report_to) {
		this.report_to = report_to;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getSys_file_code() {
		return sys_file_code;
	}
	public void setSys_file_code(String sys_file_code) {
		this.sys_file_code = sys_file_code;
	}
	public String getAs_of_date() {
		return as_of_date;
	}
	public void setAs_of_date(String as_of_date) {
		this.as_of_date = as_of_date;
	}
	
	
	
}
