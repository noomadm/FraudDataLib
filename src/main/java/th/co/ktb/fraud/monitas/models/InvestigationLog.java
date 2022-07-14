package th.co.ktb.fraud.monitas.models;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.NotFound;

@Entity
@Table(name = "MNT_CASE_HISTORY")
public class InvestigationLog implements Serializable,Cloneable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long case_id;
	private Integer user_id;
	private Integer to_user_id;
	private Integer group_id;
	
	//@NotNull(message = "Comment is required")
	//@NotBlank(message = "Comment is required")
	//@Max(message = "Comment cannot be long over 2,000 characters",value = 2000)
	private String comment;
	
	private String created_by;
	private Timestamp created_datetime;
	private String updated_by;
	private Timestamp updated_datetime;
	
	//@NotNull(message = "Recommend is required")
	//@NotBlank(message = "Recommend is required")
	private String recommend;
	
	//@NotNull(message = "Fraud Type is required")
	//@Min(value = 0,message = "Fraud Type is required")
	private Integer fraud_type_id;
	private String action;
	
	//@NotNull(message = "Call Status is required")
	//(message = "Call Status is required")
	private String call_status;
	
	@Min(value = 0)
	@Max(value=2147483647)
	private Double protected_amount;
	private Boolean is_draft;
	private Boolean is_watch;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCase_id() {
		return case_id;
	}
	public void setCase_id(Long case_id) {
		this.case_id = case_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getTo_user_id() {
		return to_user_id;
	}
	public void setTo_user_id(Integer to_user_id) {
		this.to_user_id = to_user_id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public Timestamp getCreated_datetime() {
		return created_datetime;
	}
	public void setCreated_datetime(Timestamp created_datetime) {
		this.created_datetime = created_datetime;
	}
	public String getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	public Timestamp getUpdated_datetime() {
		return updated_datetime;
	}
	public void setUpdated_datetime(Timestamp updated_datetime) {
		this.updated_datetime = updated_datetime;
	}
	public String getRecommend() {
		return recommend;
	}
	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}
	public Integer getFraud_type_id() {
		return fraud_type_id;
	}
	public void setFraud_type_id(Integer fraud_type_id) {
		this.fraud_type_id = fraud_type_id;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getCall_status() {
		return call_status;
	}
	public void setCall_status(String call_status) {
		this.call_status = call_status;
	}
	public Double getProtected_amount() {
		return protected_amount;
	}
	public void setProtected_amount(Double protected_amount) {
		this.protected_amount = protected_amount;
	}
	public Boolean isIs_draft() {
		return is_draft;
	}
	public void setIs_draft(Boolean is_draft) {
		this.is_draft = is_draft;
	}
	
	public void setReassigned(boolean value) {
		
	}
	
	public boolean isReassigned() {
		return "REASSIGNED".equals(this.recommend);
	}
	public Boolean isIs_watch() {
		return is_watch;
	}
	public void setIs_watch(Boolean is_watch) {
		this.is_watch = is_watch;
	}
	public Integer getGroup_id() {
		return group_id;
	}
	public void setGroup_id(Integer group_id) {
		this.group_id = group_id;
	}
	
	public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
	
}
