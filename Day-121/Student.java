import java.util.ArrayList;
import java.util.Scanner;
class Student {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name;
        int ID;
        String Email;
        double GPA;
        System.out.println("Enter a command (add, view, search, sort, exit): ");
        String operation = sc.next();
        switch(operation){
            case "add ": System.out.println("Add a new student record:");
                        System.out.print("Enter student name: ");
                        String name = sc.next();
                        System.out.print("Enter student ID: ");
                        int id = sc.nextInt();
                        System.out.print("Enter student email: ");
                        String email = sc.next();
                        System.out.print("Enter student GPA: ");
                        double gpa = sc.nextDouble();
                        addStudent(name, id, email, gpa);
                        break;
            case "view" :break;
            case "search" : break;
            case "sort" : break;
            case "exit" : return;
        }
        
    }
    static void addStudent(String name,int id,String email,double gpa) {
        Scanner sc = new Scanner(System.in);
       // Student student = new Student();
        
        System.out.println("Student record added successfully.");
      
    } 
    
}