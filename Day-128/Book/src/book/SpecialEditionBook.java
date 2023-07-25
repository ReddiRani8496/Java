package book;

public class SpecialEditionBook extends Book {

    double discount = getDiscount();

    public SpecialEditionBook(int bno, String bname, double price) {

        super(bno, bname,price);
        double discountPrice = price/100 * discount;
        super.price = price - discountPrice;

    }

    int getDiscount() {
        return (int)(Math.random()*100);
    }

    @Override
    public void display() {

        super.display();

    }

}
/*
Create a class Book with the data members bno,bname,price.
Create a class SpecialEditionBook which is subclass of Book and with a data member
discount. Create a class BookTest with main() to test the above classes
Note
- Use constructors to give the values to the data members
- create a method display() in Book class which displays bno,bname and price
and override the same display() of Book class in SpecialEditionBook which displays
bno,bname,price using super.display() and display the value of discount.
 */
