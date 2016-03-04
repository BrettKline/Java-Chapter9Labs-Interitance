
public class PassFailActivity extends GradedActivity{
	private double minPassingScore;
	
	public PassFailActivity(double mpa) {
		minPassingScore = mpa;
	}
	
	public char getGrade() {
		char letterGrade;
		if (super.getScore() >= minPassingScore) {
			letterGrade = 'P';
		}
		else {
			letterGrade = 'F';
		}
		return letterGrade;
	}
} 
