class Addition{
    public static void main(String[] args) {
        Add.Inner a=new Add(). new Inner();
        a.add();
    }
}

 class Add {
    int x=10;
    class Inner{
        int y=20;
        void add(){
            System.out.println(x+y);
        }
    }
}
