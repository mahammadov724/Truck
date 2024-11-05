package ders19;

public class ModifiersDemo {

	public static void main(String[] args) {
		Person person1 = new Person("Ali", 25, "Bakı", 1000);
	    Person person2 = new Person("Rasul", 30, "Qusar", 600);
		
        person1.displayInfo();
        person2.displayInfo();

        person1.displayName();
        person2.displayName();

        person1.displaySalary();
        person2.displaySalary();
	}

}
