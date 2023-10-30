public class IValueCount {
    public static void main(String[] args) {
        int count = 0;
//        for (int i = 0; i <=6 ; i++) {
//            count++;
//        }
      //  System.out.println(i); // can not find symbol i, i is for loop level
    //    System.out.println(count); // 7

        int i;
        for(i=0;i<=6;i++)
            count++;
        System.out.println(i); // 7
        System.out.println(count); // 7
    }
}

