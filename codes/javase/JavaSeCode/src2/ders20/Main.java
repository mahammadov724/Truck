package ders20;

public class Main {

    public static void main(String[] args) {
        String name = "Məhərrəm";
        System.out.println("1. name dəyişəni: " + name);

        String message = "Java dilini öyrənmək maraqlı və faydalıdır";
        System.out.println("2. message dəyişəni: " + message);
        
        System.out.println("3. message dəyişənindəki simvol sayı: " + message.length());

        System.out.println("4. message dəyişəninin 7-ci simvolu: " + message.charAt(6));

        int indexOfN = message.indexOf('n');
        System.out.println("5. message dəyişənində 'n' simvolunun indeks: " + indexOfN);

        System.out.println("6. message dəyişəninin bütün simvollarını kiçikləşdirilmiş: " + message.toLowerCase());

        System.out.println("7. message dəyişəninin bütün simvollarını böyükləşdirilmiş: " + message.toUpperCase());

        boolean containsJava = message.contains("Java");
        System.out.println("8. message dəyişənində 'Java' simvolu var: " + containsJava);

        boolean endsWithFaydalıdır = message.endsWith("faydalıdır");
        System.out.println("9. message dəyişəni 'faydalıdır' ilə bitir: " + endsWithFaydalıdır);

        boolean startsWithJava = message.startsWith("Java");
        System.out.println("10. message dəyişəni 'Java' ilə başlayır: " + startsWithJava);

        name = "Ayxan";
        System.out.println("11. name dəyişəni: " + name);

        name = name.trim();
        System.out.println("12. name dəyişənində boşluqlar aradan qaldırıldı: " + name);

        name = "Kamil";
        System.out.println("13. name dəyişəni: " + name);

        String firstFourChars = name.substring(0, 4);
        System.out.println("14. name dəyişəninin ilk 4 simvolu: " + firstFourChars);

        name = "Hüseyn Mehdizadə";
        System.out.println("15. name dəyişəni: " + name);

        String[] nameParts = name.split(" ");
        System.out.println("16. name dəyişəninin hissələri:");
        for (String hisse : nameParts) {
            System.out.println(hisse);
        }

        System.out.println("17. Yeni massivdəki dəyərlər:");
        for (String part : nameParts) {
            System.out.println(part);
        }
    }
}

