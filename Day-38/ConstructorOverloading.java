//constructor loading:same constructor with different parameters is called constructor overloading
class ConstructorOverloading{
    public static void main(String[] args){
     Sample s1=new Sample(10,10);
    
    }
}
class Sample{
    Sample(){
        System.out.println("empty constructor");
    }
    Sample(int a,int b){
       System.out.println("constructor with two parameters");
    }
    Sample(String s,double d,int a){
     System.out.println("constructor with three parameters");
    }
}