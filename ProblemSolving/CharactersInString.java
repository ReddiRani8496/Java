import java.util.Scanner;

public class CharactersInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        traversing(str);

        reverseString(str);

        printVowels(str);
        printConsonants(str);
        printNumbers(str);
        printSpecialCharacters(str);
    }

    private static void printSpecialCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            if(!((str.charAt(i)>='0'&&str.charAt(i)<='9')||(str.charAt(i)>='A'&&str.charAt(i)<='Z')||(str.charAt(i)>='a'&&str.charAt(i)<='z')))
                System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    private static void printNumbers(String str) {
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>='0'&&str.charAt(i)<='9')
                System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    private static void printConsonants(String str) {
        for (int i = 0; i < str.length(); i++) {
            if((str.charAt(i)>='A'&&str.charAt(i)<='Z')||(str.charAt(i)>='a'&&str.charAt(i)<='z')){
                if(str.charAt(i)!='a'&&str.charAt(i)!='e'&&str.charAt(i)!='i'&&str.charAt(i)!='o'&&str.charAt(i)!='u')
                    System.out.print(str.charAt(i)+" ");
            }
        }
        System.out.println();
    }

    private static void printVowels(String str) {
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
                System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    private static void reverseString(String str) {
        for (int i = str.length()-1; i >= 0 ; i--) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    private static void traversing(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
}
