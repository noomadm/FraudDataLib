package th.co.ktb.fraud.monitas.models;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gson.Gson;

@Entity
@Table(name = "MNT_RULE")
public class Rule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String rule_name;
	private String rule_class;
	private String require_parameter;
	private String parameter;
	private String created_by;
	private Timestamp created_datetime;
	private String updated_by;
	private Timestamp updated_datetime;
	private boolean active;
	private String area;
	private String rule_type;
	private String owner_groups;
	private String description;
	private Float score;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRule_name() {
		return rule_name;
	}
	public void setRule_name(String rule_name) {
		this.rule_name = rule_name;
	}
	public String getRule_class() {
		return rule_class;
	}
	public void setRule_class(String rule_class) {
		this.rule_class = rule_class;
	}
	public String getRequire_parameter() {
		return require_parameter;
	}
	public void setRequire_parameter(String require_parameter) {
		this.require_parameter = require_parameter;
	}
	public String getParameter() {
		return parameter;
	}
	public void setParameter(String parameter) {
		this.parameter = parameter;
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
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
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
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getOwner_groups() {
		return owner_groups;
	}
	public void setOwner_groups(String owner_groups) {
		this.owner_groups = owner_groups;
	}
	public List<Double> getGroupIds(){
		
		List<Double> groupId = new ArrayList<Double>();
		
		if(owner_groups == null) {
			return groupId;
		}
		
		Gson gson = new Gson();
		groupId = gson.fromJson(owner_groups, groupId.getClass());
		
		return groupId;
		
	}
	public String getRule_type() {
		return rule_type;
	}
	public void setRule_type(String rule_type) {
		this.rule_type = rule_type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Float getScore() {
		return score;
	}
	public void setScore(Float score) {
		this.score = score;
	}
	
	
	
}
