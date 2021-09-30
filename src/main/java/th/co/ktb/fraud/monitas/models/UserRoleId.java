package th.co.ktb.fraud.monitas.models;

import java.io.Serializable;
import java.util.Objects;

public class UserRoleId  implements Serializable{

	private int user_id;
	private int role_id;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserRoleId)) return false;
        UserRoleId that = (UserRoleId) o;
        return Objects.equals(getUser_id(), that.getUser_id()) &&
                Objects.equals(getRole_id(), that.getRole_id());
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(getUser_id(), getRole_id());
    }
}
