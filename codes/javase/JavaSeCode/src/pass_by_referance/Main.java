package pass_by_referance;

public class Main {

	public static void main(String[] args) {
		Person person = new Person("Neriman","Mehemmedov",13,2, "0552222");
		person.printInfo();
		SalaryCalculator salaryCalculator = new SalaryCalculator();
		salaryCalculator.calculateSalary(person);
		
		
	}

}
