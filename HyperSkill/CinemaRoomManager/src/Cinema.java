import java.util.Scanner;

public class Cinema {
    static Scanner scanner = new Scanner(System.in);
    static int rows;
    static int seats;
    static int rowNum;
    static int seatNum;
    static char[][] seatsArray;
    static int ticketsCount;
    static int currentIncome;
    static int totalIncome;
    public static void main(String[] args) {

        rows = isRowsValid("rows");

        seats = isRowsValid("seats");

        seatsArray = new char[rows][seats];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                seatsArray[i][j] = 'S';
            }
        }

        int totalCapacity = rows * seats;
        if (totalCapacity <= 60) {

            totalIncome = rows*seats*10;
        } else {
            int firstHalf = ((rows) / 2);
            int secondHalf = rows - firstHalf;
            totalIncome += firstHalf * seats * 10;
            totalIncome += secondHalf * seats * 8;
        }
        while (true) {
            System.out.println();
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");

            int option = scanner.nextInt();

            switch (option){
                case 1: showSeats();
                    break;
                case 2: BuyATicket();
                    ticketsCount++;
                    break;
                case 3: showStatistics();
                    break;
                case 0: return;
                default:
                    System.out.println("Invalid choice");
            }
        }


    }

    public static int isRowsValid(String data) {
        int rows;
        while (true){
            try {
                if(data.equals("rows"))
                    System.out.println("Enter the number of rows:");
                else if(data.equals("seats"))
                    System.out.println("Enter the number of seats in each row:");
                rows = scanner.nextInt();
                break;
            } catch (Exception e){
                scanner.next();
            }
        }
        return rows;
    }
    public static void showSeats(){
        System.out.println("Cinema:");
        System.out.print("  ");
        for (int i = 1; i <= seats; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= rows; i++) {
            System.out.print(i + " ");

            for (int j = 1; j <= seats; j++) {
                if(seatsArray[i-1][j-1]=='B')
                    System.out.print("B ");
                else
                    System.out.print("S ");
            }

            System.out.println();
        }

    }

    public static void BuyATicket() {

        while (true) {
            try {
                System.out.println("Enter a row number:");
                rowNum = scanner.nextInt();
                System.out.println("Enter a seat number in that row:");
                seatNum = scanner.nextInt();
                if (rowNum < 1 || rowNum > rows || seatNum < 1 || seatNum > seats) {
                    System.out.println("Wrong input!");

                } else if (seatsArray[rowNum - 1][seatNum - 1] == 'B') {
                    System.out.println("That ticket has already been purchased!");

                } else {
                    seatsArray[rowNum - 1][seatNum - 1] = 'B';
                    int totalCapacity = rows * seats;
                    if (totalCapacity <= 60) {
                        System.out.println("Ticket price: " + "$10");
                        currentIncome += 10;

                    } else {
                        int firstHalf = ((rows) / 2);
                        if (rowNum <= firstHalf) {
                            System.out.println("Ticket price: " + "$10");
                            currentIncome += 10;
                        }
                        else {
                            System.out.println("Ticket price: " + "$8");
                            currentIncome += 8;
                        }

                    }
                    return;
                }
            }catch (Exception e){
                scanner.next();
            }
        }

    }
    public static void showStatistics() {
        System.out.println("Number of purchased tickets: "+ticketsCount);
        float percentage = (float) ((double) (ticketsCount * 100) /(rows * seats));
        System.out.printf("Percentage: %.2f%%",percentage);
        System.out.println();
        System.out.println("Current income: $"+currentIncome);
        System.out.println("Total income: $"+totalIncome);
    }
}