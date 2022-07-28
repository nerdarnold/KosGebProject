
public class Customer extends User {
	private int id;

	public Customer() {
		super();
	}

	public Customer(int id) {
		super();
		this.id = id;
	}

	public int getCustomerId() {
		return id;
	}

	public void setCustomerId(int id) {
		this.id = id;
	}

}
