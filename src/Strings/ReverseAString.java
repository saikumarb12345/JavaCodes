package Strings;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(reverseStringMethod2(str));
    }

    public static String reverseStringMethod1(String str) {
        StringBuilder out = new StringBuilder();
        char[] ch = str.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            out.append(ch[i]);
        }
        return out.toString();
    }

    public static String reverseStringMethod2   (String str) {
        String revStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revStr += str.charAt(i);
        }
        return revStr;
    }
}