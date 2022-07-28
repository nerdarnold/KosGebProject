import java.util.List;

public class LoanAttribute {
	private int id;
	private LoanType loanTypeId;
	private List<TypeAttribute> typeAttributes;

	public LoanAttribute() {
		super();
	}

	public LoanAttribute(int id, LoanType loanTypeId, List<TypeAttribute> typeAttributes) {
		super();
		this.id = id;
		this.loanTypeId = loanTypeId;
		this.typeAttributes = typeAttributes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LoanType getLoanTypeId() {
		return loanTypeId;
	}

	public void setLoanTypeId(LoanType loanTypeId) {
		this.loanTypeId = loanTypeId;
	}

	public List<TypeAttribute> getTypeAttributes() {
		return typeAttributes;
	}

	public void setTypeAttributes(List<TypeAttribute> typeAttributes) {
		this.typeAttributes = typeAttributes;
	}

}
