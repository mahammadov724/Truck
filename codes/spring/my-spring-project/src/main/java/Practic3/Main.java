package Practic3;

public class Main {
    public static void main(String[] args) {
        Divider divider = new Divider(); 

        try {
            int result = divider.divide(10, 0);
            System.out.println("Netice: " + result);
        } catch (CustomDivide e) {
            System.out.println("Xeta bas verdi: " + e.getMessage());
        }
    }
}
