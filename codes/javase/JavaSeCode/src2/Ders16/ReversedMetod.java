package Ders16;

public class ReversedMetod {

	public static void main(String[] args) {
		int[] array = {10,20,30,40,50};
		int n = array.length;
		int[] reversed = new int[n];
		for (int i = 0; i < n; i++) {
			reversed[i] = array[n - 1 - i];
			System.out.println(reversed[i]);
		}
		
	}

}
