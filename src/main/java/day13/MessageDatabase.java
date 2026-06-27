package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static final List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User sender, User receiver, String text) {
        messages.add(new Message(sender, receiver, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User firstUser, User secondUser) {
        for (Message message : messages) {
            if (isBetween(message, firstUser, secondUser)) {
                System.out.println(formatDialogLine(message));
            }
        }
    }

    private static boolean isBetween(Message message, User firstUser, User secondUser) {
        return (message.getSender().equals(firstUser) && message.getReceiver().equals(secondUser))
                || (message.getSender().equals(secondUser) && message.getReceiver().equals(firstUser));
    }

    private static String formatDialogLine(Message message) {
        return message.getSender().getUsername() + ": " + message.getText();
    }
}


