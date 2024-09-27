package ders8;

public class Computer {
    private Integer id;
    private String brand;
    private String model;
    private String color;

    public Computer() {
        this.id = 0;
        this.brand = "MSI";
        this.model = "Windows";
        this.color = "White";
    }

    public Computer(String model) {
        this.model = model;
        this.brand = "Dell";
        this.color = "Black";
    }

    public Computer(String model, String color) {
        this.model = model;
        this.color = color;
        this.brand = "Apple";
    }

    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println();
    }
}
