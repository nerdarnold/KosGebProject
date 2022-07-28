
public class Application {
	private int id;
	private Customer customerId;
	private LoanType loanTypeId;
	private Status status;
	private ApplicationType applicationType;

	public Application() {
		super();
	}

	public Application(int id, Customer customerId, LoanType loanTypeId, Application.Status status,
			Application.ApplicationType applicationType) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.loanTypeId = loanTypeId;
		this.status = status;
		this.applicationType = applicationType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}

	public LoanType getLoanTypeId() {
		return loanTypeId;
	}

	public void setLoanTypeId(LoanType loanTypeId) {
		this.loanTypeId = loanTypeId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public ApplicationType getApplicationType() {
		return applicationType;
	}

	public void setApplicationType(ApplicationType applicationType) {
		this.applicationType = applicationType;
	}

	protected enum Status {
		PENDING, ACCEPTED
	}

	protected enum ApplicationType {
		NOBLE_WINNER, BACKUP_WINNER, WAITING
	}
}
