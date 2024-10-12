package pass_by_referance;

public class SalaryCalculator {
	public void calculateSalary(Person person){
		if (person.experienceYear == 1) {
			person.salary= 500;
		}
		else if (person.experienceYear == 2) {
			person.salary= 1000;
		}
		else if (person.experienceYear == 3) {
			person.salary= 1500;
		}
		else {
			person.salary=1500+(person.experienceYear-3)*500;
		}
		System.out.println(person.salary);
	}
}
