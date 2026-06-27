package day13;

import java.util.Date;

public class Message {

    private final User sender;
    private final User receiver;
    private final String text;
    private final Date date;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date();
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return new Date(date.getTime());
    }

    @Override
    public String toString() {
        return "FROM: '" + sender + "' "
                + "TO: '" + receiver + "' "
                + "ON: " + date + " "
                + "'" + text + "'";
    }
}
