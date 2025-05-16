import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> responses = new HashMap<>();
        responses.put("hello", "Hello! How can I assist you with Java?");
        responses.put("hi", "Hi there! Need help with any Java topic?");
        responses.put("bye", "Goodbye! Keep practicing Java and data structures!");
        responses.put("what is java", "Java is a high-level, object-oriented programming language used to build applications.");
        responses.put("thank you", "You're welcome! Feel free to ask anything else.");
        responses.put("how are you", "Running smoothly and ready to answer your questions!");
        responses.put("tell me a joke", "Why was the Java developer always calm? Because he had a lot of classes to keep him cool! ");
        responses.put("what is array", "An array is a container object that holds a fixed number of elements of the same type.");
        responses.put("what is class", "A class is a blueprint for creating objects. It defines properties and behaviors.");
        responses.put("what is object", "An object is an instance of a class.");
        responses.put("what are you doing", "chatting with you!.");
        

        LinkedList<String[]> chatPairs = new LinkedList<>();

        System.out.println("Welcome to ChatBot!");
        System.out.println("Type something (type 'exit' to quit).");

        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine().toLowerCase().trim();
            
            // to exit from the conversation
            if (input.equals("exit")) {
                System.out.println("Bot: Chat ended. Goodbye!");
                break;
            }
            //to show previous chats
            if (input.equals("show chat history") || input.equals("history")) {
                System.out.println("Last 5 chats:");

                int start = Math.max(0, chatPairs.size() - 5);
                for (int i = start; i < chatPairs.size(); i++) {
                    String[] pair = chatPairs.get(i);
                    System.out.println("You: " + pair[0]);
                    System.out.println("Bot: " + pair[1]);
                    System.out.println();  
                }
                continue;
            }

            String botReply;
            if (responses.containsKey(input)) {
                botReply = responses.get(input);
            } else {
                botReply = "Sorry, I don't understand. Try asking about Java basics or data structures.";
            }

            chatPairs.add(new String[]{input, botReply});

            System.out.println("Bot: " + botReply);
        }

        scanner.close();
    }
}
