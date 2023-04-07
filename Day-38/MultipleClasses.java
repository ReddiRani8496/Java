public class MultipleClasses{
    public static void main(String[] args){
      Addition obj=new Addition();
      System.out.println(obj.sum);
    }
}
class Addition{
    int a=10;
    int b=20;
    int sum=a+b;
}