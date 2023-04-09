//program to find area of rectangle
class Rectangle extends Shape{
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        System.out.println("Area of rectangle="+r.area(10, 20));
    }
}
class Shape{
    public int area(int length,int breadth){
        return length *breadth;
    }
}