package ders19;

public class Person {
	public String name;
    private int age;
    protected String city;
    int salary;
    
    static int WholeSalary = 0;
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", City: " + city + ", Salary: " + salary);
    }
    
    protected void displaySalary() {
        System.out.println("Maaş: " + salary);
    }
    
    void displayName() {
        System.out.println("Name: " + name);
    }
    
    public void YeniMaaş(final double yeniMaaş) {
        this.salary = (int) yeniMaaş;
        System.out.println("Yeni Maaşınız: " + yeniMaaş);
    }

    
    public Person() {
        this.name = "Nəriman";
        this.age = 14;
        this.city = "Bakı";
        this.salary = 0;
    }
    
    public Person(String name, int age, String city, int salary) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.salary = salary;
    }

    
    public Person(String name) {
        this.name = name;
        this.age = 23;
        this.city = "Qusar";
        this.salary = 0;
    }
}
