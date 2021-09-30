package th.co.ktb.fraud.monitas.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import th.co.ktb.fraud.monitas.repositories.CustomerProfileRepository;


public class DTJAddition implements Serializable{

	private static Logger logger = LoggerFactory.getLogger(DTJAddition.class);
	
	public DTJAddition() {
		read_by_rule = new ArrayList<Integer>();
	}
	
	private List<Integer> read_by_rule;
	private Map<Long,Case> cases;
	private Boolean staff;
	private Boolean sameLastName;

	public List<Integer> getRead_by_rule() {
		return read_by_rule;
	}

	public void setRead_by_rule(List<Integer> read_by_rule) {
		this.read_by_rule = read_by_rule;
	}

	public Boolean getStaff() {
		return staff;
	}

	public void setStaff(Boolean staff) {
		this.staff = staff;
	}

	public Boolean getSameLastName() {
		return sameLastName;
	}

	public void setSameLastName(Boolean sameLastName) {
		this.sameLastName = sameLastName;
	}
	
	public Boolean getSameLastName(CustomerProfileRepository repo,String accountNumber,String tellerLastName) {
		
		if(sameLastName == null) {
			this.sameLastName = repo.hasTellerLastName(accountNumber, tellerLastName) > 0;
		}
		
		return sameLastName;
		
	}
	
	public Boolean getStaff(CustomerProfileRepository repo,String accountNumber) {
		
		logger.debug("staff value : {}",staff);
		
		if(staff == null) {
			this.staff = repo.hasKTBStaff(accountNumber) > 0;
		}
		
		return staff;
		
	}

	public Map<Long,Case> getCases() {
		
		if(cases == null) {
			cases = new HashMap<Long, Case>();
		}
		
		return cases;
	}

	public void setCases(Map<Long,Case> cases) {
		this.cases = cases;
	}
	
}
