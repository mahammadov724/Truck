package ders18;

import java.util.ArrayList;

public class tapsiriq1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 10; list.size() < 40; i += 2) {
            list.add(i);
        }

        System.out.println(list);
	}

}
