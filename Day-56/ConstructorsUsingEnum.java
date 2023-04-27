import javax.sound.midi.Soundbank;

enum Colors {
    RED,
    BLUE("BLUE"),
    PINK("PINK","PINKY"),
    GREEN("GREEN","TREES","GREENARY");
    
    Colors() {
        System.out.println("you choosen red");
    }
    Colors(String str) {
        System.out.println("you choosen " + str);
    }
    Colors(String str, String str1) {
        System.out.println("you choosed " + str + " " + str1);
    }
    Colors(String str,String str1,String str2) {
        System.out.println("you choosen: " + str + " " + str1 + " " + str2);
    }
}

public class ConstructorsUsingEnum {
    public static void main(String[] args) {

        var color=Colors.RED;
        
        System.out.println(color);
    }
}
