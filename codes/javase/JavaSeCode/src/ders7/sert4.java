package ders7;

import java.util.Scanner;

public class sert4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Həftənin gününü daxil edin:");
        String day = scan.nextLine();

        switch (day) {
            case "Şənbə":
            case "Bazar":
                System.out.println("Həftə sonu");
                break;
            case "Bazar ertəsi":
            case "Cümə":
                System.out.println("Həftənin başlanğıcı və ya sonu");
                break;
            default:
                System.out.println("Həftə içi");
                break;
        }


    }
}
