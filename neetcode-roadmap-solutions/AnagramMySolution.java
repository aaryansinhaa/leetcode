import java.util.*;

class AnagramMySolution {
    static String s = "anagram";
    static String t = "nagaram";
    public static boolean isAnagram(String s, String t){
        char[] sInChars = s.toCharArray();
        char[] tInChars = t.toCharArray();

        Arrays.sort(sInChars);
        Arrays.sort(tInChars);

        return Arrays.equals(sInChars, tInChars);
    }
    public static void main(String[] args){
        System.out.print(isAnagram(s,t));
        
    }
}