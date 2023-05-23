import java.io.IOException;
import java.util.Scanner;
import java.io.IOException;
import java.util.Scanner;

//
//public class Main {
//    public static void main(String[] args) {
//        Chatbot chatbot = new Chatbot();
//        try {
//            String filePathJokes = "resources/jokes.txt";
//            String filePathAdvices = "resources/advices.txt";
//            String currentDir = System.getProperty("user.dir");
//            System.out.println("Current Directory: " + currentDir);
//            String fullPathJokes = currentDir + "/" + filePathJokes;
//            String fullPathAdvices = currentDir + "/" + filePathAdvices;
//            chatbot.loadJokesFromFile(fullPathJokes);
//            chatbot.loadAdvicesFromFile(fullPathAdvices);
//        } catch (IOException e) {
//            System.out.println("Error loading data from file.");
//        }
//
//        Scanner scanner = new Scanner(System.in);
//        String input;
//
//        do {
//            System.out.print("Choose an option (joke, advice, quit): ");
//            input = scanner.nextLine().trim();
//
//
//            if (input.equalsIgnoreCase("joke")) {
//                String joke = chatbot.getRandomJoke();
//                System.out.println(joke);
//            } else if (input.equalsIgnoreCase("advice")) {
//                String advice = chatbot.getRandomAdvice();
//                System.out.println(advice);
//            } else if (!input.equalsIgnoreCase("quit")) {
//                System.out.println("Invalid option. Try again.");
//            }
//        } while (!input.equalsIgnoreCase("quit"));
//
//        System.out.println("Goodbye!");
//    }
//}
public class Main {
    public static void main(String[] args) {
        Chatbot chatbot = new Chatbot();
        try {
            String filePathJokes = "resources/jokes.txt";
            String filePathAdvices = "resources/advices.txt";

            String currentDir = System.getProperty("user.dir");
            System.out.println("Current Directory: " + currentDir);
            String fullPathJokes = currentDir + "/" + filePathJokes;
            String fullPathAdvices = currentDir + "/" + filePathAdvices;
            chatbot.loadJokesFromFile(fullPathJokes);
            chatbot.loadAdvicesFromFile(fullPathAdvices);
        } catch (IOException e) {
            System.out.println("Error loading data from file.");
        }

        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Choose an option (joke, advice, quiz, quit): ");
            input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("joke")) {
                String joke = chatbot.getRandomJoke();
                System.out.println(joke);
            } else if (input.equalsIgnoreCase("advice")) {
                String advice = chatbot.getRandomAdvice();
                System.out.println(advice);
            } else if (input.equalsIgnoreCase("quiz")) {
                System.out.println("Ask a question:");
                String question = scanner.nextLine().trim();
                String answer = chatbot.getQuizAnswer(question);
                if (answer.equals("I don't have the answer to that question. Can you provide the answer?")) {
                    System.out.println(answer);
                    System.out.println("Please provide the answer:");
                    answer = scanner.nextLine().trim();
                    chatbot.saveQuizAnswer(question, answer);
                    System.out.println("Thank you! Your answer has been saved.");
                } else {
                    System.out.println(answer);
                }
            } else if (!input.equalsIgnoreCase("quit")) {
                System.out.println("Invalid option. Try again.");
            }
        } while (!input.equalsIgnoreCase("quit"));

        System.out.println("Goodbye!");
    }
}