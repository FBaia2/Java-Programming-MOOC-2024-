import java.util.ArrayList;

public class MessagingService {

    private ArrayList<Message> message123;

    public MessagingService() {

        this.message123 = new ArrayList<>();

    }

    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            message123.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return message123;

    }

}
