package th.co.ktb.fraud.monitas.models;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import com.google.gson.Gson;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import com.vladmihalcea.hibernate.type.json.JsonStringType;

@Entity
@Table(name = "MNT_DTJ")
@IdClass(DTJIds.class)
@TypeDefs({
	  @TypeDef(name = "json", typeClass = JsonStringType.class),
	  @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
	})
public class DTJ {

	public DTJ(){
	}
	
	public DTJ(String external_trans_code,java.util.Date trans_date,Double trans_amount,String user_id) {
		this.external_trans_code = external_trans_code;
		this.trans_date = new Date(trans_date.getTime());
		this.trans_amount = trans_amount;
		this.user_id = user_id;
	}
	
	private String response_code;
	private String response_desc;
	private String esb_timestamp;
	private Long message_sequence;
	private Date next_date;
	private Integer last_sequence_no;
	private Integer total_rec;
	private String more_flg;
	@Id
	private Date trans_date;
	private Long sequence_no;
	@Id
	private Timestamp date_time;
	@Id
	private String account_number;
	@Id
	private Integer trans_sequence_no;
	private String clock_time;
	private String base_currency;
	private String branch_code;
	private Double base_amount;
	private String calendar_date;
	private String currency_code;
	private String customer_code;
	private Double capitalized_interest_reduction;
	private Timestamp trans_effective_date;
	private Double ending_balance;
	private String external_trans_code;
	private String identifier;
	private String internal_transaction_code;
	private Integer multiply_divide_indicator;
	private Double exchange_rate;
	private Integer spray_number;
	private String summary_data;
	private Double system_base_currency_equivalent;				
	private Double trans_amount;
	private String trans_amount_str;				
	private String trans_comment;
	private String trans_location;
	private String teller_balancing_date;
	private String trans_trace_number;
	private Integer treasury_reference;
	private Double total_secondary_balance;
	private String trans_source_of_funds;
	private String user_id;
	private String value_date;
	private String saved_infofor_error_corrects;
	private String atm_trans_date;
	private String atm_message_sequence;
	private Integer cost_center;
	private String check_number;
	private String effective_date;
	private String gl_set_code;
	private Integer reversed_ec_indicator;
	private String itc_1;
	private String itc_10;
	private String itc_11; 
	private String itc_12;
	private String itc_2;
	private String itc_3;
	private String itc_4;
	private String itc_5;
	private String itc_6;
	private String itc_7;
	private String itc_8;
	private String itc_9;
	private Double misc_charge;
	private Double neg_p;
	private Double neg_p_b;
	private Double neg_p_u;
	private Double overdraft_base_balance;
	private Double overdraft_protection_fee_amount;
	private Double overdraft_trans_amount;
	private Double overdraft_ledger_balance;
	private Double principal;				
	private Integer recovery_source;
	private Integer restructured_loan_sequence;
	private Double total_sold_amount;
	private String trans_desc;
	private Double transfer_suspense_account;
	private Integer account_overdraft;
	private Double transfer_account_avail_balance;
	private Double transfer_account_ledger_balance;
	private Double transfer_account_unadv_balance;
	private String trans_type;
	private Integer product_type;
	private Double unapplied_funds;
	private Double uncollected_interest;
	private Double uncollected_accrual;
	private Double withholding_amount;
	private String reject_batch;
	private Double charge_off_amount;
	private Integer charge_off_reason;
	private Double accrued_interest;
	private Double penalty_amount;
	private Double recovery_amount;
	private Integer beneficiary_code;
	private Integer reg_cc_check_type;
	private Integer retries_remaining;
	private String misc_screen_data;
	private String keys_for_xpdo;
	private Double compounded_interest;
	private String transaction_class;
	private String transaction_group;
	private Double swhld;			
	private Double tt_amt_2;
	private Double vat_lchg;
	private String area;
	private Timestamp detected_date;
	private String case_no;
	
	@Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
	private DTJAddition dtj_addition;
	
	
	public String getResponse_code() {
		return response_code;
	}
	public void setResponse_code(String response_code) {
		this.response_code = response_code;
	}
	public String getResponse_desc() {
		return response_desc;
	}
	public void setResponse_desc(String response_desc) {
		this.response_desc = response_desc;
	}
	
	public Long getMessage_sequence() {
		return message_sequence;
	}

	public void setMessage_sequence(Long message_sequence) {
		this.message_sequence = message_sequence;
	}

