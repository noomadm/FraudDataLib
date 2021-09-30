package th.co.ktb.fraud.monitas.models;

import java.io.Serializable;
import java.util.Objects;

public class CaseFileId implements Serializable{

	private long case_id;
	private long file_id;
	public long getCase_id() {
		return case_id;
	}
	public void setCase_id(long case_id) {
		this.case_id = case_id;
	}
	public long getFile_id() {
		return file_id;
	}
	public void setFile_id(long file_id) {
		this.file_id = file_id;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CaseFileId)) return false;
        CaseFileId that = (CaseFileId) o;
        return Objects.equals(getCase_id(), that.getCase_id()) &&
                Objects.equals(getFile_id(), that.getFile_id());
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(getCase_id(), getFile_id());
    }
	
}
