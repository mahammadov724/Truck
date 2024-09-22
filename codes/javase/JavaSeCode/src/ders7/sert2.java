package ders7;

import java.util.Scanner;

public class sert2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Birinci ədəd daxil edin:");
        int number1 = scan.nextInt();

        System.out.println("İkinci ədəd daxil edin:");
        int number2 = scan.nextInt();

        if (number1 > number2) {
            System.out.println("Birinci ədəd böyükdür");
        } else if (number1 == number2) {
            System.out.println("İki ədəd bərabərdir");
        } else {
            System.out.println("İkinci ədəd böyükdür");
        }

    }
}
