package ders6;

import java.util.Random;

public class bes {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = 10 + random.nextInt(21);
        System.out.println("Təsadüfi ədəd: " + randomNumber);
    }
}
