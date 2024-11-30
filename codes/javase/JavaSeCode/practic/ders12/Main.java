package ders12;

public class Main {

	public static void main(String[] args) {
		Book electronicBook = new ElectronicBook("Java", "Rövşən Abdullaoğlu", "PDF", 7.2);
        Book physicalBook = new PhysicalBook("Körfəz", "Mark Tven", 3.0, "A4");

        electronicBook.showInfo();  
        physicalBook.showInfo();

	}

}
