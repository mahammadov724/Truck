package ders8;

public class main1 {
    public static void main(String[] args) {
        person person1 = new person();
        person person2 = new person(2, "Adil", "Maqamedov", "070 - @#$ - 00 - 29");
        
        System.out.println("Person 1:");
        person1.printDetails();
        
        System.out.println("Person 2:");
        person2.printDetails();
    }
}
