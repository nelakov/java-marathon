package day13;

import static day13.MessageDatabase.showDialog;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Luke");
        User user2 = new User("Vader");
        User user3 = new User("Palpatin");

        user1.sendMessage(user2, "I'll never join you");
        user1.sendMessage(user2, "!!!!!!!!!!!!!!!!!!!");
        user2.sendMessage(user1, "Luke, you do not yet realize your importance. You have only begun to discover your power." + "\n" +
                "Join me, and I will complete your training. With our combined strength, we can end this destructive conflict and bring order to the galaxy.");
        user2.sendMessage(user1, "Obi Wan never told you what happened to your father.");
        user1.sendMessage(user2, "He told me enough! He told me you killed him!");
        user2.sendMessage(user1, "No, I am your father.");
        user3.sendMessage(user1, "Hi!");
        user3.sendMessage(user1, "What's app?");
        user3.sendMessage(user1, "How are are, buddy?");
        user1.sendMessage(user3, "I fightnig with Dart Vaider");
        user1.sendMessage(user3, "This crazy man told about that he my father");
        user1.sendMessage(user3, "Strange man. He would also say that Leia is my sister");
        user3.sendMessage(user1, "You know, buddy....You kissed your sister...");

        showDialog(user1, user3);
    }

}
