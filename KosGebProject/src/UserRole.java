
public class UserRole {
	private int id;
	private User userId;
	private UserType typeId;

	public UserRole() {
	}

	public UserRole(int id, User userId, UserType typeId) {
		this.id = id;
		this.userId = userId;
		this.typeId = typeId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public UserType getTypeId() {
		return typeId;
	}

	public void setTypeId(UserType typeId) {
		this.typeId = typeId;
	}

}
