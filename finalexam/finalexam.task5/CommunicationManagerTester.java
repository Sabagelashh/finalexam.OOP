package finalexam.task5;

public class CommunicationManagerTester {
    public static void main(String[] args) {
        CommunicationManager manager = new CommunicationManager("https://example.com/api/chatbot");
        String response = manager.sendUserMessage("Hello, chatbot!");
        System.out.println("Response: " + response);
    }
}