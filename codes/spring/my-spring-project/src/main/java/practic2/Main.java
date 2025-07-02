package practic2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.id = 1;
        employee.name = "Nihat";
        employee.surname = "Quliyev";
        employee.age = 30;
        employee.phone = "+99423423423423423";
        employee.address = "Bakı, Azərbaycan";

        employee.salary = 3500.50;
        employee.department = "İT";
        employee.username = "nihat12323";
        employee.password = "sifrə123";

        employee.printInfo();
    }
}