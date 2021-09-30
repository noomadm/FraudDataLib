package th.co.ktb.fraud.monitas.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cbs_customer_profile")
public class CustomerProfile {

	@Id
	private String account_id;
	private Double customer_id; 
	private String title;
	private String first_name;
	private String last_name;
	private String thai_title; 
	private String thai_first_name;
	private String thai_last_name;
	private Date date_of_birth;
	private Date profile_creationdate;
	private Date last_cust_contact_date;
	private Double address;
	private String country;
	private String over_draft_option;
	private String social_security_no;
	private String telephone_number;
	private String mobile_number;
	private String email_id;
	private String job_type_description;
	private String description;
	private Integer cost_center;
	private String marital_status_description;
	private String income ;
	private Integer account_status;
	private Integer interest_dividend_rate;
	private String account_category;
	private String residence ;
	private String term; 
	private Double overdraft_limit;
	private Date overdraft_start;
	private Date overdraft_end;
	private String employer_id;
	private String account_type_id;
	private String account_relation;
	private String overdraft_term;
	private String nominee;
	private String branch_id; 
	private String product_type ;
	private String sub_product_type ;
	private String product_group ;
	private String currency_type;
	private Date account_close_date;
	private String sbu_code;
	private String nationality;
	private String sex;
	private String cust_type;
	private String flg_minor;
	private String flg_staff;
	private String mode_of_operation;
	private String restriction_flag;
	private String business_regn0;
	private String permanent_hold_indicator;
	private Integer turnover;
	private String core_bank_risk;
	private String updated_risk;
	private Date updated_date;
	private String cf_risk_comment; 
	private String region_id;
	private String card_number;
	private Integer app; 
	private String tax_id; 
	private String passport_no; 
	private Date register_mib_date;
	private Double account_opening_balance;
	private Double limit_tfr_own_acct;
	private Double limit_tfr_3rd_acct;
	private Double limit_payment;
	public String getAccount_id() {
		return account_id;
	}
	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}
	public Double getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Double customer_id) {
		this.customer_id = customer_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getThai_title() {
		return thai_title;
	}
	public void setThai_title(String thai_title) {
		this.thai_title = thai_title;
	}
	public String getThai_first_name() {
		return thai_first_name;
	}
	public void setThai_first_name(String thai_first_name) {
		this.thai_first_name = thai_first_name;
	}
	public String getThai_last_name() {
		return thai_last_name;
	}
	public void setThai_last_name(String thai_last_name) {
		this.thai_last_name = thai_last_name;
	}
	public Date getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public Date getProfile_creationdate() {
		return profile_creationdate;
	}
	public void setProfile_creationdate(Date profile_creationdate) {
		this.profile_creationdate = profile_creationdate;
	}
	public Date getLast_cust_contact_date() {
		return last_cust_contact_date;
	}
	public void setLast_cust_contact_date(Date last_cust_contact_date) {
		this.last_cust_contact_date = last_cust_contact_date;
	}
	public Double getAddress() {
		return address;
	}
	public void setAddress(Double address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getOver_draft_option() {
		return over_draft_option;
	}
	public void setOver_draft_option(String over_draft_option) {
		this.over_draft_option = over_draft_option;
	}
	public String getSocial_security_no() {
		return social_security_no;
	}
	public void setSocial_security_no(String social_security_no) {
		this.social_security_no = social_security_no;
	}
	public String getTelephone_number() {
		return telephone_number;
	}
	public void setTelephone_number(String telephone_number) {
		this.telephone_number = telephone_number;
	}
	public String getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getJob_type_description() {
		return job_type_description;
	}
	public void setJob_type_description(String job_type_description) {
		this.job_type_description = job_type_description;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getCost_center() {
		return cost_center;
	}
	public void setCost_center(Integer cost_center) {
		this.cost_center = cost_center;
	}
	public String getMarital_status_description() {
		return marital_status_description;
	}
	public void setMarital_status_description(String marital_status_description) {
		this.marital_status_description = marital_status_description;
	}
	public String getIncome() {
		return income;
	}
	public void setIncome(String income) {
		this.income = income;
	}
	public Integer getAccount_status() {
		return account_status;
	}
	public void setAccount_status(Integer account_status) {
		this.account_status = account_status;
	}
	public Integer getInterest_dividend_rate() {
		return interest_dividend_rate;
	}
	public void setInterest_dividend_rate(Integer interest_dividend_rate) {
		this.interest_dividend_rate = interest_dividend_rate;
	}
	public String getAccount_category() {
		return account_category;
	}
	public void setAccount_category(String account_category) {
		this.account_category = account_category;
	}
	public String getResidence() {
		return residence;
	}
	public void setResidence(String residence) {
		this.residence = residence;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	
	public Double getOverdraft_limit() {
		return overdraft_limit;
	}
	public void setOverdraft_limit(Double overdraft_limit) {
		this.overdraft_limit = overdraft_limit;
	}
	public Date getOverdraft_start() {
		return overdraft_start;
	}
	public void setOverdraft_start(Date overdraft_start) {
		this.overdraft_start = overdraft_start;
	}
	public Date getOverdraft_end() {
		return overdraft_end;
	}
	public void setOverdraft_end(Date overdraft_end) {
		this.overdraft_end = overdraft_end;
	}
	public String getEmployer_id() {
		return employer_id;
	}
	public void setEmployer_id(String employer_id) {
		this.employer_id = employer_id;
	}
	public String getAccount_type_id() {
		return account_type_id;
	}
	public void setAccount_type_id(String account_type_id) {
		this.account_type_id = account_type_id;
	}
	public String getAccount_relation() {
		return account_relation;
	}
	public void setAccount_relation(String account_relation) {
		this.account_relation = account_relation;
	}
	public String getOverdraft_term() {
		return overdraft_term;
	}
	public void setOverdraft_term(String overdraft_term) {
		this.overdraft_term = overdraft_term;
	}
	public String getNominee() {
		return nominee;
	}
	public void setNominee(String nominee) {
		this.nominee = nominee;
	}
	public String getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(String branch_id) {
		this.branch_id = branch_id;
	}
	public String getProduct_type() {
		return product_type;
	}
	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}
	public String getSub_product_type() {
		return sub_product_type;
	}
	public void setSub_product_type(String sub_product_type) {
		this.sub_product_type = sub_product_type;
	}
	public String getProduct_group() {
		return product_group;
	}
	public void setProduct_group(String product_group) {
		this.product_group = product_group;
	}
	public String getCurrency_type() {
		return currency_type;
	}
	public void setCurrency_type(String currency_type) {
		this.currency_type = currency_type;
	}
	public Date getAccount_close_date() {
		return account_close_date;
	}
	public void setAccount_close_date(Date account_close_date) {
		this.account_close_date = account_close_date;
	}
	public String getSbu_code() {
		return sbu_code;
	}
	public void setSbu_code(String sbu_code) {
		this.sbu_code = sbu_code;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCust_type() {
		return cust_type;
	}
	public void setCust_type(String cust_type) {
		this.cust_type = cust_type;
	}
	public String getFlg_minor() {
		return flg_minor;
	}
	public void setFlg_minor(String flg_minor) {
		this.flg_minor = flg_minor;
	}
	public String getFlg_staff() {
		return flg_staff;
	}
	public void setFlg_staff(String flg_staff) {
		this.flg_staff = flg_staff;
	}
	public String getMode_of_operation() {
		return mode_of_operation;
	}
	public void setMode_of_operation(String mode_of_operation) {
		this.mode_of_operation = mode_of_operation;
	}
	public String getRestriction_flag() {
		return restriction_flag;
	}
	public void setRestriction_flag(String restriction_flag) {
		this.restriction_flag = restriction_flag;
	}
	public String getBusiness_regn0() {
		return business_regn0;
	}
	public void setBusiness_regn0(String business_regn0) {
		this.business_regn0 = business_regn0;
	}
	public String getPermanent_hold_indicator() {
		return permanent_hold_indicator;
	}
	public void setPermanent_hold_indicator(String permanent_hold_indicator) {
		this.permanent_hold_indicator = permanent_hold_indicator;
	}
	public Integer getTurnover() {
		return turnover;
	}
	public void setTurnover(Integer turnover) {
		this.turnover = turnover;
	}
	public String getCore_bank_risk() {
		return core_bank_risk;
	}
	public void setCore_bank_risk(String core_bank_risk) {
		this.core_bank_risk = core_bank_risk;
	}
	public String getUpdated_risk() {
		return updated_risk;
	}
	public void setUpdated_risk(String updated_risk) {
		this.updated_risk = updated_risk;
	}
	public Date getUpdated_date() {
		return updated_date;
	}
	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}
	public String getCf_risk_comment() {
		return cf_risk_comment;
	}
	public void setCf_risk_comment(String cf_risk_comment) {
		this.cf_risk_comment = cf_risk_comment;
	}
	public String getRegion_id() {
		return region_id;
	}
	public void setRegion_id(String region_id) {
		this.region_id = region_id;
	}
	public String getCard_number() {
		return card_number;
	}
	public void setCard_number(String card_number) {
		this.card_number = card_number;
	}
	public Integer getApp() {
		return app;
	}
	public void setApp(Integer app) {
		this.app = app;
	}
	public String getTax_id() {
		return tax_id;
	}
	public void setTax_id(String tax_id) {
		this.tax_id = tax_id;
	}
	public String getPassport_no() {
		return passport_no;
	}
	public void setPassport_no(String passport_no) {
		this.passport_no = passport_no;
	}
	public Date getRegister_mib_date() {
		return register_mib_date;
	}
	public void setRegister_mib_date(Date register_mib_date) {
		this.register_mib_date = register_mib_date;
	}
	public Double getAccount_opening_balance() {
		return account_opening_balance;
	}
	public void setAccount_opening_balance(Double account_opening_balance) {
		this.account_opening_balance = account_opening_balance;
	}
	public Double getLimit_tfr_own_acct() {
		return limit_tfr_own_acct;
	}
	public void setLimit_tfr_own_acct(Double limit_tfr_own_acct) {
		this.limit_tfr_own_acct = limit_tfr_own_acct;
	}
	public Double getLimit_tfr_3rd_acct() {
		return limit_tfr_3rd_acct;
	}
	public void setLimit_tfr_3rd_acct(Double limit_tfr_3rd_acct) {
		this.limit_tfr_3rd_acct = limit_tfr_3rd_acct;
	}
	public Double getLimit_payment() {
		return limit_payment;
	}
	public void setLimit_payment(Double limit_payment) {
		this.limit_payment = limit_payment;
	}
	
}
