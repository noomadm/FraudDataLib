package th.co.ktb.fraud.monitas.models;

public class PatternAnalysisColumnConfig {
	
	private String column;
	private String label;
	private String dataType;
	private String format;
	private boolean sortable = true;
	
	public PatternAnalysisColumnConfig() {
		
	}
	
	public PatternAnalysisColumnConfig(String column,String label,String dataType,String format) {
		
		this.column = column;
		this.label = label;
		this.dataType = dataType;
		this.format = format;
		
	}
	
	public PatternAnalysisColumnConfig(String column,String label,String dataType,String format,boolean sortable) {
		
		this.column = column;
		this.label = label;
		this.dataType = dataType;
		this.format = format;
		this.sortable = sortable;
		
	}
	
	public PatternAnalysisColumnConfig(String column,String label) {
		
		this.column = column;
		this.label = label;
		this.dataType = "String";
		
	}
	
public PatternAnalysisColumnConfig(String column,String label,boolean sortable) {
		
		this.column = column;
		this.label = label;
		this.dataType = "String";
		this.sortable = sortable;
		
	}
	
	public String getColumn() {
		return column;
	}
	public void setColumn(String column) {
		this.column = column;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}

	public boolean isSortable() {
		return sortable;
	}

	public void setSortable(boolean sortable) {
		this.sortable = sortable;
	}
	
	
	
}
