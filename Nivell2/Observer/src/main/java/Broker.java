import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Broker {
    Map<String, List<EventListener>> subscribers = new HashMap<>();

    public Broker(String... operations) {
        for (String operation : operations) {
            this.subscribers.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> users = subscribers.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> users = subscribers.get(eventType);
        users.remove(listener);
    }

    public void notify(String message) {
        List<EventListener> users = subscribers.get(message);
        for (EventListener listener : users) {
            listener.updateStock(message);
        }
    }
}








