package ders6;

public class dord {

	public static void main(String[] args) {
		 String s1 = "fcvbgsalfgfgnymynb";
	     String s2 = "salfgfgnymynb";

	        boolean result = yoxla(s1, s2);

	        System.out.println("Sətir 1, Sətir 2 ilə bitir: " + result);
	    }

	    public static boolean yoxla(String setir1, String setir2) {
	        return setir1.endsWith(setir2);
	    }
	}
