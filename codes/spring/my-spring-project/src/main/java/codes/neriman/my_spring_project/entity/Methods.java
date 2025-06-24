package codes.neriman.my_spring_project.entity;

public class Methods {

    public void printName(int count, String name) {
        for (int i = 0; i < count; i++) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Methods obj = new Methods();

        obj.printName(3, "Neriman");
        obj.printName(2, "Aygun");
        obj.printName(4, "Mehemmed");
    }
}
