package Strings;

import java.util.HashSet;
import java.util.Set;

//Quick way to check if all the characters of a string are same

public class CheckAllCharactersAreSame {
    public static void main(String[] args) {
        String str = "nnn";
        if(allCharactersSame(str)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    public static boolean same(String s) {
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(0) != s.charAt(i))) {
                return false;
            }
        }
        return  true;
    }
    // Time Complexity: O(n), here n is the length of the string.

    public static boolean allCharactersSame(String s){
        Set<Character> s1 = new HashSet<Character>();

        for(int i=0;i<s.length();i++){
            s1.add(s.charAt(i));
        }
        if(s1.size() != 1){
            return false;
        }
        return true;
    }
    // Time Complexity: O(nLogn)
}
