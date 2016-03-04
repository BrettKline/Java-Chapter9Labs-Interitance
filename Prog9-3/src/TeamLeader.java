
public class TeamLeader extends ProductionWorker {
	private double bonus;
	private double requiredHours;
	private double meetingHours;
	private boolean getsBonus;
	
	public TeamLeader(String name, String idNumber, String hireDate, int shift, double payRate, double bonus, double requiredHours, double meetingHours) {
		super(name, idNumber, hireDate, shift, payRate);
		this.bonus = bonus;
		this.requiredHours = requiredHours;
		this.meetingHours = meetingHours;
		if (meetingHours >= requiredHours) {
			getsBonus = true;
		}
		else {
			getsBonus = false;
		}
	}

	@Override
	public String toString() {
		return "I am a TeamLeader. My potential bonus is $" + bonus + " my required Hours to get that is " + requiredHours + ", and the hours I went to meetings for was " + meetingHours
				+ ", so I will" + (getsBonus ? " " : " not") + " get my bonus.\r\nI work Shift " + getShift() + ", have a PayRate of $" + getPayRate()
				+ " per hour, my name is " + getName() + ", my IdNumber is " + getIdNumber() + ", and my HireDate is " + getHireDate()
				+ ".";
	}
}
