//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//import java.util.Scanner;
//
//class Chatbot {
//    private List<String> jokes;
//    private List<String> advices;
//
//    public Chatbot() {
//        jokes = new ArrayList<>();
//        advices = new ArrayList<>();
//    }
//
//    public void loadJokesFromFile(String filePath) throws IOException {
//        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                jokes.add(line);
//            }
//        }
//    }
//
//    public void loadAdvicesFromFile(String filePath) throws IOException {
//        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                advices.add(line);
//            }
//        }
//    }
//
//    public String getRandomJoke() {
//        if (jokes.isEmpty()) {
//            return "No jokes available.";
//        }
//
//        Random random = new Random();
//        int index = random.nextInt(jokes.size());
//        return jokes.get(index);
//    }
//
//    public String getRandomAdvice() {
//        if (advices.isEmpty()) {
//            return "No advice available.";
//        }
//
//        Random random = new Random();
//        int index = random.nextInt(advices.size());
//        return advices.get(index);
//    }
//}
//


import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

class Chatbot {
    private Map<String, String> jokes;
    private Map<String, String> advices;
    private Quiz quiz;

    public Chatbot() {
        jokes = new HashMap<>();
        advices = new HashMap<>();
        quiz = new Quiz();
    }

    public void loadJokesFromFile(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                jokes.put(line, null);
            }
        }
    }

    public void loadAdvicesFromFile(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                advices.put(line, null);
            }
        }
    }

    public String getRandomJoke() {
        if (jokes.isEmpty()) {
            return "No jokes available.";
        }

        Random random = new Random();
        int index = random.nextInt(jokes.size());
        return (String) jokes.keySet().toArray()[index];
    }

    public String getRandomAdvice() {
        if (advices.isEmpty()) {
            return "No advice available.";
        }

        Random random = new Random();
        int index = random.nextInt(advices.size());
        return (String) advices.keySet().toArray()[index];
    }

    public String getQuizAnswer(String question) {
        String answer = quiz.getAnswer(question);
        if (answer == null) {
            answer = "I don't have the answer to that question. Can you provide the answer?";
        }
        return answer;
    }

    public void saveQuizAnswer(String question, String answer) {
        quiz.saveAnswer(question, answer);
    }
}



