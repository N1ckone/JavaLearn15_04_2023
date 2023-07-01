package homework8.task2;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>((el1, el2) -> {
            int res = el2.length() - el1.length();
            if (res == 0) {
                res = el1.compareTo(el2);
            }
            return res;
        });
        map.put("String", "value");
        map.put("Air", "Value");
        map.put("Airplane", "Value");
        map.put("Apple", "Value");
        map.put("Orange", "Value");
        map.put("Alex", "Value");
        map.put("Axe", "Value");
        map.put("Ant", "Value");
        map.put("Aaa", "Value");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
