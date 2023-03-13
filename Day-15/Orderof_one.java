class Orderof_one{
    public static void main(String[] args){
        System.out.println("Hello world");//time complexity is 1, the statement executes only one time
        String day="Sunday";
        if(day=="Sunday"){
            System.out.println("Today is holiday"); // time complexity is 1
        }
        else
        System.out.println("Go to office"); // time complexity is 1
    }
}