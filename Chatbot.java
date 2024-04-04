package internshipQUestions;
import java.util.Random;
import java.util.Scanner;

public class Chatbot {

            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hello! I'm a simple chatbot. How can I help you today?");

            while (true) {
                String userInput = scanner.nextLine().toLowerCase(); // Convert input to lowercase for easier processing

                // Check for user's intent and generate response
                String botResponse = generateResponse(userInput);

                // Output bot's response
                System.out.println(botResponse);

                // End the conversation if the user says "bye"
                if (userInput.equals("bye")) {
                    System.out.println("Goodbye! Have a great day!");
                    break;
                }
            }
            scanner.close();
        }


        public static String generateResponse(String userInput) {

            String[] greetings = {"Hello!", "Hi there!", "Hey!"};
            String[] farewells = {"Goodbye!", "Bye!", "See you later!"};
            String[] genericResponses = {"I'm sorry, I didn't understand that.", "Could you please rephrase that?", "I'm not sure I follow."};

            // Random object to select random responses
            Random random = new Random();

            // Check user input for specific keywords and generate appropriate response
            if (userInput.contains("hello") || userInput.contains("hi") || userInput.contains("hey")) {
                return greetings[random.nextInt(greetings.length)];
            } else if (userInput.contains("bye")) {
                return farewells[random.nextInt(farewells.length)];
            } else {
                return genericResponses[random.nextInt(genericResponses.length)];
 }
}
    }



