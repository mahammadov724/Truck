package az.developia.spring_projekt_2sentyabr.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "MyComputer")
public class Computer {

    private int id;
    private String brand;
    private double price;
    private String color;

    @Autowired
    private RAM ram;

    public Computer() {
        this.id = 1;
        this.brand = "MSI";
        this.price = 700.00;
        this.color = "Black";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer: id=" + id + ", brand=" + brand + ", price=" + price + 
               ", color=" + color + ", " + ram.toString();
    }
}
