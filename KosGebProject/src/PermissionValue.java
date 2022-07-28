import java.util.ArrayList;
import java.util.List;

public class PermissionValue {
	private int id;
	private boolean value;
	private UserType userTypeId;
	private List<Permission> permissions;
	private ArrayList<CustomerPermission> customerPermissions;

	public PermissionValue() {
		super();
	}

	public PermissionValue(int id, boolean value, UserType userTypeId,
			ArrayList<CustomerPermission> customerPermissions) {
		super();
		this.id = id;
		this.value = value;
		this.userTypeId = userTypeId;
		this.customerPermissions = customerPermissions;
	}

	public PermissionValue(int id, boolean value, UserType userTypeId, List<Permission> permissions) {
		super();
		this.id = id;
		this.value = value;
		this.userTypeId = userTypeId;
		this.permissions = permissions;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isValue() {
		return value;
	}

	public void setValue(boolean value) {
		this.value = value;
	}

	public UserType getUserTypeId() {
		return userTypeId;
	}

	public void setUserTypeId(UserType userTypeId) {
		this.userTypeId = userTypeId;
	}

	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	public ArrayList<CustomerPermission> getCustomerPermissions() {
		return customerPermissions;
	}

	public void setCustomerPermissions(ArrayList<CustomerPermission> customerPermissions) {
		this.customerPermissions = customerPermissions;
	}

}
