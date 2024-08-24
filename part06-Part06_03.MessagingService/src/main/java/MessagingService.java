import java.util.ArrayList;

public class MessagingService {
    ArrayList<Message> messagesList;

    public MessagingService() {
        this.messagesList = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            messagesList.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return this.messagesList;
    }
}
