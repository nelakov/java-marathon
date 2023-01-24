package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User sender, User receiver, String text) {
        messages.add(new Message(sender, receiver, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message message : messages) {
            if (message.getSender().equals(u1) || message.getReceiver().equals(u2)) {
                System.out.println("\"" + message.getSender().getUsername() + " :\"" + message.getText());
            }

            if (message.getSender().equals(u2) || message.getReceiver().equals(u1)) {
                System.out.println("\"" + message.getSender().getUsername() + " :\"" + message.getText());
            }
        }
    }
}


