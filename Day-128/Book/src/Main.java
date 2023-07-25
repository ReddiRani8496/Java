import book.Book;
import book.SpecialEditionBook;

public class Main {
    public static void main(String[] args) {

        Book book = new Book(1,"Java",400);
        book.display();

        SpecialEditionBook specialEditionBook = new SpecialEditionBook(1,"java",400);
        specialEditionBook.display();

    }
}