package Strings;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "Radar";
        System.out.println(palindrome(str));
    }
    public static boolean palindrome(String str){
        if(str == null || str.length() == 0){
            return true;
        }
        str = str.toLowerCase();
        for(int i=0;i<=str.length()-1;i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 -i);
            if(start != end){
                return false;
            }
        }
        return true;

    }
}
