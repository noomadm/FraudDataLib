package th.co.ktb.fraud.monitas.models;

import java.util.List;

import th.co.ktb.fraud.monitas.helpers.DataAnalysisHelpers;

public class PatternAnalysisConfig {

	public PatternAnalysisConfig() {
		
	}
	
	private List<PatternAnalysisColumnConfig> columns;

	public List<PatternAnalysisColumnConfig> getColumns() {
		
		if(columns == null) {
			columns = DataAnalysisHelpers.getDefaultColumnConfig();
		}
		
		return columns;
	}

	public void setColumns(List<PatternAnalysisColumnConfig> columns) {
		this.columns = columns;
	}
	
}
