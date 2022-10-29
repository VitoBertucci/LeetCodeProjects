package Maps;
import java.util.HashMap;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> mag = new HashMap<Character, Integer>();
        for(Character c : magazine.toCharArray()) {
            mag.merge(c, 1, Integer::sum);
        }
        for (Character c : ransomNote.toCharArray()) {
            mag.merge(c, -1, Integer::sum);
            if(mag.get(c) < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String r = "bgg";
        String m = "bg";

        System.out.println(canConstruct(r,m));
    }
}
