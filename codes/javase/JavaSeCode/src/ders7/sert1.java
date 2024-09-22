package ders7;

import java.util.Scanner;

public class sert1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Yaşınızı daxil edin!");
        int number = scan.nextInt();
        
        if (number >= 18) {
            System.out.println("Yetişkinsən");
        } else {
            System.out.println("Uşaqsan");
        }
    
    }
}
