package th.co.ktb.fraud.monitas.helpers;

import java.util.ArrayList;
import java.util.List;

import th.co.ktb.fraud.monitas.models.PatternAnalysisColumnConfig;
import th.co.ktb.fraud.monitas.repositories.PatternAnalysisRepository;

public class DataAnalysisHelpers {

	public static List<PatternAnalysisColumnConfig> getDefaultColumnConfig(){
	
		List<PatternAnalysisColumnConfig> columns = new ArrayList<PatternAnalysisColumnConfig>();
		
		columns.add(new PatternAnalysisColumnConfig("case_no", "Alert ID"));
		columns.add(new PatternAnalysisColumnConfig("user_id", "User ID"));
		columns.add(new PatternAnalysisColumnConfig("status", "Status"));
		columns.add(new PatternAnalysisColumnConfig("area", "Fraud Area"));
		columns.add(new PatternAnalysisColumnConfig("rule_name", "Scenario No."));
		columns.add(new PatternAnalysisColumnConfig("trans_date", "Trxn Date","date","DD/MM/YYYY"));
		columns.add(new PatternAnalysisColumnConfig("clock_time", "Trxn Time","clock_time","HH:mm"));
		columns.add(new PatternAnalysisColumnConfig("trans_amount", "Trxn Amount","number",null));
		columns.add(new PatternAnalysisColumnConfig("card_no", "Card No.","number","#### #### #### ####",false)); // not found
		columns.add(new PatternAnalysisColumnConfig("from_card_no", "From Cust No.",false)); // not found
		columns.add(new PatternAnalysisColumnConfig("from_account_no", "From A/C No.")); //not found
		columns.add(new PatternAnalysisColumnConfig("from_branch_code", "From A/C Branch Code",false));
		columns.add(new PatternAnalysisColumnConfig("from_branch_name", "From A/C Branch Name",false));
		columns.add(new PatternAnalysisColumnConfig("from_bank_code", "From Bank Code",false)); //not found
		columns.add(new PatternAnalysisColumnConfig("from_bank_name", "From Bank Name",false)); //not found
		columns.add(new PatternAnalysisColumnConfig("from_ac_province", "From A/C Province",false)); //not found
		columns.add(new PatternAnalysisColumnConfig("to_card_no", "To Cust No.",false)); //not found
		columns.add(new PatternAnalysisColumnConfig("to_card_name", "To Card Name",false)); //not found
		columns.add(new PatternAnalysisColumnConfig("to_account_no", "To A/C No.")); //not found
		columns.add(new PatternAnalysisColumnConfig("to_branch_code", "To A/C Branch Code",false)); //not found
		columns.add(new PatternAnalysisColumnConfig("to_branch_name", "To A/C Branch Name",false)); //not found
		columns.add(new PatternAnalysisColumnConfig("to_bank_code", "To Bank Code",false)); //not found
		columns.add(new PatternAnalysisColumnConfig("to_bank_name", "To Bank Name",false)); //not found
		columns.add(new PatternAnalysisColumnConfig("to_ac_province", "To A/C Province",false)); //not found
		columns.add(new PatternAnalysisColumnConfig("external_trans_code", "TRC"));
		columns.add(new PatternAnalysisColumnConfig("response_code", "Resp.Code"));
		columns.add(new PatternAnalysisColumnConfig("ending_balance", "Available Balance","number",null));
		columns.add(new PatternAnalysisColumnConfig("user_id", "Teller ID"));
		columns.add(new PatternAnalysisColumnConfig("override_id", "Override ID",false)); //not found
		columns.add(new PatternAnalysisColumnConfig("branch_code", "Trxn Branch Code"));
		columns.add(new PatternAnalysisColumnConfig("trxn_branch_name", "Trxn Branch Name"));
		columns.add(new PatternAnalysisColumnConfig("trxn_branch_province", "Trxn Branch Province"));
		columns.add(new PatternAnalysisColumnConfig("trans_location", "Location"));
		columns.add(new PatternAnalysisColumnConfig("term_id", "Term ID",false));//not found
		columns.add(new PatternAnalysisColumnConfig("term_bank", "Term Bank",false));//not found
		columns.add(new PatternAnalysisColumnConfig("term_city", "Term City",false));//not found
		columns.add(new PatternAnalysisColumnConfig("term_province", "Term Province",false));//not found
		columns.add(new PatternAnalysisColumnConfig("term_country", "Term Country",false));//not found
		columns.add(new PatternAnalysisColumnConfig("merchant_id", "Merchant ID",false));//not found
		columns.add(new PatternAnalysisColumnConfig("merchant_name", "Merchant Name",false));//not found
		columns.add(new PatternAnalysisColumnConfig("merchant_category", "Merchant Category",false));//not found
		columns.add(new PatternAnalysisColumnConfig("merchant_city", "Merchant City",false));//not found
		columns.add(new PatternAnalysisColumnConfig("acquirer_code", "Acquirer Code",false));//not found
		columns.add(new PatternAnalysisColumnConfig("pos_info", "POS Info",false));//not found
		columns.add(new PatternAnalysisColumnConfig("pos_entry_mode", "POS Entry Mode",false));//not found
		columns.add(new PatternAnalysisColumnConfig("plus_post_con_code", "Plus POS Con. Code",false));//not found
		columns.add(new PatternAnalysisColumnConfig("date_time", "MQ Date","date","DD/MM/YYYY"));
		columns.add(new PatternAnalysisColumnConfig("date_time", "MQ Time","date","hh:mm"));
		columns.add(new PatternAnalysisColumnConfig("alert_datetime", "Alert Date","date","DD/MM/YYYY"));
		columns.add(new PatternAnalysisColumnConfig("alert_datetime", "Alert Time","date","hh:mm"));
		columns.add(new PatternAnalysisColumnConfig("trans_type", "Trxn Type"));
		columns.add(new PatternAnalysisColumnConfig("trxn_mode", "Trxn Mode"));//not found
		columns.add(new PatternAnalysisColumnConfig("trxn_channel", "Trxn Channel"));//not found
		columns.add(new PatternAnalysisColumnConfig("external_trans_code", "Trxn Code"));//not found

		return columns;
		
	}
	
}
