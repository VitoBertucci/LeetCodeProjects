package Maps;

import java.util.Map;
import java.util.stream.Collectors;
//letcode 451

public class sortChars {
    public static String frequencySort(String s) {
        Map<Character, Long> map = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        StringBuilder str = new StringBuilder();
        map.entrySet().stream().sorted(Map.Entry.<Character, Long> comparingByValue().reversed()).forEach((entry) -> str.append(String.valueOf(entry.getKey()).repeat(entry.getValue().intValue())));
        return str.toString();
    }
}
