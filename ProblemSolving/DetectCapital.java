public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        if (isUpperCase(word.charAt(0))) {
            boolean allUpperCase = true;
            boolean allLowerCase = true;
            
            for (int i = 1; i < word.length(); i++) {
                if (!isUpperCase(word.charAt(i))) {
                    allUpperCase = false;
                    break;
                }
            }
            
            for (int i = 1; i < word.length(); i++) {
                if (!isLowerCase(word.charAt(i))) {
                    allLowerCase = false;
                    break;
                }
            }
            
            return allUpperCase || allLowerCase;
        } else {
            for (int i = 1; i < word.length(); i++) {
                if (!isLowerCase(word.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    }
    
    private boolean isUpperCase(char ch) {
        return ch >= 'A' && ch <= 'Z';
    }
    
    private boolean isLowerCase(char ch) {
        return ch >= 'a' && ch <= 'z';
    }
}
