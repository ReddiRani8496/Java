//program to compute the number of 'x' characters in the string
class CountX{
  public static void main(String[] args){
    String str="xxhixx";
    System.out.println(countX(str));
  }

static int countX(String str) {
  int len=str.length();
  if(len==0)
  return 0;
  if(str.charAt(len-1)=='x')
  return 1+countX(str.substring(0,len-1));
  return countX(str.substring(0,len-1));
}
}
