import java.util.Scanner;

public class Prog9_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("We're going to make a TeamLeader class object. I need eight chunks of data: \r\nEmployee Name (String)\r\nEmployee ID number (String)\r\nHiring date (String)\r\nWhich shift (int)\r\nPay rate (double)\r\nTeam Leader bonus (double)\r\nHours required (double)\r\nHours completed (double)\r\n");
		String myName = input.nextLine();
		String myID = input.nextLine();
		String myHireDate = input.nextLine();
		int myShift = input.nextInt();
		double mySalary = input.nextDouble();
		double myBonus = input.nextDouble();
		double myRequiredHours = input.nextDouble();
		double myCompletedHours = input.nextDouble();
		
		TeamLeader myTeamLeader = new TeamLeader(myName, myID, myHireDate, myShift, mySalary, myBonus, myRequiredHours, myCompletedHours);
		System.out.println(myTeamLeader);
		
		input.close(); 

	}

}