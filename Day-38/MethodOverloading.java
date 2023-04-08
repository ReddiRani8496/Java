//methods should have same name, but can differ in arguments is called method overloading.
class MethodOverloading{
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args){
       MethodOverloading obj=new MethodOverloading();
       obj.add(10,20);
       obj.add(30,20,5);
    }
}
