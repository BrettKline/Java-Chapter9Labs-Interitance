
public class Essay extends GradedActivity {
	private double grammar;
	private double spelling;
	private double correctLength;
	private double content;
	private double sum;
	
	public Essay(double grammar, double spelling, double correctLength, double content) {
		if (grammar > 30) {
			this.grammar = 30;
		}
		else if (grammar < 0) {
			this.grammar = 0;
		}
		else {
			this.grammar = grammar;
		}
		
		if (spelling > 20) {
			this.spelling = 20;
		}
		else if (spelling < 0) {
			this.spelling = 0;
		}
		else {
			this.spelling = spelling;
		}
		
		if (correctLength > 20) {
			this.correctLength = 20;
		}
		else if (correctLength < 0) {
			this.correctLength = 0;
		}
		else {
			this.correctLength = correctLength;
		}
		
		if (content > 30) {
			this.content = 30;
		}
		else if (content < 0) {
			this.content = 0;
		}
		else {
			this.content = content;
		}		
		sum = this.grammar + this.spelling + this.correctLength + this.content;
		score = sum;
	}
	
	
}
