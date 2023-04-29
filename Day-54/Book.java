//program to demonstrate the HAS-A relationship

class Author {
    String authorName;
    int age;
    String place;
    Author(String name, int age, String place) {
        this.authorName = name;
        this.age = age;
        this.place = place;
    }

}
public class Book {
    String name;
    int price;
    Author auther;
    Book(String n, int p, Author auther) {
        this.name = n;
        this.price = p;
        this.auther = auther;
    }
    public static void main(String[] args) {
        Author auther = new Author("john", 42, "USA");
        Book book = new Book("java", 1000, auther);
        System.out.println("Book name : " + book.name);
        System.out.println("Book price : " + book.price);
        System.out.println("Author details :");
        System.out.println("Auther Name : "+book.auther.authorName);
        System.out.println("Auther age : " + book.auther.age);
        System.out.println("Auther Place : " + book.auther.place);
    }
}
