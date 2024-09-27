package ders8;

public class praktika2Main {

    public static void main(String[] args) {
        Computer computer1 = new Computer();
        Computer computer2 = new Computer("Dell XPS");
        Computer computer3 = new Computer("MacBook Pro", "Silver");

        System.out.println("Computer 1:");
        computer1.printDetails();
        System.out.println("Computer 2:");
        computer2.printDetails();
        System.out.println("Computer 3:");
        computer3.printDetails();
    }
}
