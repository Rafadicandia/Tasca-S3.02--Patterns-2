import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Broker {
    Map<String, List<EventListener>> listeners = new HashMap<>();
}
