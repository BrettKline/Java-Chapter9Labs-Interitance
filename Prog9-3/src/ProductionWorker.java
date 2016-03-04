
public class ProductionWorker extends Employee {
	private int shift;
	private double payRate;
	public ProductionWorker(String name, String idNumber, String hireDate, int shift, double payRate) {
		super(name, idNumber, hireDate);
		this.shift = shift;
		this.payRate = payRate;
	}
	@Override
	public String toString() {
		return "ProductionWorker [shift=" + shift + ", payRate=" + payRate + ", getName()=" + getName()
				+ ", getIdNumber()=" + getIdNumber() + ", getHireDate()=" + getHireDate() + "]";
	}
	public int getShift() {
		return shift;
	}
	public double getPayRate() {
		return payRate;
	}
	public void setShift(int shift) {
		this.shift = shift;
	}
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

}
