//program to finding the location of the specified character of first string in the second string
class CharacterLocation{
public static void main(String args[]){
String s="calm";
String s1="lamp";
for(int i=0;i<s.length();i++){
for(int j=0;j<s1.length();j++){
if(s.charAt(i)==s1.charAt(j)){
System.out.println(j);
break;
}
}
}
}
}