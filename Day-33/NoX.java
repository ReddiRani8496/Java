//program to compute recursively a new string where all the 'x' chars have been removed.
class NoX{
    public static void main(String[] args){
       String str="xxabx";
       System.out.println(noX(str));
    }
    static String noX(String str) {
  if(str.length()==0)
  return "";
  if(str.charAt(0)=='x')
  return noX(str.substring(1));
  return str.charAt(0)+noX(str.substring(1));
}

}