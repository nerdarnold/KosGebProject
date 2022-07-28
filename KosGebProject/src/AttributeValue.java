
public class AttributeValue {
	private int id;
	private TypeAttribute typeAttributeId;
	private int value;

	public AttributeValue() {
	}

	public AttributeValue(int id, TypeAttribute typeAttributeId, int value) {
		this.id = id;
		this.typeAttributeId = typeAttributeId;
		this.value = value;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TypeAttribute getTypeAttributeId() {
		return typeAttributeId;
	}

	public void setTypeAttributeId(TypeAttribute typeAttributeId) {
		this.typeAttributeId = typeAttributeId;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
