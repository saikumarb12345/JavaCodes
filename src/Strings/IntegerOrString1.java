package Strings;

// Program to check if input is an integer or a string
public class IntegerOrString1 {
    public static void main(String[] args) {
        String str = "abc";

        // if String is between 0 - 9 , then only it is "Integer".
        if(isNumber(str)){
            System.out.println("Integer");
        }
        // else if String contains other than 0-9, like special characters then it will return "String".
        else {
            System.out.println("String");
        }
    }
    public static boolean isNumber(String s){
        // traverse the string
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)) == false)
                return false;
        }
        return true;
    }
}
