public class MoveXToEnd {

    String moveXToEnd(String str) {

        if (str.isEmpty())
            return str;

        if (str.charAt(0) != 'x')
            return str.charAt(0) + moveXToEnd(str.substring(1));

        return moveXToEnd(str.substring(1)) + "x";
    }
}