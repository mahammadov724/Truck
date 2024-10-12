package Mukemmeleded;

public class MukemmelEded {
    public static void main(String[] args) {
        int menimededim = 6;
        int cəm = 0;

        for (int i = 1; i <= menimededim; i++) {
            if (menimededim % i == 0) {
                cəm += i;
            }
        }

        if (cəm == menimededim) {
            System.out.println(menimededim + " mükəmməl ədəddir.");
        } else {
            System.out.println(menimededim + " mükəmməl ədəd deyil.");
        }
    }
}
