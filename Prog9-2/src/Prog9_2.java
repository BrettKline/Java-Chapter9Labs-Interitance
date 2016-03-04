import java.util.Scanner;

public class Prog9_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("We're going to make a ShiftSupervisor class object. I need five chunks of data: \r\nEmployee Name (String)\r\nEmployee ID number (String)\r\nHiring date (String)\r\nSalary (double)\r\nSupervisor bonus (double)\r\n");
		String myName = input.nextLine();
		String myID = input.nextLine();
		String myHireDate = input.nextLine();
		double mySalary = input.nextDouble();
		double myBonus = input.nextDouble();
		
		ShiftSupervisor myShiftSupervisor = new ShiftSupervisor(myName, myID, myHireDate, mySalary, myBonus);
		System.out.println(myShiftSupervisor);
		
		input.close(); 

	}

}
