package ders7lesson2;

import java.util.Scanner;

public class sert4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Məhsul növünü seçin:");
        System.out.println("1. Alma - 1.5 AZN");
        System.out.println("2. Portağal - 2.0 AZN");
        System.out.println("3. Banan - 1.8 AZN");
        System.out.println("4. Üzüm - 3.0 AZN");
        
        int productChoice = scan.nextInt();

        switch (productChoice) {
            case 1:
                System.out.println("Alma qiyməti: 1.5 AZN");
                break;
            case 2:
                System.out.println("Portağal qiyməti: 2.0 AZN");
                break;
            case 3:
                System.out.println("Banan qiyməti: 1.8 AZN");
                break;
            case 4:
                System.out.println("Üzüm qiyməti: 3.0 AZN");
                break;
            default:
                System.out.println("Yanlış məhsul seçimi");
                break;
        }

    }
}
