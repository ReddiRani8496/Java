import java.util.*;
import java.util.regex.Pattern;
import student.*;

public class Main {
    static List<Student> list = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

         String operation;

        do {

            System.out.print("Enter a command (add, view, search, sort, exit): ");
            operation = scan.next();

            switch (operation.toLowerCase()) {

                case "add": System.out.println("\nAdd a new student record:");
                            scan.nextLine();
                            String name = isNameValid();

                            int id = isIDValid();

                            String email = isEmailValid();

                            double gpa = isGPAValid();

                            addStudent(name, id, email, gpa);

                            break;

                case "view": System.out.println("\nView all student records: \n");

                            viewStudents();

                            break;

                case "search": System.out.print("\nEnter a regular expression to search for: ");
                                scan.nextLine();
                                name = scan.nextLine();

                                searchStudents(name);

                                break;

                case "sort": sortStudents();
                             break;

                case "exit": System.out.println("Successfully exited");

                             break;

                default: System.out.println("Enter valid details\n");
            }

        } while (!operation.equals("exit"));
    }

    private static String isNameValid() {

        String name;
        boolean res;
        String validName = "";

        while (true) {

            try {
                System.out.print("Enter Student name: ");
                name = scan.nextLine();

                res = Pattern.matches("[a-zA-Z][A-Za-z\s]{2,20}", name);

                if(res) {

                    String str = name.toLowerCase();

                    boolean flag = true;

                    for(int i = 0; i < str.length(); i++) {

                        if(str.charAt(i) > 64 && str.charAt(i) < 91)
                            System.out.print(str.charAt(i));

                        else if(flag == true) {

                            validName += (char)(str.charAt(i)-32);
                            flag = false;

                        }

                        else if(str.charAt(i) == ' ') {

                            validName += " ";
                            flag = true;

                        }

                        else {

                            validName += str.charAt(i);

                        }

                    }
                    break;
                }




                System.out.println("Enter a valid name");

            } catch (Exception e) {

                System.out.println("Enter a valid name");

                scan.next();

            }
        }

        return validName;

    }

    private static int isIDValid() {

        boolean flag = false;
        int id;

        while (true) {

            try {
                if(list.size() == 0) {

                    do{

                        System.out.print("Enter Student ID: ");
                        id = scan.nextInt();

                        if(id > 0 && id <= 100) {
                            flag = true;
                            break;
                        }
                        else
                            System.out.println("Enter ID between 1 and 100");

                    } while (!flag);

                }

                else {

                    do {

                        System.out.print("Enter Student ID: ");
                        id = scan.nextInt();

                        int count = 0;
                        boolean flag1 = false;

                        for (var data : list) {

                            if (data.getId() == id && (id > 0 && id <= 100)) {

                                System.out.println("ID already exist, please enter valid ID");

                                count++;

                                flag1 = true;

                                break;
                            }

                        }

                        if (count == 0 && (id > 0 && id <= 100)) {

                            flag = true;

                        } else if (!flag1) {

                            System.out.println("Enter ID between 1 to 100");

                        }}while (!flag);

                        break;

                    }

                break;

            } catch (Exception e) {

                System.out.println("Enter valid id");

                scan.next();

            }
        }

        return id;
    }

    private static String isEmailValid() {

        String email;
        boolean res;

        while (true) {

            try {

                System.out.print("Enter student email: ");
                email = scan.next();

                res = Pattern.matches("^\\D[0-9a-z.]{3,29}@[a-z]{2,10}[.][a-z]{2,3}", email);

                if(res){
                    break;
                }

                else {
                    System.out.println("Please enter a valid gmail");
                }


            } catch (Exception e) {

                System.out.println("Please enter a valid gmail");

                scan.next();

            }
        }

        return email;

    }

    private static double isGPAValid() {

        boolean flag = false;
        double gpa;

        while (true) {

            try {

                    System.out.print("Enter student GPA: ");
                    gpa = scan.nextDouble();

                    if (gpa > 0 && gpa <= 10) {

                        flag = true;
                        break;
                    }

                System.out.println("Enter valid GPA");

            } catch (Exception e) {

                System.out.println("Enter valid GPA");

                scan.next();

            }
        }

        return gpa;

    }
    private static void addStudent(String name, int id, String mail, double gpa) {

        Student student = new Student();

        student.setName(name);
        student.setId(id);
        student.setMail(mail);
        student.setGpa(gpa);

        list.add(student);

        System.out.println("Student record added successfully.\n");
    }
    private static void viewStudents() {

        for(var data : list)
            System.out.println(data);
        System.out.println();
    }
    private static void searchStudents(String name) {

        int count = 0;

        for(var data : list) {

            if(Pattern.compile("^" + Pattern.quote(name), Pattern.CASE_INSENSITIVE).matcher(data.getName()).find()) {
                System.out.println();
                System.out.println(data);

                count++;

            }
        }

        if(count == 0)
            System.out.println("Record not found");
        System.out.println();
    }

    private static void sortStudents() {

        System.out.println("\nSort student records: ");
        String choice;
        scan.nextLine();

        System.out.print("Enter sort by id or gpa: ");
        choice = scan.nextLine();

        switch (choice.toLowerCase()) {

            case "id": list.sort(new SortByID());
                System.out.println("\nsorted by id: ");

                for (Student value : list)
                    System.out.println(value);

                break;

            case "gpa": list.sort(new SortByGPA());
                System.out.println("sorted by gpa: ");
                for (Student value : list)
                    System.out.println(value);
                break;

            default: System.out.println("Enter valid data");

        }

        System.out.println();
    }
}




