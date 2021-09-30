package th.co.ktb.fraud.monitas.models;

import java.sql.Time;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name =  "cbs_account_additional_info")
public class Account {

	private String title1;
	private String title2;
	private String title3;
	private String title4;
	private String acctname;
	@Id
	private Double account_id;
	private Timestamp matrutiy_date;
	private Double original_amount;
	private Timestamp renewed_date;
	private Long times_renewed;
	private Long principal_maturity;
	private Double rollover_account;
	private Integer interest_dividend_disbursement;
	private Double int_div_transfer_account;
	private Double original_int_div_rate;
	private String nom_minor_guard;
	private Timestamp activation_date;
	private String canvass_employee;
	private Long momobilisation_branch;
	private String cif_officer;
	private String lead_gen_code;
	private String activation_mode;
	private Timestamp activation_request_date;
	private String card_use;
	private String term_days;
	private Double int_maturity_option;
	private String payment_grace_period;
	private Timestamp last_payment_date;
	private Double recovery_amount;
	private String int_div_index;
	private Double int_div_index_orig;
	private String purpose_code;
	private Timestamp foreclosure_date;
	private String cap_int_billed;
	private Double sanction_amount;
	private Timestamp date_dpn;
	private Timestamp date_aod1;
	private Timestamp date_aod2;
	private Timestamp date_aod3;
	private Timestamp date_aod4;
	private String govt_schema;
	private String saction_level;
	private String borrowal_head;
	private String facility_risk_code;
	private String saction_reference;
	private Timestamp npa_date;
	private Double pledge_amount;
	private Double load_amount;
	private Double available_balance;
	private String total_collateral_value;
	public String getTitle1() {
		return title1;
	}
	public void setTitle1(String title1) {
		this.title1 = title1;
	}
	public String getTitle2() {
		return title2;
	}
	public void setTitle2(String title2) {
		this.title2 = title2;
	}
	public String getTitle3() {
		return title3;
	}
	public void setTitle3(String title3) {
		this.title3 = title3;
	}
	public String getTitle4() {
		return title4;
	}
	public void setTitle4(String title4) {
		this.title4 = title4;
	}
	public String getAcctname() {
		return acctname;
	}
	public void setAcctname(String acctname) {
		this.acctname = acctname;
	}
	public Double getAccount_id() {
		return account_id;
	}
	public void setAccount_id(Double account_id) {
		this.account_id = account_id;
	}
	public Timestamp getMatrutiy_date() {
		return matrutiy_date;
	}
	public void setMatrutiy_date(Timestamp matrutiy_date) {
		this.matrutiy_date = matrutiy_date;
	}
	public Double getOriginal_amount() {
		return original_amount;
	}
	public void setOriginal_amount(Double original_amount) {
		this.original_amount = original_amount;
	}
	public Timestamp getRenewed_date() {
		return renewed_date;
	}
	public void setRenewed_date(Timestamp renewed_date) {
		this.renewed_date = renewed_date;
	}
	public Long getTimes_renewed() {
		return times_renewed;
	}
	public void setTimes_renewed(Long times_renewed) {
		this.times_renewed = times_renewed;
	}
	public Long getPrincipal_maturity() {
		return principal_maturity;
	}
	public void setPrincipal_maturity(Long principal_maturity) {
		this.principal_maturity = principal_maturity;
	}
	public Double getRollover_account() {
		return rollover_account;
	}
	public void setRollover_account(Double rollover_account) {
		this.rollover_account = rollover_account;
	}
	public Integer getInterest_dividend_disbursement() {
		return interest_dividend_disbursement;
	}
	public void setInterest_dividend_disbursement(Integer interest_dividend_disbursement) {
		this.interest_dividend_disbursement = interest_dividend_disbursement;
	}
	public Double getInt_div_transfer_account() {
		return int_div_transfer_account;
	}
	public void setInt_div_transfer_account(Double int_div_transfer_account) {
		this.int_div_transfer_account = int_div_transfer_account;
	}
	public Double getOriginal_int_div_rate() {
		return original_int_div_rate;
	}
	public void setOriginal_int_div_rate(Double original_int_div_rate) {
		this.original_int_div_rate = original_int_div_rate;
	}
	public String getNom_minor_guard() {
		return nom_minor_guard;
	}
	public void setNom_minor_guard(String nom_minor_guard) {
		this.nom_minor_guard = nom_minor_guard;
	}
	public Timestamp getActivation_date() {
		return activation_date;
	}
	public void setActivation_date(Timestamp activation_date) {
		this.activation_date = activation_date;
	}
	public String getCanvass_employee() {
		return canvass_employee;
	}
	public void setCanvass_employee(String canvass_employee) {
		this.canvass_employee = canvass_employee;
	}
	public Long getMomobilisation_branch() {
		return momobilisation_branch;
	}
	public void setMomobilisation_branch(Long momobilisation_branch) {
		this.momobilisation_branch = momobilisation_branch;
	}
	public String getCif_officer() {
		return cif_officer;
	}
	public void setCif_officer(String cif_officer) {
		this.cif_officer = cif_officer;
	}
	public String getLead_gen_code() {
		return lead_gen_code;
	}
	public void setLead_gen_code(String lead_gen_code) {
		this.lead_gen_code = lead_gen_code;
	}
	public String getActivation_mode() {
		return activation_mode;
	}
	public void setActivation_mode(String activation_mode) {
		this.activation_mode = activation_mode;
	}
	public Timestamp getActivation_request_date() {
		return activation_request_date;
	}
	public void setActivation_request_date(Timestamp activation_request_date) {
		this.activation_request_date = activation_request_date;
	}
	public String getCard_use() {
		return card_use;
	}
	public void setCard_use(String card_use) {
		this.card_use = card_use;
	}
	public String getTerm_days() {
		return term_days;
	}
	public void setTerm_days(String term_days) {
		this.term_days = term_days;
	}
	public Double getInt_maturity_option() {
		return int_maturity_option;
	}
	public void setInt_maturity_option(Double int_maturity_option) {
		this.int_maturity_option = int_maturity_option;
	}
	public String getPayment_grace_period() {
		return payment_grace_period;
	}
	public void setPayment_grace_period(String payment_grace_period) {
		this.payment_grace_period = payment_grace_period;
	}
	public Timestamp getLast_payment_date() {
		return last_payment_date;
	}
	public void setLast_payment_date(Timestamp last_payment_date) {
		this.last_payment_date = last_payment_date;
	}
	public Double getRecovery_amount() {
		return recovery_amount;
	}
	public void setRecovery_amount(Double recovery_amount) {
		this.recovery_amount = recovery_amount;
	}
	public String getInt_div_index() {
		return int_div_index;
	}
	public void setInt_div_index(String int_div_index) {
		this.int_div_index = int_div_index;
	}
	public Double getInt_div_index_orig() {
		return int_div_index_orig;
	}
	public void setInt_div_index_orig(Double int_div_index_orig) {
		this.int_div_index_orig = int_div_index_orig;
	}
	public String getPurpose_code() {
		return purpose_code;
	}
	public void setPurpose_code(String purpose_code) {
		this.purpose_code = purpose_code;
	}
	public Timestamp getForeclosure_date() {
		return foreclosure_date;
	}
	public void setForeclosure_date(Timestamp foreclosure_date) {
		this.foreclosure_date = foreclosure_date;
	}
	public String getCap_int_billed() {
		return cap_int_billed;
	}
	public void setCap_int_billed(String cap_int_billed) {
		this.cap_int_billed = cap_int_billed;
	}
	public Double getSanction_amount() {
		return sanction_amount;
	}
	public void setSanction_amount(Double sanction_amount) {
		this.sanction_amount = sanction_amount;
	}
	public Timestamp getDate_dpn() {
		return date_dpn;
	}
	public void setDate_dpn(Timestamp date_dpn) {
		this.date_dpn = date_dpn;
	}
	public Timestamp getDate_aod1() {
		return date_aod1;
	}
	public void setDate_aod1(Timestamp date_aod1) {
		this.date_aod1 = date_aod1;
	}
	public Timestamp getDate_aod2() {
		return date_aod2;
	}
	public void setDate_aod2(Timestamp date_aod2) {
		this.date_aod2 = date_aod2;
	}
	public Timestamp getDate_aod3() {
		return date_aod3;
	}
	public void setDate_aod3(Timestamp date_aod3) {
		this.date_aod3 = date_aod3;
	}
	public Timestamp getDate_aod4() {
		return date_aod4;
	}
	public void setDate_aod4(Timestamp date_aod4) {
		this.date_aod4 = date_aod4;
	}
	public String getGovt_schema() {
		return govt_schema;
	}
	public void setGovt_schema(String govt_schema) {
		this.govt_schema = govt_schema;
	}
	public String getSaction_level() {
		return saction_level;
	}
	public void setSaction_level(String saction_level) {
		this.saction_level = saction_level;
	}
	public String getBorrowal_head() {
		return borrowal_head;
	}
	public void setBorrowal_head(String borrowal_head) {
		this.borrowal_head = borrowal_head;
	}
	public String getFacility_risk_code() {
		return facility_risk_code;
	}
	public void setFacility_risk_code(String facility_risk_code) {
		this.facility_risk_code = facility_risk_code;
	}
	public String getSaction_reference() {
		return saction_reference;
	}
	public void setSaction_reference(String saction_reference) {
		this.saction_reference = saction_reference;
	}
	public Timestamp getNpa_date() {
		return npa_date;
	}
	public void setNpa_date(Timestamp npa_date) {
		this.npa_date = npa_date;
	}
	public Double getPledge_amount() {
		return pledge_amount;
	}
	public void setPledge_amount(Double pledge_amount) {
		this.pledge_amount = pledge_amount;
	}
	public Double getLoad_amount() {
		return load_amount;
	}
	public void setLoad_amount(Double load_amount) {
		this.load_amount = load_amount;
	}
	public Double getAvailable_balance() {
		return available_balance;
	}
	public void setAvailable_balance(Double available_balance) {
		this.available_balance = available_balance;
	}
	public String getTotal_collateral_value() {
		return total_collateral_value;
	}
	public void setTotal_collateral_value(String total_collateral_value) {
		this.total_collateral_value = total_collateral_value;
	}
	
	
	
	
}
