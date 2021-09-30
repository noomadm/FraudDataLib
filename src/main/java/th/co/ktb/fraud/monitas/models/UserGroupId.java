package th.co.ktb.fraud.monitas.models;

import java.io.Serializable;
import java.util.Objects;

public class UserGroupId implements Serializable{

	private int user_id;
	private int group_id;
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getGroup_id() {
		return group_id;
	}
	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserGroupId)) return false;
        UserGroupId that = (UserGroupId) o;
        return Objects.equals(getUser_id(), that.getUser_id()) &&
                Objects.equals(getGroup_id(), that.getGroup_id());
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(getUser_id(), getGroup_id());
    }
	
}
