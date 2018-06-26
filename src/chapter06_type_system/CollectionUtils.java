package chapter06_type_system;

import java.util.List;

public class CollectionUtils {
    public static List<String> uppercaseAll(List<String> items) {
        for (int j = 0; j < items.size(); ++j)
            items.set(j, items.get(j).toUpperCase());
        return items;
    }
}
