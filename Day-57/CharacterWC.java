import java.lang.Character;
public class CharacterWC {
    public static void main(String[] args) {
        Character up = Character.toUpperCase('c');
        System.out.println(up);

        Character low = Character.toLowerCase('A');

        System.out.println(low);

        Character val = Character.valueOf('a');

        System.out.println(val);
    }
}
