package ex3;

import java.util.*;

public class Maps {
    public static int count(Map<Integer, Integer> map) {
        return map.size();
    }

    public static void empty(Map<Integer, Integer> map) {
        map.clear();
    }

    public static boolean contains(Map<Integer, Integer> map, int key) {
        return map.containsKey(key);
    }

    public static boolean containsKeyVakue(Map<Integer, Integer> map, int key, int value) {
        return map.containsKey(key) && map.get(key) == value;
    }

    public static Collection<Integer> values(Map<Integer, Integer> map) {
        return map.values();
    }
    public static Set<Integer> keySet(Map<Integer, Integer> map){
        return map.keySet();
    }
    public static String getColor(int value) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "Black");
        map.put(1, "White");
        map.put(2, "Red");
        return map.get(value);
    }
}
