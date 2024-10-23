package ders15;

import java.util.Arrays;

public class ArraysDemoHome {

	public static void main(String[] args) {
		int[] numbers = {1,6,4,8};
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		int index = Arrays.binarySearch(numbers, 8);
		System.out.println(index);
	}

}
