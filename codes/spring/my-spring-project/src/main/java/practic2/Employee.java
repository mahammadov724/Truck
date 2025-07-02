package practic2;

public class Employee extends Person {
    double salary;
    String department;
    String username;
    String password;

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("salary: " + salary);
        System.out.println("department: " + department);
        System.out.println("username: " + username);
        System.out.println("password: " + password);
    }
}
