package ders9;

public class MainClass {
    public static void main(String[] args) {
        MethodsHome methodsHome = new MethodsHome();
    
        System.out.println("1-10 aralığı:");
        methodsHome.printNumbers(1, 10);
        
        System.out.println("5-15 aralığı:");
        methodsHome.printNumbers(5, 15);
        
        System.out.println("10-20 aralığı:");
        methodsHome.printNumbers(10, 20);
    }
}
