import javax.sound.midi.Soundbank;

enum Cards {
    SPADE,

    HEART,

    CLUB;

   int result;

    int print() {

        System.out.println("the result is: ");

        this.result = 22;

        return result;
    }
}

public class VariablesInEnum {
    public static void main(String[] args) {

        var res = Cards.SPADE.print();

        System.out.print(res); 
    }
   
}
