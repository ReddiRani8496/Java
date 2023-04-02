//program to compute  recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".
class ChangePi{
    public static void main(String[] args){
        String str="pixhpi";
        System.out.println(changePi(str));
    }
    static String changePi(String str) {
  if(str.length()<2)
  return str;
  if(str.substring(0,2).equals("pi"))
  return "3.14"+changePi(str.substring(2));
  return str.charAt(0)+changePi(str.substring(1));
}
}