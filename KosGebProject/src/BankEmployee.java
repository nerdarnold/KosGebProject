
public class BankEmployee extends User {
	private Bank bankId;
	private int id;

	public BankEmployee() {
		super();
	}

	public BankEmployee(Bank bankId, int id) {
		super();
		this.bankId = bankId;
		this.id = id;
	}

	public Bank getBankId() {
		return bankId;
	}

	public void setBankId(Bank bankId) {
		this.bankId = bankId;
	}

	public int getBankEmployeeId() {
		return id;
	}

	public void setBankEmployeeId(int id) {
		this.id = id;
	}

}
