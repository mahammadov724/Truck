package ders7lesson2;

import java.util.Scanner;

public class sert2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ay nömrəsini daxil edin (1-12):");
        int monthNumber = scan.nextInt();

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Qış");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Yaz");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yay");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Payız");
                break;
            default:
                System.out.println("Yanlış ay nömrəsi");
                break;
        }

    }
}
