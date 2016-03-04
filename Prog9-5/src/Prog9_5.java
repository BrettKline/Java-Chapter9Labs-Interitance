
public class Prog9_5 {

	public static void main(String[] args) {
		GradedActivity lab = new GradedActivity();
		lab.setScore(89);
		GradedActivity PFExam = new GradedActivity();
		PFExam.setScore(56);
		GradedActivity essay = new GradedActivity();
		essay.setScore(77);
		GradedActivity finalExam = new GradedActivity();
		finalExam.setScore(84);
		
		GradedActivity[] myClass = {lab, PFExam, essay, finalExam };
		CourseGrades myGrades = new CourseGrades(myClass);
		

	}

}
