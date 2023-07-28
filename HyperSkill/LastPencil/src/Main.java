import java.util.*;

class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many pencils would you like to use:");
        int pencils = isPencilsValid();

        System.out.println("Who will be the first (John, Jack):");
        String name = isNameValid();

        for (int i = 0; i < pencils; i++)
            System.out.print("|");

        System.out.println();

        while(pencils!=0) {

            System.out.println(name + "'s turn!");



            if (name.equals("John")) {

                int removePencils = isRemovePencilsValid(pencils);
                pencils -= removePencils;

            } else {

                if(pencils==1) {
                    System.out.println(1);
                    pencils -=1;
                }

                else {

                    if (pencils % 4 == 1) {
                        Random random = new Random();
                        int randomValue = random.nextInt(3) + 1;
                        System.out.println(randomValue);
                        pencils -= randomValue;

                    } else if (pencils % 4 == 0) {

                        System.out.println(3);
                        pencils -= 3;

                    } else if (pencils % 4 == 3) {

                        System.out.println(2);
                        pencils -= 2;

                    } else if (pencils % 4 == 2) {

                        System.out.println(1);
                        pencils -= 1;

                    }
                }

            }

            if(name.equals("John"))
                name = "Jack";
            else
                name = "John";

            for (int i = 0; i < pencils; i++) {
                System.out.print("|");
            }

            System.out.println();
        }

        System.out.println(name + " won!");
    }

    private static int isPencilsValid() {
        int pencils;

        while (true) {
            try {
                pencils = Integer.parseInt(scanner.nextLine());

                if (pencils > 0) {
                    break;
                }
                System.out.println("The number of pencils should be positive");
            } catch (Exception e) {
                System.out.println("The number of pencils should be numeric");
            }
        }

        return pencils;
    }
    private static String isNameValid() {

        String name;


        while (true) {

            try {

                name = scanner.nextLine();

                if(name.equals("John")||name.equals("Jack"))
                    break;
                else
                    System.out.println("Choose between 'John' and 'Jack'");

            } catch (Exception e) {

                System.out.println("Choose between 'John' and 'Jack'");

            }
        }

        return name;

    }
    private static int isRemovePencilsValid(int pencil) {

        int pencils;

        while (true) {

            try {

                pencils = Integer.parseInt(scanner.nextLine());

                if (pencils ==1 ||pencils==2||pencils==3) {
                    if(pencils>pencil){
                        System.out.println("Too many pencils were taken");
                    }
                    else
                        break;
                }
                else
                    System.out.println("Possible values: '1', '2' or '3'");

            } catch (Exception e) {

                System.out.println("Possible values: '1', '2' or '3'");


            }
        }

        return pencils;

    }
}