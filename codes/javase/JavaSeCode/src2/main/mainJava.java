package main;

import common.CommonData;

public class mainJava {

	public static void main(String[] args) {
		CommonData school = new CommonData("Nümunə Məktəbi", 650, 30, 25);
		school.showSchoolName();
        school.showClassCount();
        school.showTeacherCount();
        school.calculateTotalPeople();
	}

}
