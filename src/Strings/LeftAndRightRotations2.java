package Strings;

public class LeftAndRightRotations2 {
    public static void main(String[] args) {
        String str1 = "hello";
        System.out.println(leftRotate(str1,2));
        String str2 = "hello";
        System.out.println(rightRotate(str2,2));
    }
    public static String leftRotate(String str,int d){
        // create temp string that is double the given string
        String temp = str + str;
        int  n = str.length();

        String ans = temp.substring(d,n+d);
        return ans;
    }
    public static String rightRotate(String str,int d){

        String ans = leftRotate(str,str.length() - d);
        return ans;
    }
}

//Time Complexity: O(N), where N is the size of the given string.