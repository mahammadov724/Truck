package Practic;

public class ModifiersDemo {
	public static void main(String[] args) {
        Person person = new Person("Ali", 25, "Mahammadov", 6500.0);
        person.publicMethod();
        person.protectedMethod();
        person.defaultMethod();
        person.finalParameterMethod("Final");
        System.out.println("Idk: " + Person.Idk);
    }
}
