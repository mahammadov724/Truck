package Practic4;

public class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.addItem(123213235);
        intBox.showItem();
        
        Box<String> strBox = new Box<>();
        strBox.addItem("awddsaddasdfew");
        strBox.showItem();
    }
}
