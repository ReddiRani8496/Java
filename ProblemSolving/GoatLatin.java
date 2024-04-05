public class GoatLatin {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
       StringBuilder result = new StringBuilder();
       for (int i = 0; i < words.length; i++) {
           String word = words[i];
           if (startsWithVowel(word)) {
               result.append(word).append("ma");
           } else {
               result.append(word.substring(1)).append(word.charAt(0)).append("ma");
           }
           for (int j = 0; j <= i; j++) {
               result.append("a");
           }
           if (i < words.length - 1) {
               result.append(" ");
           }
       }
       return result.toString();
   }
     private boolean startsWithVowel(String word) {
       char firstChar = Character.toLowerCase(word.charAt(0));
       return firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u';
   }
}
