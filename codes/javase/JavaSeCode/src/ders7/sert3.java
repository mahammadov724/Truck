package ders7;

import java.util.Scanner;

public class sert3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Riyaziyyat balınızı daxil edin:");
        int mathScore = scan.nextInt();

        System.out.println("Fizika balınızı daxil edin:");
        int physicsScore = scan.nextInt();

        if (mathScore >= 60) {
            System.out.println("Hər iki dərsdən keçdiniz");
        } else if (mathScore < 60 && physicsScore < 70) {
            System.out.println("Hər iki dərsdən kəsildiniz");
        } else {
            System.out.println("Bir fənndən uğurla keçdiniz, digər fənndən isə kəsildiniz");
        }

    }
}
