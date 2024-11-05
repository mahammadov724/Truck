package common;

public class CommonData {
	public String schoolName;
    private int totalStudent;
    protected int teacherCount;
    int classCount;
    
    public CommonData(String schoolName,int totalStudent,int teacherCount,int classCount) {
    	this.schoolName=schoolName;
    	this.totalStudent = totalStudent;
        this.teacherCount = teacherCount;
        this.classCount = classCount;
    };
    
    public void showSchoolName() {
    	System.out.println("Məktəbin adı: " + schoolName);
    };
    
    private int calculateTotalPeople() {
        return totalStudent + teacherCount;
    };
    
    protected void showTeacherCount() {
        System.out.println("Müəllimlərin sayı: " + teacherCount);
    };
    
    void showClassCount() {
        System.out.println("Siniflərin sayı: " + classCount);
    };
}
