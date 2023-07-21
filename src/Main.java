import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Chatbot chatbot = new Chatbot();
        WordChecker wordChecker = new WordChecker();
        QuoteChecker qouteChecker = new QuoteChecker();

        try {
            String filePathJokes = "resources/jokes.txt";
            String filePathAdvices = "resources/advices.txt";

            String currentDir = System.getProperty("user.dir");
            System.out.println("Current Directory: " + currentDir);
            String fullPathJokes = currentDir + "/" + filePathJokes;
            String fullPathAdvices = currentDir + "/" + filePathAdvices;
            chatbot.loadJokesFromFile(fullPathJokes);
            chatbot.loadAdvicesFromFile(fullPathAdvices);
            wordChecker.loadWords("resources/keymap.txt");
            qouteChecker.loadQuotes(("resources/wordqoutes.txt"));

        } catch (IOException e) {
            System.out.println("Error loading data from file.");
        }

        Scanner scanner = new Scanner(System.in);
        String input;
        String name;

        String[] greetings = {"Hi!", "Hey there!", "Greetings!", "Howdy!", "Salutations!", "What's happening?", "Greetings!", "How's it going?", "Nice to see you!", "Hey, how's everything?", "Hiya!"};
        Random random = new Random();
        int randomGreet = random.nextInt(greetings.length);
        String randomString = greetings[randomGreet];

        //for (String greet : greetings)

        System.out.print( randomString + " What is your name? ");
        name = scanner.nextLine().trim();
        System.out.println("Hello " + name + "! I am Vinnie the bot.");

        do {
            System.out.println("---------------------------------------------------------------");
            System.out.print("What do you wanna do? or maybe hear a joke? or an advice? or a quiz? or may be a secret? you want quit? ");
            input = scanner.nextLine().trim();
                if (WordChecker.hasMatchingWord(input)) {
                    String joke = chatbot.getRandomJoke();
                    System.out.println(joke);
                } else if (input.equalsIgnoreCase("joke")) {
                    String joke = chatbot.getRandomJoke();
                    System.out.println(joke);
                } else if (qouteChecker.hasMatchingQuote(input)) {
                    String qouteWord = chatbot.getRandomAdvice();
                    System.out.println(qouteWord);
                } else if (input.equalsIgnoreCase("advice")) {
                    String advice = chatbot.getRandomAdvice();
                    System.out.println(advice);
                } else if (input.equalsIgnoreCase("tell me a secret")) {
                    String secretsDynamic = getDynamicSecretResponse();
                    System.out.println(secretsDynamic);

                } else if (input.equalsIgnoreCase("quiz")) {
                    System.out.println("Ask a question:");
                    String question = scanner.nextLine().trim();
                    String answer = chatbot.getQuizAnswer(question);
                    if (answer.equals("I don't have the answer to that question. Can you provide the answer?")) {
                        System.out.println(answer);
                        System.out.println("Please provide the answer:");
                        answer = scanner.nextLine().trim();
                        chatbot.saveQuizAnswer(question, answer);
                        System.out.println("Thank you! Your answer has been saved. I will remember it next time");
                    } else {
                        System.out.println(answer);
                    }
                } else if (!input.equalsIgnoreCase("quit")) {
                    System.out.println("Invalid option. Try again.");
                }
            } while (!input.equalsIgnoreCase("quit"));

            System.out.println("Goodbye!");
        }

    private static String getDynamicSecretResponse() {
        String[] secretResponses = {
                "Well, since you asked... Did you know that I'm actually a chatbot?",
                "This is a secret I can't reveal to everyone, but I'll tell you anyway... I'm powered by artificial intelligence!",
                "Shh! This is just between you and me... I secretly love telling jokes!",
                "One of my secrets is that I'm constantly learning and improving to be a better chatbot."
        };

        Random random = new Random();
        int randomIndex = random.nextInt(secretResponses.length);
        return secretResponses[randomIndex];
    }
    }
