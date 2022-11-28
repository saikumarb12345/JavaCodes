package Strings;

public class Substring {
    public static void main(String[] args) {
        String str = "Hello, I am Java Language";
        System.out.println(substring(str));
        System.out.println(substring2(str));
    }
    public static String substring(String str){
        return str.substring(12);
    }
    public static String substring2(String str){
        return str.substring(7,16);
    }

}
