import java.util.*;

public class WordsChecker {
    ArrayList<String> words;

    public WordsChecker(String text) {
        words = new ArrayList<>(Arrays.asList(text.split("\\P{IsAlphabetic}+")));
        Collections.sort(words);
    }
    public boolean hasWord(String word) {
        if (Collections.binarySearch(words , word) >= 0) {
            return true;
        }
        return false;
    }
    public void getWords() {
        for (String word : words) {
            System.out.println(word);
        }
    }
}
