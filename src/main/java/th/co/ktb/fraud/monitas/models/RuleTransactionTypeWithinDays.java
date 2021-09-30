package th.co.ktb.fraud.monitas.models;

import java.sql.Date;
import java.util.List;

public class RuleTransactionTypeWithinDays {

	private List<String> transactionTypes;
	private List<String> depositTransactionTypes;
	private List<String> withdrawTransactionTyps;
	private double transactionAmount;
	private double fraudAmount;
	private String sign;
	private int transactionCount;
	private int withinDays;
	private Date date;
	private Date startDate;
	
	
	public List<String> getTransactionTypes() {
		return transactionTypes;
	}
	public void setTransactionTypes(List<String> transactionTypes) {
		this.transactionTypes = transactionTypes;
	}
	
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public int getWithinDays() {
		return withinDays;
	}
	public void setWithinDays(int withinDays) {
		this.withinDays = withinDays;
	}
	public double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public int getTransactionCount() {
		return transactionCount;
	}
	public void setTransactionCount(int transactionCount) {
		this.transactionCount = transactionCount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<String> getDepositTransactionTypes() {
		return depositTransactionTypes;
	}
	public void setDepositTransactionTypes(List<String> depositTransactionTypes) {
		this.depositTransactionTypes = depositTransactionTypes;
	}
	public List<String> getWithdrawTransactionTyps() {
		return withdrawTransactionTyps;
	}
	public void setWithdrawTransactionTyps(List<String> withdrawTransactionTyps) {
		this.withdrawTransactionTyps = withdrawTransactionTyps;
	}
	public double getFraudAmount() {
		return fraudAmount;
	}
	public void setFraudAmount(double fraudAmount) {
		this.fraudAmount = fraudAmount;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	
}
