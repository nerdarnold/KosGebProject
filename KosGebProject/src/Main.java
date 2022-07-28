import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		User user1 = new User(1, "Ata", "1234564789");
		Bank garanti = new Bank(1, "En iyi banka");
		User user2 = new BankEmployee(garanti, 3);
		Customer badCustomer = new Customer(7);
		Permission permission1 = new Permission(12, "Permission1");
		Permission permission2 = new Permission(78, "Permission2");
		Permission permission3 = new Permission(88, "Permission3");
		List<Permission> permissions = new ArrayList<>();

		for (Permission permission : permissions) {
			permissions.add(permission);
		}
		CustomerPermission customerPermission1 = new CustomerPermission(12, "customerPermission1");
		CustomerPermission customerPermission2 = new CustomerPermission(78, "customerPermission2");
		CustomerPermission customerPermission3 = new CustomerPermission(88, "customerPermission3");

		ArrayList<CustomerPermission> customerPermissions = new ArrayList<>();
		for (CustomerPermission customerPermission : customerPermissions) {
			permissions.add(customerPermission);
		}
		CustomerPermission customerPermission = new CustomerPermission(12, "CustomerPermission");
		BlockedCustomer badUser = new BlockedCustomer(12);
		Employee employee = new Employee(78);
		EmployeeType employeeType = new EmployeeType(54, "EmployeeType1");
		Permission permission = new Permission(12, "Permission1");
		EmployeePermission employeePermission = new EmployeePermission(12, "EmployeePermisson");
		EmployeePermissionValue employeePermissionValue = new EmployeePermissionValue(347, false, employeeType, null);
		LoanType loanType = new LoanType(16, "LoanType1");
		TypeAttribute typeAttribute = new TypeAttribute(12, "TypeAttrbiute1");
		AttributeValue attributeValue = new AttributeValue(777, typeAttribute, 5500);
		TypeAttributeValue typeAttributeValue = new TypeAttributeValue(12, loanType, attributeValue);
		UserType userType1 = new UserType(65, "UserType1");
		UserRole userRole = new UserRole(22, user2, userType1);
		PermissionValue permissionValue = new PermissionValue(3, false, userType1, permissions);
		CustomerPermissionValue customerPermissionValue = new CustomerPermissionValue(0, false, userType1,
				customerPermissions);
		LoanAttribute loanAttribute = new LoanAttribute(17, loanType, null);
		Application application = new Application(0, badCustomer, loanType, Application.Status.PENDING,
				Application.ApplicationType.NOBLE_WINNER);
		System.out.println(employee.getEmployeeId());
	}

}
