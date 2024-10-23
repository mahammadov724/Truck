package ders14;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		numbers[0] = 4;
		numbers[1] = 68;
		numbers[2] = 32;
		numbers[3] = 9;
		numbers[4] = 1;
		
		//1
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("Numbers elementlerinin toplami : " + sum);
		
		//2
		double EDOD = sum / numbers.length;
		System.out.println("Elementlerin ededi ortasi : " + EDOD);
		
		//3
		int min = numbers[0];
		for (int a = 0; a < numbers.length; a++) {
			if (numbers[a] < min) {
	            min = numbers[a];
	        }
		}
		System.out.println("Ededlerin En Kiciyi :" + min);

		//4
		for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
            }
        }
		
	}

}
