package ders19;

public class Main {

	public static void main(String[] args) {
		Collection<String> stringCollection = new Collection<>();
        stringCollection.addElement("Aliye");
        stringCollection.addElement("Resad");
        stringCollection.addElement("Resul");

        System.out.println("String Collection elements:");
        stringCollection.printElement();
        System.out.println("Size: " + stringCollection.size());

        Collection<Integer> integerCollection = new Collection<>();
        integerCollection.addElement(10);
        integerCollection.addElement(20);
        integerCollection.addElement(30);

        System.out.println("Int Collection: ");
        integerCollection.printElement();
        System.out.println("Size: " + integerCollection.size());
    }

	}

}
