
public class Employee extends User {
	private int id;

	public Employee() {
		super();
	}

	public Employee(int id) {
		super();
		this.id = id;
	}

	public int getEmployeeId() {
		return id;
	}

	public void setEmployeeId(int id) {
		this.id = id;
	}

}
