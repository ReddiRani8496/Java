//methods shoubld have same name, but can differ in arguments is called method overloading.
class MethodOverloading{
    int add(int a,int b){
        return a+b;
    }
    void sub(int a,int b,int c){
        System.out.println(a-b-c);
    }
    public static void main(String[] args){
       MethodOverloading obj=new MethodOverloading();
       System.out.println(obj.add(10,20));
       obj.sub(30,20,5);
    }
}
