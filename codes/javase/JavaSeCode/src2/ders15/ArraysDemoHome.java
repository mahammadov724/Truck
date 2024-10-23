package ders15;

import java.util.Arrays;
import java.util.Iterator;

public class ArraysDemoHome {

	public static void main(String[] args) {
		int[] numbers = {1,6,4,8};
		int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Massivin elementlərinin cəmi: " + sum);
		
        System.out.println("Massivin elementləri (foreach):");
		for (int number : numbers) {
			System.out.println(number);
		}
		
		double ƏdədiOrta = (double) sum / numbers.length;
		System.out.println("Massivin ədədi ortası: " + ƏdədiOrta);
		
		
		int min = numbers[0];
        int max = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Massivin ən kiçik elementi: " + min);
        System.out.println("Massivin ən böyük elementi: " + max);
		
        
        System.out.println("Tək ədədlər:");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }

        System.out.println("Cüt ədədlər:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
        
        System.out.println("Sıralanmış massiv (artan):");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
	}

}
