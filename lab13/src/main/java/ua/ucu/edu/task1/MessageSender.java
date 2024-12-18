package ua.ucu.edu.task1;

public class MessageSender {
    
    public void send(User user, String text) {
        System.out.println("Message was sent to " + user);
        System.out.println("Message: " + text);
    }
}