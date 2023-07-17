class Main {
    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book();

        System.out.println("Enter Book1 details: ");
        System.out.println("--------------------\n");
        book1.get();
        book1.set(book1.getBookID(), book1.getPages(), book1.getPrice());


        System.out.println("\nEnter Book2 details: ");
        System.out.println("--------------------\n");
        book2.get();
        book2.set(book2.getBookID(), book2.getPages(), book2.getPrice());

        System.out.println("\nBook 1 Details: ");
        System.out.println("--------------\n");
        book1.show();

        System.out.println("\nBook 2 Details: ");
        System.out.println("--------------\n");
        book2.show();

        if (book1.getPrice() > book2.getPrice()) {

            System.out.println("\nBook 1 is the most costly book");

        } else if (book2.getPrice() > book1.getPrice()) {

            System.out.println("\nBook 2 is the most costly book");

        } else {

            System.out.println("\nBoth books have same price");

        }
    }


}