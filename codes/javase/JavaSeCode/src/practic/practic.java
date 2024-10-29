package practic;

import java.util.Arrays;

public class practic {

    public static void main(String[] args) {
        int[] arr = new int[] {1,5,7,2,5,2,1,2};
        int cem = 0;
        for (int i : arr) {
			if (i == 2) {
				cem++;
			}
		}
        System.out.println("2 lerin sayi : " + cem + " denedir");
    }

}
