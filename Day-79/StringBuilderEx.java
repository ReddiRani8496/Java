
public class StringBuilderEx {
    public static void  main(String[] args) {

        StringBuilder str = new StringBuilder("java");

        System.out.println(str);

        str.append("programming");

        System.out.println(str);

        str.replace(2,3,"w");

        System.out.println(str);

        System.out.println(str.indexOf("p"));

        System.out.println(str.delete(0, 2));

        System.out.println(str.capacity());

        str.delete(3,6);

        System.out.println(str);

        str.deleteCharAt(1);

        System.out.println(str);

        System.out.println(str.length());

        System.out.println(str.lastIndexOf("m"));

        System.out.println(str.insert(0,"hello"));

        str.reverse();

        System.out.println(str);

        str.setCharAt(0,'k');

        System.out.println(str);

        System.out.println(str.substring(0,5));
        
        System.out.println(str.toString());

    }
}




