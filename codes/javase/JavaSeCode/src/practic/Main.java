package practic;

public class Main {

	public static void main(String[] args) {
		Student student = new Student("Neriman",61);
		student.displayInfo();
		CalculateGrade calculateGrade = new CalculateGrade();
		calculateGrade.calculategrade(student);
		calculateGrade.neriman();
		
		CalculateGrade.neriman();
		
	}

}
