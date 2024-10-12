package practic;

public class Student {
	String name;
	int score;
	String grade;
	
	public Student(String _name,int _score){
		this.name = _name;
		this.score = _score;
	}
	
	public void displayInfo(){
		System.out.println(name+" "+score);
	}
}
