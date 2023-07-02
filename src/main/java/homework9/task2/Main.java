package homework9.task2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "Артем", "Андрей", "Антон", "Виктория",
                "Василиса", "Валерия", "Максим",
                "Марк", "Мария", "Марина",
                "ЕвгенийВикторович", "ЕленаДмитриевна");
        Map<String, String> map = Lists.listToMap(list);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
