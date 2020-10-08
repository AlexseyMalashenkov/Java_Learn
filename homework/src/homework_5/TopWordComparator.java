package homework_5;

import java.util.Comparator;
import java.util.Map;

public class TopWordComparator implements Comparator<String> {
    Map<String, Integer> map;

    public TopWordComparator(Map<String, Integer> map) {
        this.map = map;
    }

    public int compare(String a, String b) {
        return map.get(b).compareTo(map.get(a));
    }
}
