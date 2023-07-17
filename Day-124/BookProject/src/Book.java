import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Book {
    private static String bookID;
    private static short pages;
    private static double price;

    private static final String ISBN_PATTERN = "^(?:ISBN(?:-13)?:?\\s)?(?=[0-9]{13}$|(?=(?:[0-9]+[-\\s]){4})[-\\s0-9]{17}$)97[89][-\\s]?[0-9]{1,5}[-\\s]?[0-9]+[-\\s]?[0-9]+[-\\s]?[0-9]$";

    public String getBookID() {
        return bookID;
    }

    public short getPages() {
        return pages;
    }

    static Scanner scan = new Scanner(System.in);

    public void get() {

        bookID = isBookIDValid();

        pages = isPagesValid();

        price = isPriceValid();

    }

    public void show() {

        System.out.println("Book ID: " + bookID);
        System.out.println("Number of Pages: " + pages);
        System.out.println("Price of the Book: " + price);

    }

    public void set(String bookID, short pages, double price) {

        Book.bookID = bookID;
        Book.pages = pages;
        Book.price = price;

    }

    public double getPrice() {

        return price;

    }
    private static String isBookIDValid() {

        while (true) {

            try {

                System.out.print("Enter the Book ID : ");
                bookID = scan.next();

                if(Pattern.compile(ISBN_PATTERN).matcher(bookID).matches())

                    break;

                System.out.println("The format of Book ID must be 978-9-16-148410-0 or ISBN-13: 978-3-16-148410-0");

            } catch (InputMismatchException e) {

                System.out.println("The format of Book ID must be 978-9-16-148410-0 or ISBN-13: 978-3-16-148410-0");

                scan.next();

            }
        }

        return bookID;

    }
    private static short isPagesValid() {

        while (true) {

            try {

                System.out.print("Enter the number of pages: ");
                pages = scan.nextShort();

                if(pages >= 1)
                    break;

                System.out.println("Pages must be greater than zero");

            } catch (InputMismatchException e) {

                System.out.println("Pages must be a number");

                scan.next();

            }
        }

        return pages;

    }
    private static double isPriceValid() {
        double price = 0;

        while (true) {

            try {

                System.out.print("Enter the price of the Book : ");
                price = scan.nextDouble();

                if(price >= 0)
                    break;
                System.out.println("The price of the Book more than or equal to 0");

            } catch (InputMismatchException e) {

                System.out.println("Book price must be a number");

                scan.next();

            }
        }

        return price;

    }

}



