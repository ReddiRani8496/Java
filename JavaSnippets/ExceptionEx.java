public class ExceptionEx {
    public static void main(String[] args) {
        int a = 10,b=0;
        int arr[] = {1,2,3,4};
        try {
          //  System.out.println(arr[8]); // 3 will be printed
            System.out.println(a/b); // 1
        } // try cannot be written without catch or finally
        catch (ArithmeticException e) {
            System.out.println(1);
        } catch (NumberFormatException e) {
            System.out.println(2);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(3);
        } catch (Exception e) {
            System.out.println(4);
        }
//        } catch (NullPointerException e) { Exception already caught in Exception, it will give compile time error
//            System.out.println(5);
//        }
            finally {
            System.out.println("Finally block"); // 1 Finally block
            }

        // try catch finally
        // try catch
        // try finally can be written
    }
}

