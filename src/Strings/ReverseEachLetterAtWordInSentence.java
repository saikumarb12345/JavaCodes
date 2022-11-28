package Strings;

public class ReverseEachLetterAtWordInSentence {
    // Reverse each word’s characters but the position of word in string remain unchanged
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(reverse(str));
    }
    public static String reverse(String str){
        String revString = "";
        String words[] = str.split(" ");
        for(String s:words){
            StringBuilder out = new StringBuilder(s);
            out.reverse();
            revString = revString + out.toString()+" ";
        }
        return revString.trim(); // return revString.toString();
    }
}
