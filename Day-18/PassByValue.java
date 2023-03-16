class PassByValue{
    public static void main(String[] args){
        int a=20;
        System.out.println(a); //20
        add(a);
        System.out.println(a);//20
    }
    static void add(int a){
        a=30;
        System.out.println(a); //30
    }
}