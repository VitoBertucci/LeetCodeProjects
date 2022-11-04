package Strings;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        s = Stream.of(s.split("")).sorted().collect(Collectors.joining());
        t = Stream.of(t.split("")).sorted().collect(Collectors.joining());
        return s.equalsIgnoreCase(t);
    }
}
