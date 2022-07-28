import java.util.List;

public class BlockedCustomer {
	private int id;
	private List<Customer> customers;

	public BlockedCustomer() {
		super();
	}

	public BlockedCustomer(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Customer> getCustomerId() {
		return customers;
	}

	public void setCustomerId(List<Customer> customers) {
		this.customers = customers;
	}

}
