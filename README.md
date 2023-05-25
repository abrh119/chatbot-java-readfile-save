# Chatbot Project

The Chatbot Project is a Java application that implements an interactive chatbot, capable of providing jokes, advice, and quiz functionality. This project showcases the effective utilization of Object-Oriented Programming (OOP) concepts, demonstrates the dynamic nature of the chatbot's responses, and exhibits its versatile functionality.

## Functionality

The chatbot offers the following key features:

- **Jokes and Advice**: Users can engage in conversation with the chatbot and request jokes or advice based on their input. The chatbot employs a method to determine whether to display a joke or advice, depending on the presence of specific words in the user's input. If the user's input contains words associated with jokes, a random joke is generated and displayed. Similarly, if the input contains words related to advice, a motivational or insightful advice message is presented. This dynamic behavior enhances the user experience, providing personalized responses based on their input.

- **Quiz**: The chatbot includes a quiz functionality that allows users to pose questions. The chatbot attempts to provide the answer based on pre-defined quiz answers. If the answer is not available, the chatbot prompts the user to provide the answer, which is then saved for future reference. This feature encourages user engagement and interaction, promoting an interactive learning experience.

## OOP Concepts and Code Examples

The Chatbot Project demonstrates the effective implementation of various OOP concepts:

- **Encapsulation**: The project incorporates encapsulation by defining classes such as `Chatbot`, `WordChecker`, and `QuoteChecker`, which encapsulate their respective functionalities. These classes hide implementation details and provide well-defined interfaces for interaction with the chatbot.

- **Abstraction**: Abstraction is employed in the `Chatbot` class, which abstracts the chatbot's functionality by providing high-level methods such as `getRandomJoke()`, `getRandomAdvice()`, and `getQuizAnswer()`. This simplifies interaction with the chatbot, allowing users to access the desired features without concerning themselves with the underlying implementation.

- **Inheritance**: Inheritance is utilized in the `Chatbot` class, which serves as the base class for the specialized chatbot functionalities. The `WordChecker` and `QuoteChecker` classes inherit from `Chatbot` and provide additional functionality specific to word checking and quote matching.

- **Polymorphism**: Polymorphism is exemplified by the usage of polymorphic behavior in the `Chatbot` class. The methods `getRandomJoke()` and `getRandomAdvice()` exhibit polymorphism as they can be overridden in derived classes to provide different joke and advice implementations, enabling customization and extension of the chatbot's behavior.

The Chatbot Project's seamless integration of OOP concepts, dynamic response generation based on user input, and diverse functionality makes it a robust and interactive application. Users can enjoy engaging conversations with the chatbot while experiencing the power of OOP principles in action.

