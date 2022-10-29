package Maps;
import java.util.HashMap;
//LeetCode 13
public class romanToInt {
    public static int rToI(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int num = 0;

        int i = 0;
        while(i+1 < s.length()) {
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
                num-=map.get(s.charAt(i));
            } else {
                num+=map.get(s.charAt(i));
            }
            i++;
        }

        num += map.get(s.charAt(s.length()-1));
        return num; 
        
    }
}
