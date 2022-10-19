import java.util.HashMap;

public class leet13 {
    public int romanToInt(String s) {
        int num = 0;
        //char arr[] = s.toCharArray();
        // s.replace('I', '1');
        // s.replace("IV", '4');
        // s.replace('X', "10");
        // s.replace("IX", "9");
        // s.replace('L', "50");
        // s.replace("XL", "40");
        // s.replace('C', "100");
        // s.replace("XC", "90");
        // s.replace('D', "500");
        
        HashMap<String,Integer> map =new HashMap<String,Integer>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        return num;
    }

    public static void main(String[] args) {
        String num = "XIV";
        num = num.replace("IV", "4");
        System.out.println(num);


    }
}