	public Date getNext_date() {
		return next_date;
	}
	public void setNext_date(Date next_date) {
		this.next_date = next_date;
	}
	public Integer getLast_sequence_no() {
		return last_sequence_no;
	}
	public void setLast_sequence_no(Integer last_sequence_no) {
		this.last_sequence_no = last_sequence_no;
	}
	public Integer getTotal_rec() {
		return total_rec;
	}
	public void setTotal_rec(Integer total_rec) {
		this.total_rec = total_rec;
	}
	public String getMore_flg() {
		return more_flg;
	}
	public void setMore_flg(String more_flg) {
		this.more_flg = more_flg;
	}
	public Date getTrans_date() {
		return trans_date;
	}
	public void setTrans_date(Date trans_date) {
		this.trans_date = trans_date;
	}
	public Long getSequence_no() {
		return sequence_no;
	}
	public void setSequence_no(Long sequence_no) {
		this.sequence_no = sequence_no;
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
	public Integer getTrans_sequence_no() {
		return trans_sequence_no;
	}
	public void setTrans_sequence_no(Integer trans_sequence_no) {
		this.trans_sequence_no = trans_sequence_no;
	}
	public String getClock_time() {
		return clock_time;
	}
	public void setClock_time(String clock_time) {
		this.clock_time = clock_time;
	}
	public String getBase_currency() {
		return base_currency;
	}
	public void setBase_currency(String base_currency) {
		this.base_currency = base_currency;
	}
	public String getBranch_code() {
		return branch_code;
	}
	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}
	public Double getBase_amount() {
		return base_amount;
	}
	public void setBase_amount(Double base_amount) {
		this.base_amount = base_amount;
	}
	public String getCalendar_date() {
		return calendar_date;
	}
	public void setCalendar_date(String calendar_date) {
		this.calendar_date = calendar_date;
	}
	public String getCurrency_code() {
		return currency_code;
	}
	public void setCurrency_code(String currency_code) {
		this.currency_code = currency_code;
	}
	public String getCustomer_code() {
		return customer_code;
	}
	public void setCustomer_code(String customer_code) {
		this.customer_code = customer_code;
	}
	public Double getCapitalized_interest_reduction() {
		return capitalized_interest_reduction;
	}
	public void setCapitalized_interest_reduction(Double capitalized_interest_reduction) {
		this.capitalized_interest_reduction = capitalized_interest_reduction;
	}
	public Timestamp getTrans_effective_date() {
		return trans_effective_date;
	}
	public void setTrans_effective_date(Timestamp trans_effective_date) {
		this.trans_effective_date = trans_effective_date;
	}
	public Double getEnding_balance() {
		return ending_balance;
	}
	public void setEnding_balance(Double ending_balance) {
		this.ending_balance = ending_balance;
	}
	public String getExternal_trans_code() {
		return external_trans_code;
	}
	public void setExternal_trans_code(String external_trans_code) {
		this.external_trans_code = external_trans_code;
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getInternal_transaction_code() {
		return internal_transaction_code;
	}
	public void setInternal_transaction_code(String internal_transaction_code) {
		this.internal_transaction_code = internal_transaction_code;
	}
	public Integer getMultiply_divide_indicator() {
		return multiply_divide_indicator;
	}
	public void setMultiply_divide_indicator(Integer multiply_divide_indicator) {
		this.multiply_divide_indicator = multiply_divide_indicator;
	}
	public Double getExchange_rate() {
		return exchange_rate;
	}
	public void setExchange_rate(Double exchange_rate) {
		this.exchange_rate = exchange_rate;
	}
	public Integer getSpray_number() {
		return spray_number;
	}
	public void setSpray_number(Integer spray_number) {
		this.spray_number = spray_number;
	}
	public String getSummary_data() {
		return summary_data;
	}
	public void setSummary_data(String summary_data) {
		this.summary_data = summary_data;
	}
	public Double getSystem_base_currency_equivalent() {
		return system_base_currency_equivalent;
	}
	public void setSystem_base_currency_equivalent(Double system_base_currency_equivalent) {
		this.system_base_currency_equivalent = system_base_currency_equivalent;
	}
	public Double getTrans_amount() {
		return trans_amount;
	}
	public void setTrans_amount(Double trans_amount) {
		this.trans_amount = trans_amount;
	}
	public String getTrans_amount_str() {
		return trans_amount_str;
	}
	public void setTrans_amount_str(String trans_amount_str) {
		this.trans_amount_str = trans_amount_str;
	}
	public String getTrans_comment() {
		return trans_comment;
	}
	public void setTrans_comment(String trans_comment) {
		this.trans_comment = trans_comment;
	}
	public String getTrans_location() {
		return trans_location;
	}
	public void setTrans_location(String trans_location) {
		this.trans_location = trans_location;
	}
	public String getTeller_balancing_date() {
		return teller_balancing_date;
	}
	public void setTeller_balancing_date(String teller_balancing_date) {
		this.teller_balancing_date = teller_balancing_date;
	}
	public String getTrans_trace_number() {
		return trans_trace_number;
	}
	public void setTrans_trace_number(String trans_trace_number) {
		this.trans_trace_number = trans_trace_number;
	}
	public Integer getTreasury_reference() {
		return treasury_reference;
	}
	public void setTreasury_reference(Integer treasury_reference) {
		this.treasury_reference = treasury_reference;
	}
	public Double getTotal_secondary_balance() {
		return total_secondary_balance;
	}
	public void setTotal_secondary_balance(Double total_secondary_balance) {
		this.total_secondary_balance = total_secondary_balance;
	}
	public String getTrans_source_of_funds() {
		return trans_source_of_funds;
	}
	public void setTrans_source_of_funds(String trans_source_of_funds) {
		this.trans_source_of_funds = trans_source_of_funds;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getValue_date() {
		return value_date;
	}
	public void setValue_date(String value_date) {
		this.value_date = value_date;
	}
	public String getSaved_infofor_error_corrects() {
		return saved_infofor_error_corrects;
	}
	public void setSaved_infofor_error_corrects(String saved_infofor_error_corrects) {
		this.saved_infofor_error_corrects = saved_infofor_error_corrects;
	}
	
	public Integer getCost_center() {
		return cost_center;
	}
	public void setCost_center(Integer cost_center) {
		this.cost_center = cost_center;
	}
	public String getCheck_number() {
		return check_number;
	}
	public void setCheck_number(String check_number) {
		this.check_number = check_number;
	}
	public String getEffective_date() {
		return effective_date;
	}
	public void setEffective_date(String effective_date) {
		this.effective_date = effective_date;
	}
	
	public String getItc_1() {
		return itc_1;
	}
	public void setItc_1(String itc_1) {
		this.itc_1 = itc_1;
	}
	public String getItc_10() {
		return itc_10;
	}
	public void setItc_10(String itc_10) {
		this.itc_10 = itc_10;
	}
	public String getItc_11() {
		return itc_11;
	}
	public void setItc_11(String itc_11) {
		this.itc_11 = itc_11;
	}
	public String getItc_12() {
		return itc_12;
	}
	public void setItc_12(String itc_12) {
		this.itc_12 = itc_12;
	}
	public String getItc_2() {
		return itc_2;
	}
	public void setItc_2(String itc_2) {
		this.itc_2 = itc_2;
	}
	public String getItc_3() {
		return itc_3;
	}
	public void setItc_3(String itc_3) {
		this.itc_3 = itc_3;
	}
	public String getItc_4() {
		return itc_4;
	}
	public void setItc_4(String itc_4) {
		this.itc_4 = itc_4;
	}
	public String getItc_5() {
		return itc_5;
	}
	public void setItc_5(String itc_5) {
		this.itc_5 = itc_5;
	}
	public String getItc_6() {
		return itc_6;
	}
	public void setItc_6(String itc_6) {
		this.itc_6 = itc_6;
	}
	public String getItc_7() {
		return itc_7;
	}
	public void setItc_7(String itc_7) {
		this.itc_7 = itc_7;
	}
	public String getItc_8() {
		return itc_8;
	}
	public void setItc_8(String itc_8) {
		this.itc_8 = itc_8;
	}
	public String getItc_9() {
		return itc_9;
	}
	public void setItc_9(String itc_9) {
		this.itc_9 = itc_9;
	}
	public Double getMisc_charge() {
		return misc_charge;
	}
	public void setMisc_charge(Double misc_charge) {
		this.misc_charge = misc_charge;
	}
	public Double getNeg_p() {
		return neg_p;
	}
	public void setNeg_p(Double neg_p) {
		this.neg_p = neg_p;
	}
	public Double getNeg_p_b() {
		return neg_p_b;
	}
	public void setNeg_p_b(Double neg_p_b) {
		this.neg_p_b = neg_p_b;
	}
	public Double getNeg_p_u() {
		return neg_p_u;
	}
	public void setNeg_p_u(Double neg_p_u) {
		this.neg_p_u = neg_p_u;
	}
	public Double getOverdraft_base_balance() {
		return overdraft_base_balance;
	}
	public void setOverdraft_base_balance(Double overdraft_base_balance) {
		this.overdraft_base_balance = overdraft_base_balance;
	}
	public Double getOverdraft_protection_fee_amount() {
		return overdraft_protection_fee_amount;
	}
	public void setOverdraft_protection_fee_amount(Double overdraft_protection_fee_amount) {
		this.overdraft_protection_fee_amount = overdraft_protection_fee_amount;
	}
	public Double getOverdraft_trans_amount() {
		return overdraft_trans_amount;
	}
	public void setOverdraft_trans_amount(Double overdraft_trans_amount) {
		this.overdraft_trans_amount = overdraft_trans_amount;
	}
	public Double getOverdraft_ledger_balance() {
		return overdraft_ledger_balance;
	}
	public void setOverdraft_ledger_balance(Double overdraft_ledger_balance) {
		this.overdraft_ledger_balance = overdraft_ledger_balance;
	}
	public Double getPrincipal() {
		return principal;
	}
	public void setPrincipal(Double principal) {
		this.principal = principal;
	}
	public Integer getRecovery_source() {
		return recovery_source;
	}
	public void setRecovery_source(Integer recovery_source) {
		this.recovery_source = recovery_source;
	}
	public Integer getRestructured_loan_sequence() {
		return restructured_loan_sequence;
	}
	public void setRestructured_loan_sequence(Integer restructured_loan_sequence) {
		this.restructured_loan_sequence = restructured_loan_sequence;
	}
	public Double getTotal_sold_amount() {
		return total_sold_amount;
	}
	public void setTotal_sold_amount(Double total_sold_amount) {
		this.total_sold_amount = total_sold_amount;
	}
	public String getTrans_desc() {
		return trans_desc;
	}
	public void setTrans_desc(String trans_desc) {
		this.trans_desc = trans_desc;
	}
	public Double getTransfer_suspense_account() {
		return transfer_suspense_account;
	}
	public void setTransfer_suspense_account(Double transfer_suspense_account) {
		this.transfer_suspense_account = transfer_suspense_account;
	}
	public Integer getAccount_overdraft() {
		return account_overdraft;
	}
	public void setAccount_overdraft(Integer account_overdraft) {
		this.account_overdraft = account_overdraft;
	}
	public Double getTransfer_account_avail_balance() {
		return transfer_account_avail_balance;
	}
	public void setTransfer_account_avail_balance(Double transfer_account_avail_balance) {
		this.transfer_account_avail_balance = transfer_account_avail_balance;
	}
	public Double getTransfer_account_ledger_balance() {
		return transfer_account_ledger_balance;
	}
	public void setTransfer_account_ledger_balance(Double transfer_account_ledger_balance) {
		this.transfer_account_ledger_balance = transfer_account_ledger_balance;
	}
	public Double getTransfer_account_unadv_balance() {
		return transfer_account_unadv_balance;
	}
	public void setTransfer_account_unadv_balance(Double transfer_account_unadv_balance) {
		this.transfer_account_unadv_balance = transfer_account_unadv_balance;
	}
	public String getTrans_type() {
		return trans_type;
	}
	public void setTrans_type(String trans_type) {
		this.trans_type = trans_type;
	}
	public Integer getProduct_type() {
		return product_type;
	}
	public void setProduct_type(Integer product_type) {
		this.product_type = product_type;
	}
	public Double getUnapplied_funds() {
		return unapplied_funds;
	}
	public void setUnapplied_funds(Double unapplied_funds) {
		this.unapplied_funds = unapplied_funds;
	}
	public Double getUncollected_interest() {
		return uncollected_interest;
	}
	public void setUncollected_interest(Double uncollected_interest) {
		this.uncollected_interest = uncollected_interest;
	}
	public Double getUncollected_accrual() {
		return uncollected_accrual;
	}
	public void setUncollected_accrual(Double uncollected_accrual) {
		this.uncollected_accrual = uncollected_accrual;
	}
	public Double getWithholding_amount() {
		return withholding_amount;
	}
	public void setWithholding_amount(Double withholding_amount) {
		this.withholding_amount = withholding_amount;
	}
	public String getReject_batch() {
		return reject_batch;
	}
	public void setReject_batch(String reject_batch) {
		this.reject_batch = reject_batch;
	}
	public Double getCharge_off_amount() {
		return charge_off_amount;
	}
	public void setCharge_off_amount(Double charge_off_amount) {
		this.charge_off_amount = charge_off_amount;
	}
	public Integer getCharge_off_reason() {
		return charge_off_reason;
	}
	public void setCharge_off_reason(Integer charge_off_reason) {
		this.charge_off_reason = charge_off_reason;
	}
	public Double getAccrued_interest() {
		return accrued_interest;
	}
	public void setAccrued_interest(Double accrued_interest) {
		this.accrued_interest = accrued_interest;
	}
	public Double getPenalty_amount() {
		return penalty_amount;
	}
	public void setPenalty_amount(Double penalty_amount) {
		this.penalty_amount = penalty_amount;
	}
	public Double getRecovery_amount() {
		return recovery_amount;
	}
	public void setRecovery_amount(Double recovery_amount) {
		this.recovery_amount = recovery_amount;
	}
	public Integer getBeneficiary_code() {
		return beneficiary_code;
	}
	public void setBeneficiary_code(Integer beneficiary_code) {
		this.beneficiary_code = beneficiary_code;
	}
	public Integer getReg_cc_check_type() {
		return reg_cc_check_type;
	}
	public void setReg_cc_check_type(Integer reg_cc_check_type) {
		this.reg_cc_check_type = reg_cc_check_type;
	}
	public Integer getRetries_remaining() {
		return retries_remaining;
	}
	public void setRetries_remaining(Integer retries_remaining) {
		this.retries_remaining = retries_remaining;
	}
	public String getMisc_screen_data() {
		return misc_screen_data;
	}
	public void setMisc_screen_data(String misc_screen_data) {
		this.misc_screen_data = misc_screen_data;
	}
	public String getKeys_for_xpdo() {
		return keys_for_xpdo;
	}
	public void setKeys_for_xpdo(String keys_for_xpdo) {
		this.keys_for_xpdo = keys_for_xpdo;
	}
	public Double getCompounded_interest() {
		return compounded_interest;
	}
	public void setCompounded_interest(Double compounded_interest) {
		this.compounded_interest = compounded_interest;
	}
	public String getTransaction_class() {
		return transaction_class;
	}
	public void setTransaction_class(String transaction_class) {
		this.transaction_class = transaction_class;
	}
	public String getTransaction_group() {
		return transaction_group;
	}
	public void setTransaction_group(String transaction_group) {
		this.transaction_group = transaction_group;
	}
	public Double getSwhld() {
		return swhld;
	}
	public void setSwhld(Double swhld) {
		this.swhld = swhld;
	}
	public Double getTt_amt_2() {
		return tt_amt_2;
	}
	public void setTt_amt_2(Double tt_amt_2) {
		this.tt_amt_2 = tt_amt_2;
	}
	public Double getVat_lchg() {
		return vat_lchg;
	}
	public void setVat_lchg(Double vat_lchg) {
		this.vat_lchg = vat_lchg;
	}

	public DTJAddition getDtj_addition() {
		
		if(dtj_addition == null) {
			this.dtj_addition = new DTJAddition();
			
		}
		
		return dtj_addition;
	}

	public void setDtj_addition(DTJAddition dtj_addition) {
		this.dtj_addition = dtj_addition;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getEsb_timestamp() {
		return esb_timestamp;
	}

	public void setEsb_timestamp(String esb_timestamp) {
		this.esb_timestamp = esb_timestamp;
	}

	public String getAtm_trans_date() {
		return atm_trans_date;
	}

	public void setAtm_trans_date(String atm_trans_date) {
		this.atm_trans_date = atm_trans_date;
	}

	public String getAtm_message_sequence() {
		return atm_message_sequence;
	}

	public void setAtm_message_sequence(String atm_message_sequence) {
		this.atm_message_sequence = atm_message_sequence;
	}

	public String getGl_set_code() {
		return gl_set_code;
	}

	public void setGl_set_code(String gl_set_code) {
		this.gl_set_code = gl_set_code;
	}

	public Integer getReversed_ec_indicator() {
		return reversed_ec_indicator;
	}

	public void setReversed_ec_indicator(Integer reversed_ec_indicator) {
		this.reversed_ec_indicator = reversed_ec_indicator;
	}

	
	public Timestamp getDetected_date() {
		return detected_date;
	}

	public void setDetected_date(Timestamp detected_date) {
		this.detected_date = detected_date;
	}

	public String getCase_no() {
		return case_no;
	}

	public void setCase_no(String case_no) {
		this.case_no = case_no;
	}
	
	
}
