package Recursion;

import java.util.Scanner;

public class RemoveDuplicatesInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        boolean[] arr = new boolean[26];
        removeDuplicates(str, 0, sb, arr);
    }
    private static void removeDuplicates(String str, int index, StringBuilder newStr, boolean[] arr) {
        if(index == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(index);

        if(arr[currChar-'a'] == true) {
            removeDuplicates(str, index+1, newStr, arr);
        } else {
            arr[currChar-'a'] = true;
            removeDuplicates(str, index+1, newStr.append(currChar), arr);
        }
    }
}
