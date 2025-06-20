package codes.neriman.my_spring_project.entity;

public class ClassAndObject {
	static class Book {
        int id;
        String name;
        String author;
        int pageCount;
        String description;

        Book(int id, String name, String author, int pageCount, String description) {
            this.id = id;
            this.name = name;
            this.author = author;
            this.pageCount = pageCount;
            this.description = description;
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book(1, "Cinayət və Cəza", "Fyodor Dostoyevski", 500, "Rus ədəbiyyatının şah əsəri");
        Book book2 = new Book(2, "Yüz ilin tənhalığı", "Gabriel Garcia Marquez", 450, "Magik realizmin nümunəsi");

        System.out.println("ID: " + book1.id);
        System.out.println("Name: " + book1.name);
        System.out.println("Author: " + book1.author);
        System.out.println("Page Count: " + book1.pageCount);
        System.out.println("Description: " + book1.description);
        System.out.println();

        System.out.println("ID: " + book2.id);
        System.out.println("Name: " + book2.name);
        System.out.println("Author: " + book2.author);
        System.out.println("Page Count: " + book2.pageCount);
        System.out.println("Description: " + book2.description);
    }
}
