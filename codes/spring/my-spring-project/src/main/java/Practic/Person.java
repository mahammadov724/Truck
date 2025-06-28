package Practic;

public class Person {
	 	public String name;
	    private int age;
	    private String surname;
	    double salary;

	    static String Idk = "Idk";

	    public Person(String name_) {
	        this.name = name_;
	    }

	    private Person(int age_) {
	        this.age = age_;
	    }

	    private Person(String name_, int age_) {
	        this.name = name_;
	        this.age = age_;
	    }

	    Person(String name_, int age_, String surname_, double salary_) {
	        this.name = name_;
	        this.age = age_;
	        this.surname = surname_;
	        this.salary = salary_;
	    }

	    public void publicMethod() {
	        System.out.println("Public");
	    }

	    private void privateMethod() {
	        System.out.println("private");
	    }
	    
		public void protectedMethod() {
			System.out.println("protected");
		}

	    void defaultMethod() {
	        System.out.println("Default");
	    }

	    public void finalParameterMethod(final String message) {
	        System.out.println("Final" + message);
	    }

}
