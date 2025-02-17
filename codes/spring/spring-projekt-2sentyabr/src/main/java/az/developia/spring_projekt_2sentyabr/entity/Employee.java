package az.developia.spring_projekt_2sentyabr.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    private int id;
    private String name;
    private int age;
    private double salary;

    @Autowired
    private Computer computer; 

    public Employee() {
        this.id = 101;
        this.name = "John Doe";
        this.age = 30;
        this.salary = 5000.0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String toString() {
        return "Employee: id=" + id + ", name=" + name + ", age=" + age + 
               ", salary=" + salary + ", computer=[" + computer + "]";
    }
}
