import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class QuoteChecker {
    private static Set<String> quotes;

    public QuoteChecker() {
        quotes = new HashSet<>();
    }

    public void loadQuotes(String filePath) throws IOException {
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String qoute = scanner.nextLine();
                if (!qoute.isEmpty()) {
                    quotes.add(qoute.toLowerCase());
                }
            }
        }
    }

    public static boolean hasMatchingQuote(String input) {
        String[] qoutesArray = input.toLowerCase().split("\\s+");
        for (String quote : qoutesArray) {
            if (quotes.contains(quote)) {
                return true;
            }
        }
        return false;
    }
}

