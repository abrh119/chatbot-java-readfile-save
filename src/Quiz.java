import java.io.*;
import java.util.HashMap;
import java.util.Map;

class Quiz {
    private Map<String, String> quizAnswers;
    private String filePath;

    public Quiz() {
        quizAnswers = new HashMap<>();
        filePath = "resources/quiz.txt"; // Adjust the file path as needed
        loadQuizAnswersFromFile();
    }

    public String getAnswer(String question) {
        String lowercaseQuestion = question.toLowerCase();
        if (quizAnswers.containsKey(lowercaseQuestion)) {
            return quizAnswers.get(lowercaseQuestion);
        } else {
            return "I don't have the answer to that question. Can you provide the answer?";
        }
    }

    public void saveAnswer(String question, String answer) {
        String lowercaseQuestion = question.toLowerCase();
        String lowercaseAnswer = answer.toLowerCase();
        quizAnswers.put(lowercaseQuestion, lowercaseAnswer);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(lowercaseQuestion);
            writer.newLine();
            writer.write(lowercaseAnswer);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error saving quiz answer.");
        }
    }

    public void loadQuizAnswersFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String lowercaseQuestion = line.toLowerCase();
                String lowercaseAnswer = reader.readLine().toLowerCase();
                quizAnswers.put(lowercaseQuestion, lowercaseAnswer);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Quiz file not found. Starting with an empty quiz.");
        } catch (IOException e) {
            System.out.println("Error loading quiz answers from file.");
        }
    }
}
