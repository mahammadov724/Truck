package ders17;

public class MainClass {

	public static void main(String[] args) {
		CheckRange checkRange = new CheckRange();
		
		try {
            checkRange.checkValueRange(200);
        } catch (OutOfRangeValueException e) {
            System.out.println("Xəta: " + e.getMessage());
        }
		
		try {
            checkRange.checkValueRange(20);
        } catch (OutOfRangeValueException e) {
            System.out.println("Xəta: " + e.getMessage());
        }
	}

}
