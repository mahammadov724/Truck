package ders17;

public class CheckRange {
	public void checkValueRange(int value) throws OutOfRangeValueException {
        int min = 10;
        int max = 100;
        
        if (value < min || value > max) {
            throw new OutOfRangeValueException("Dəyər aralıqdan kənardadır. (" + min + " - " + max + ")");
        } else {
            System.out.println("Dəyər müəyyən aralıqdadır.");
        }
    }
}
