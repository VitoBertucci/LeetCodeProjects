public class leet125 {
    //return true if s is palindrome 
    public boolean isPalindrome (String s) {

        //format to only ASCII alpanumeric
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        //set start and end of word
        int i = 0;
        int j = s.length()-1;

        //iterate through start and end, if not match, return false
        while (i < j) {
            if(!(s.charAt(i) == s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}