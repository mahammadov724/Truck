package codes.neriman.my_spring_project.entity;

public class Praktik {
    public static void main(String[] args) {
        int[] numbers = {12, 5, 7, 20};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Massivin cəmi: " + sum);

        System.out.print("Massivin elementləri: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        //ededi orta
        double average = (double) sum / numbers.length;
        System.out.println("Massivin ədədi ortası: " + average);

        //en kicik en boyuk
        int min = numbers[0];
        int max = numbers[0];
        for (int number : numbers) {
            if (number < min) min = number;
            if (number > max) max = number;
        }
        System.out.println("Ən kiçik element: " + min);
        System.out.println("Ən böyük element: " + max);

        //Tek ve cut
        System.out.print("Tək elementlər: ");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();

        System.out.print("Cüt elementlər: ");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();

        //Sade ededler
        System.out.print("Sadə ədədlər: ");
        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();

        //azalan sira
        System.out.print("Massiv azalan sırada: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}

