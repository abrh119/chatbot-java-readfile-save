
## Java Chatbot Project

The project is a Java-based chatbot with multiple functionalities. The chatbot interacts with the user through a console interface and offers three options: "joke", "advice", and "quiz".

1. **Joke**: When the user selects the "joke" option, the chatbot fetches a random joke from a text file called "jokes.txt". If the file is empty or not found, the chatbot responds with "No jokes available."

2. **Advice**: If the user selects the "advice" option, the chatbot retrieves a random advice from a text file named "advices.txt". Similarly, if the file is empty or not found, the chatbot responds with "No advice available."

3. **Quiz**: In the "quiz" option, the chatbot allows the user to ask a question. The chatbot checks if the question exists in a text file called "quiz.txt", which contains pre-defined question-answer pairs. If the question exists, the chatbot provides the corresponding answer. However, if the question is not found, the chatbot asks the user to provide the answer and saves the question-answer pair in the "quiz.txt" file for future reference.

The project consists of three classes: `Chatbot`, `Quiz`, and `Main`. The `Chatbot` class handles the joke and advice functionalities, as well as communication with the `Quiz` class. The `Quiz` class manages the quiz-related operations, including loading and saving question-answer pairs from the "quiz.txt" file. The `Main` class contains the main method, where the chatbot functionalities are executed and user interactions are facilitated through the console interface.

The project allows users to enjoy random jokes, receive advice, and participate in a quiz by asking questions and contributing answers to expand the knowledge base of the chatbot.
