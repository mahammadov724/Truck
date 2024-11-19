package ders7;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Mr Bean");
		student.setAge(69);
		student.setGpa(10);
		System.out.println("Name: " + student.getName());
		System.out.println("Age: " + student.getAge());
		System.out.println("Gpa: " + student.getGpa());
	}

}
