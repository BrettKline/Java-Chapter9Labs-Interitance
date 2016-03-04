import java.util.Scanner;
public class Prog9_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("We're going to make a ProductionWorker class object. I need five chunks of data: \r\nEmployee Name (String)\r\nEmployee ID number (String)\r\nHiring date (String)\r\nShift (int)\r\nHourly rate (double)\r\n");
		String myName = input.nextLine();
		String myID = input.nextLine();
		String myHireDate = input.nextLine();
		int myShift = input.nextInt();
		double myHourly = input.nextDouble();
		
		ProductionWorker myProductionWorker = new ProductionWorker(myName, myID, myHireDate, myShift, myHourly);
		System.out.println(myProductionWorker);
		
		input.close(); 
	}

}
