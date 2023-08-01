import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.BreakIterator;

public class Main {

    private static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }

    private static int countSentences(String text) {
        BreakIterator iterator = BreakIterator.getSentenceInstance();
        iterator.setText(text);
        int count = 0;
        int lastIndex = iterator.first();
        while (lastIndex != BreakIterator.DONE) {
            int nextIndex = iterator.next();
            if (nextIndex != BreakIterator.DONE) {
                String sentence = text.substring(lastIndex, nextIndex).trim();
                if (!sentence.isEmpty()) {
                    count++;
                }
            }
            lastIndex = nextIndex;
        }
        return count;
    }

    private static int countCharacters(String text) {
        return text.replaceAll("[\\s\\n\\t]", "").length();
    }

    private static int countSyllables(String word) {
        word = word.toLowerCase();
        boolean isPreviousVowel = false;
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            boolean isVowel = "aeiouy".indexOf(c) != -1;
            if (isVowel) {
                if (!isPreviousVowel) {
                    count++;
                }
                isPreviousVowel = true;
            } else {
                isPreviousVowel = false;
            }
        }

        if (count == 0) {
            count = 1;
        }

        if (word.endsWith("e")) {
            count--;
        }

        return count;
    }

    public static double calculateARI(int characters, int words, int sentences) {
        return 4.71 * (characters / (double) words) + 0.5 * (words / (double) sentences) - 21.43;
    }

    public static double calculateFleschKincaid(int words, int sentences, int syllables) {
        return 0.39 * words / sentences + 11.8 * syllables / words - 15.59;
    }

    public static double calculateSMOG(int sentences, int polysyllables) {
        return 1.043 * Math.sqrt(polysyllables * 30 / (double) sentences) + 3.1291;
    }

    public static double calculateColemanLiau(int characters, int words, int sentences) {
        double L = characters / (double) words * 100;
        double S = sentences / (double) words * 100;
        return 0.0588 * L - 0.296 * S - 15.8;
    }

    private static String ageBracket(double score) {
        String[] ageRanges = {
                "5-6", "6-7", "7-9", "9-10", "10-11", "11-12", "12-13", "13-14",
                "14-15", "15-16", "16-17", "17-18", "18-24", "24+"
        };

        int roundedScore = (int) Math.ceil(score);
        if (roundedScore >= 14) {
            return ageRanges[13];
        } else if (roundedScore <= 4) {
            return ageRanges[0];
        } else {
            return ageRanges[roundedScore - 5];
        }
    }


    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("java Main <filename>");
            return;
        }

        String filename = args[0];
        StringBuilder textBuilder = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                textBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        String text = textBuilder.toString();

        int characters = countCharacters(text);
        int words = countWords(text);
        int sentences = countSentences(text);
        int syllables = 0;
        int polysyllables = 0;

        String[] wordsArray = text.split("\\s+");
        for (String word : wordsArray) {
            syllables += countSyllables(word);
            polysyllables += countSyllables(word) > 2 ? 1 : 0;
        }

        double ari = calculateARI(characters, words, sentences);
        double fleschKincaid = calculateFleschKincaid(words, sentences, syllables);
        double smog = calculateSMOG(sentences, polysyllables);
        double colemanLiau = calculateColemanLiau(characters, words, sentences);
        double avgAge = (ageToYears(ari) + ageToYears(fleschKincaid) + ageToYears(smog) + ageToYears(colemanLiau)) / 4.0;

        System.out.println("The text is:");
        System.out.println(text.trim());
        System.out.println("Words: " + words);
        System.out.println("Sentences: " + sentences);
        System.out.println("Characters: " + characters);
        System.out.println("Syllables: " + syllables);
        System.out.println("Polysyllables: " + polysyllables);
        System.out.println("Enter the score you want to calculate (ARI, FK, SMOG, CL, all): all");
        System.out.println("\nAutomated Readability Index: " + ari + " (about " + ageBracket((int) Math.round(ari)) + "-year-olds).");
        System.out.println("Flesch–Kincaid readability tests: " + fleschKincaid + " (about " + ageBracket((int) Math.round(fleschKincaid)) + "-year-olds).");
        System.out.println("Simple Measure of Gobbledygook: " + smog + " (about " + ageBracket((int) Math.round(smog)) + "-year-olds).");
        System.out.println("Coleman–Liau index: " + colemanLiau + " (about " + ageBracket((int) Math.round(colemanLiau)) + "-year-olds).");
        System.out.println("\nThis text should be understood in average by " + ageBracket((int) Math.round(avgAge)) + "-year-olds.");
    }

    private static int ageToYears(double score) {
        String ageBracket = ageBracket((int) Math.round(score));
        if (ageBracket.equals("24+")) {
            return 24;
        } else {
            String[] ageRange = ageBracket.split("-");
            if (ageRange.length > 1) {
                return Integer.parseInt(ageRange[1].replace("year-olds", "").trim());
            } else {
                return Integer.parseInt(ageBracket.replace("year-olds", "").trim());
            }
        }
    }
}
