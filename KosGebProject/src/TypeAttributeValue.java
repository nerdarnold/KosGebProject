
public class TypeAttributeValue {
	private int id;
	private LoanType loanTypeId;
	private AttributeValue attributeValueId;

	public TypeAttributeValue() {
		super();
	}

	public TypeAttributeValue(int id, LoanType loanTypeId, AttributeValue attributeValueId) {
		super();
		this.id = id;
		this.loanTypeId = loanTypeId;
		this.attributeValueId = attributeValueId;
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

	public AttributeValue getAttributeValueId() {
		return attributeValueId;
	}

	public void setAttributeValueId(AttributeValue attributeValueId) {
		this.attributeValueId = attributeValueId;
	}

}
