# Java Chatbot Project

This Java Chatbot project demonstrates a simple chatbot application that utilizes object-oriented programming (OOP) concepts to provide jokes, advice, and a quiz feature. The chatbot interacts with the user through the command line interface.

## Features

- Jokes: The chatbot, implemented in the `Chatbot` class, encapsulates the functionality of loading jokes from a file and generating random joke responses. It demonstrates the use of encapsulation and abstraction in OOP.
- Advice: The `Chatbot` class also handles the loading of advice data and generating random advice responses. The separation of concerns showcases the principle of modularity in OOP.
- Quiz: The `Chatbot` class includes a quiz feature that allows users to ask questions and receive answers. If the chatbot doesn't know the answer, it prompts the user to provide it and saves it for future reference. This demonstrates the use of inheritance and polymorphism in OOP, as the `Quiz` class extends the functionality of the `Chatbot` class.

The project also utilizes other classes:
- `WordChecker`: This class, following the principles of encapsulation and abstraction, checks if user input contains keywords from a file and triggers a joke response. It showcases the power of OOP in modularizing and reusing code.
- `QuoteChecker`: Similar to `WordChecker`, this class checks user input for keywords and triggers an advice response.

To run the project, make sure to place the required data files (`jokes.txt`, `advices.txt`, `keymap.txt`, `wordquotes.txt`) in the `resources` folder. Execute the `Main` class to start the chatbot.

This project highlights the use of OOP concepts like encapsulation, abstraction, inheritance, and polymorphism to build a modular, extensible, and maintainable chatbot application.

## - Encapsulation:

The Chatbot class encapsulates the functionality of loading jokes, advices, and quiz answers from files, generating random responses, and saving user-provided quiz answers. It hides the implementation details and provides a public interface for interaction.
The WordChecker class encapsulates the logic of loading keywords from a file and checking if user input contains any of those keywords. It provides a public method to perform the check and abstracts away the details of file handling and keyword matching.


## - Abstraction:

The Chatbot class abstracts the concept of a chatbot by providing high-level methods like getRandomJoke(), getRandomAdvice(), getQuizAnswer(), and saveQuizAnswer(). It allows users to interact with the chatbot without worrying about the underlying implementation details.
The WordChecker and QuoteChecker classes abstract the concept of checking user input for specific keywords. They provide a simple interface for performing the check without exposing the internal implementation.

## - Inheritance:

The Quiz class extends the Chatbot class, inheriting its properties and methods. It adds specific functionality related to the quiz feature while reusing the existing code from the base class. This demonstrates the principle of code reuse and the ability to extend the functionality of existing classes.

## - Polymorphism:

The Chatbot class uses polymorphism when responding to user input. It determines the type of user input (jokes, advices, quiz) and dynamically selects the appropriate response based on the input. This allows the chatbot to exhibit different behaviors based on the context, showcasing polymorphic behavior.
These examples highlight how encapsulation, abstraction, inheritance, and polymorphism are employed in the code base to achieve modular, reusable, and extensible design, which are key principles of object-oriented programming.
