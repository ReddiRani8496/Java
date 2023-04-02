class AllStar{
    public static void main(String[] args){
        String str="hello";
        System.out.println(allStar(str));
    }
    static String allStar(String str) {
  if(str.length()<2)
  return str;
  return str.charAt(0)+"*"+allStar(str.substring(1));
}
  
}