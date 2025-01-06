package Ders21;
import java.util.ArrayList;
import java.util.HashSet;
public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(4);
		list.add(4);
		list.add(6);
		list.add(6);
		list.add(7);
		list.add(2);
		list.add(9);
		list.add(10);
		
		HashSet<Integer> gorulen = new HashSet<>();
		HashSet<Integer> tekrarlanan = new HashSet<>();
		
		for (Integer num : list) {
			if (gorulen.contains(num)) {
				tekrarlanan.add(num);
			} else {
				gorulen.add(num);
			}
		}
		
		System.out.println("Tekrarlanan Reqemler: " + tekrarlanan);
	}

}
