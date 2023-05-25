import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class WordChecker {
    private static Set<String> words;

    public WordChecker() {
        words = new HashSet<>();
    }

    public void loadWords(String filePath) throws IOException {
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String word = scanner.nextLine();
                if (!word.isEmpty()) {
                    words.add(word.toLowerCase());
                }
            }
        }
    }

    public static boolean hasMatchingWord(String input) {
        String[] wordsArray = input.toLowerCase().split("\\s+");
        for (String word : wordsArray) {
            if (words.contains(word)) {
                return true;
            }
        }
        return false;
    }
}
