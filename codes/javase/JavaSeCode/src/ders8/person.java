package ders8;

public class person {
    private Integer id;
    private String name;
    private String surname;
    private String phone;

    public person() {
        this.id = 1;
        this.name = "Neriman";
        this.surname = "Mehemmedov";
        this.phone = "070 - @#$ - 00 - 29";
    }

    public person(Integer id, String name, String surname, String phone) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Phone: " + phone);
        System.out.println();
    }
}
