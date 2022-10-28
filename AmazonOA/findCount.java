package AmazonOA;
import java.util.Collections;
import java.util.HashMap;


public class findCount {
    public static int findMaximumMaxima(String s) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        HashMap<Character, Integer> top = new HashMap<Character, Integer>();
        for(char c : s.toCharArray()) {
            count.merge(c, 1, Integer::sum);
            count.forEach((key,value) -> {if(value >= Collections.max(count.values())) {top.merge(key, 1, Integer::sum);}});    
        }
        return Collections.max(top.values());
    }
}
