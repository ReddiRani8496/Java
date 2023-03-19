import java.util.*;
class StringMethods{
    public static void main(String[] args){
        String str="java";
        String  str1=" JAVA";
        System.out.println(str.compareTo(str1));//compares two strings
        System.out.println(str.charAt(3));//returns the character at the specified index
         System.out.println(str1.concat(str2));//concats the two strings
           System.out.println(str.contains("ja"));// checks whether the string contains the specified sub string
            System.out.println(str.equals(str1));//checks whether  two strings are equal or not
            System.out.println(str.length());//checks the length of the string
        System.out.println(str.equalsIgnoreCase(str1));//checks two strings equal or not ignoring case
        Formatter formatter=new Formatter();
        formatter.format("%s",str); //format specifier indicates the type of data, for example %d=> integer data type
       System.out.println(formatter);
       System.out.println(Arrays.toString(str.getBytes())); // returns the ASCII value of the data,ASCII value of j=>106,a=>97,v=>118,a=>97
       System.out.println(str.hashCode()); // returns the encrypted form of the string
       System.out.println(str.indexOf('a'));//returns the index of the specified character in the string
       System.out.println(str.isEmpty()); // checks whether the string is empty or not
       String str2=new String("java");
       String str3=str2.intern();
       System.out.println(str3==str2);
       System.out.println(str3==str);
       System.out.println(str1.trim()); //removes the whitespaces in the string
       System.out.println(str1.toLowerCase()); // converts the string to lowercase
       System.out.println(str.toUpperCase());//converts the string to capitalcase
       System.out.println(str.replace('j','k')); //replaces the character with new character in the string
      System.out.println(str.replaceAll("a","b")); //replaces all the character with the specified character
       int year=2023;
       String str4="Current year is: ";
       System.out.println(str4+String.valueOf(year));
        String text="welcome to java world";
       String[] result=text.split(" ");// to split the string
       for(String str5:result){
        System.out.print(str5+", ");
       }
       System.out.println();
       System.out.println(str.startsWith("j"));//checks whether the string starts with given string or not
         System.out.println(str.endsWith("va"));// checks whether the string ends with given string or not
        System.out.println(text.replaceFirst("world","programming")); //replaces the specified word 
        System.out.println(text.substring(8));//returns the substring from the specified index
        String st=String.join("_","welcome","to","java","world"); //joins the strings with the specified character or symbol
        System.out.println(st);
        System.out.println(text.contentEquals("welcome to java world"));


    }  
}