package homework9.task1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Map<String, String>> mp = new HashMap<>();
        mp.put("key1", new HashMap<>() {{
            put("Art1", "100");
            put("Max1", "200");
        }});
        mp.put("key2", new HashMap<>() {{
            put("Rita2", "300");
            put("Sasha2", "400");
            put("Igor2", "500");
        }});
        mp.entrySet().stream().flatMap(entry -> entry.getValue().entrySet().stream().
                        map(innerEntry -> entry.getKey() + " " + innerEntry.getKey() + " " + innerEntry.getValue())).
                forEach(System.out::println);
    }
}
