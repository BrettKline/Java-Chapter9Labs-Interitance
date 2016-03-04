
public class Employee {
	private String name;
	private String idNumber;
	private String hireDate;
	
	public String getName() {
		return name;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public Employee(String name, String idNumber, String hireDate) {
		this.name = name;
		this.idNumber = idNumber;
		this.hireDate = hireDate;
	}
}
