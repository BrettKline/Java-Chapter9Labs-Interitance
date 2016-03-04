import java.util.Scanner;
public class Prog9_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("It's time to do some essay grading! What were your scores in:\r\ngrammar (30% of your grade), spelling (20%), length (20%), and content (30%)?");
		double grammar = input.nextDouble(), spelling = input.nextDouble(), length = input.nextDouble(), content = input.nextDouble();
		Essay myEssay = new Essay(grammar, spelling, length, content);
		
		System.out.println("You got a(n) " + myEssay.getGrade() + " on the essay.");
		
		input.close();
	}

}
