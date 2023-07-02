package homework9.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lists {
    public static Map<String, String> listToMap(List<String> list) {
        Map<String, List<String>> groupMap = group(list);
        Map<String, String> resultMap = new HashMap<>();
        for (Map.Entry<String, List<String>> entry : groupMap.entrySet()) {
            String longestString = entry.getValue().stream().filter(e -> e.length() < 10).
                    sorted((el1, el2) -> el2.length() - el1.length()).findFirst().orElse(null);
            resultMap.put(entry.getKey(), longestString);
        }
        return resultMap;
    }

    private static Map<String, List<String>> group(List<String> list) {
        Map<String, List<String>> stringMap = new HashMap<>();
        for (String s : list) {
            String first = s.substring(0, 1).toUpperCase();
            if (!Character.isLetter(first.charAt(0))) {
                continue;
            }
            stringMap.computeIfAbsent(first, k -> new ArrayList<>());
            if (stringMap.get(first) != null) {
                stringMap.get(first).add(s);
            }
        }
        return stringMap;
    }
}
