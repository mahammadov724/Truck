package practic;

public class CalculateGrade {
	public void calculategrade(Student student){
		if (student.score >= 90) {
			student.grade = "A";
		}
		else if (student.score >= 80) {
			student.grade = "B";
		}
		else if (student.score >= 70) {
			student.grade = "C";
		}
		else if (student.score >= 60) {
			student.grade = "D";
		}
		else {
			student.grade = "F";
		}
		System.out.println(student.grade);
	}
	
	public static void neriman() {
		
	}
}
