class ObjectCreation{
    int x=10; //Instance variables
    public static void main(String[] args){
        int y=20; //local variables
        ObjectCreation obj=new ObjectCreation();
        System.out.println(obj.x);
        System.out.println(y);
    }
}