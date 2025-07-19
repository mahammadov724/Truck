package Practic4;

public class Box<I> {

 private I item;

 public void addItem(I item) {
     this.item = item;
 }

 public I getItem() {
     return item;
 }

 public void showItem() {
     System.out.println("Item: " + item);
 }
}
