public class ToLowerCase {
    String toLowerCase(String s) {
        StringBuilder res = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                res.append(Character.toLowerCase(c));
            } else {
                res.append(c);
            }
        }

        return res.toString();
    }
}
