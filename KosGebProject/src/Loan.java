import java.time.LocalDate;
import java.util.List;

public class Loan {
	private int id;
	private List<Customer> customers;
	private LoanType loanTypeId;
	private LocalDate startedDate;
	private LocalDate dueDate;

	public Loan() {
		super();
	}

	public Loan(int id, List<Customer> customers, LoanType loanTypeId, LocalDate startedDate, LocalDate dueDate) {
		super();
		this.id = id;
		this.customers = customers;
		this.loanTypeId = loanTypeId;
		this.startedDate = startedDate;
		this.dueDate = dueDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public LoanType getLoanTypeId() {
		return loanTypeId;
	}

	public void setLoanTypeId(LoanType loanTypeId) {
		this.loanTypeId = loanTypeId;
	}

	public LocalDate getStartedDate() {
		return startedDate;
	}

	public void setStartedDate(LocalDate startedDate) {
		this.startedDate = startedDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

}
