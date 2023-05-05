class ExceptionEx3 {
    public static void main(String[] args) {
        int a[] = new int[4];
        Duck d = new Duck();
        int start = 0;
        try {
           // int x = Integer.parseInt(d.s);
            int x = Integer.parseInt(d.s);
            System.out.println(x);
            start = 1;
          //  int y = a[5];
            int y = a[2];
            System.out.println(y);
            start = 2;
            int z = 5/0;
            System.out.println(z);
        }
        catch (NumberFormatException  | ArrayIndexOutOfBoundsException | ArithmeticException e) {
            if(start == 0)
                System.out.println("Number format");
            else if(start == 1)
                System.out.println("Array Index Out Of Bounds");
            else if(start == 2)
                System.out.println("Arithmetic exception : /by zero");
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}

class Duck {
    String s = "123";
    int age;
}