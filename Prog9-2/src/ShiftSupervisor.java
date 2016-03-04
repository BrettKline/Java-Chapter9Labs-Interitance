
public class ShiftSupervisor extends Employee {
	private double salary;
	private double bonus;
	ShiftSupervisor(String name, String idNumber, String hireDate, double salary, double bonus) {
		super(name, idNumber, hireDate);
		this.salary = salary;
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return "I am a ShiftSupervisor. My Salary is $" + getSalary() + ", my Bonus is $" + getBonus() + " my Name is " + getName()
				+ ", my IdNumber is " + getIdNumber() + ", and my HireDate is " + getHireDate() + ".";
	}
	public double getSalary() {
		return salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
}
