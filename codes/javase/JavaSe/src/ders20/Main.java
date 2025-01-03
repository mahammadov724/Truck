package ders20;
import java.util.HashMap;
import java.util.Map;
public class Main {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
        map.put("Ad", "Aysel");
        map.put("Şəhər", "Bakı");
        map.put("Dövlət", "Azərbaycan");
        
        String longestKey = "";
        
        for (String key : map.keySet()) {
            if (key.length() > longestKey.length()) {
                longestKey = key;
            }
        }
        
        System.out.println("Ən uzun açar: " + longestKey);
	}
}
