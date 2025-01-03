package ders20;
import java.util.HashMap;
import java.util.Map;
public class Main2 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("D", 40);

        int sum = 0;
        int count = 0;

        for (int value : map.values()) {
            sum += value;   
            count++;         
        }

        double average = (double) sum / count;

        System.out.println("Bütün dəyərlərin ortalaması: " + average);
	}
}
