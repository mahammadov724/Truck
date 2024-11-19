package Ders8;

public class Main {

	public static void main(String[] args) {
	InventoryItem inventoryItem = new InventoryItem();
	inventoryItem.setName ("John");
	inventoryItem.setQuantity (79);
	inventoryItem.setPrice (100);
	System.out.println("Name: " + inventoryItem.getName());
    System.out.println("Quantity: " + inventoryItem.getQuantity());//int
    System.out.println("Price: " + inventoryItem.getPrice());
	}

}
