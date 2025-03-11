package az.developia.spring_teacher_projekt.entity;

import jakarta.validation.constraints.Size;

public class Student {
	
	private int id;
	@Size(min = 2,max = 30,message = "minimum 2 maksimum 30 simvol ola biler!")
	private int name;
	private String surname;
	private double salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", surname=" + surname + ", salary=" + salary + "]";
	}
}
