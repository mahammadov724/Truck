package pass_by_referance;

public class Person {
	String Name;
	String Surname;
	int experienceYear;
	double salary;
	String phone;
	
//	public Person() {
//		
//	}
	public Person(String _Name,String _Surname,int _experienceYear,double _salary,String _phone){
		this.Name = _Name;
		this.Surname = _Surname;
		this.experienceYear = _experienceYear;
		this.salary = _salary;
		this.phone = _phone;
	}
	
	public void printInfo() {
		System.out.println(Name+" "+Surname+" "+experienceYear+" "+salary+" "+phone);
	}
}
