package ders18;

import java.util.ArrayList;

public class Tapsiriq2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        
        System.out.println("Orijinal: " + list);
        
        ArrayList<String> reversedList = new ArrayList<>();
        
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        
        System.out.println("Terse: " + reversedList);


	}

}
