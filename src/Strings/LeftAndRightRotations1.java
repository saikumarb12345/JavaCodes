package Strings;

public class LeftAndRightRotations1 {
    public static void main(String[] args) {
        String str1 = "hello";
        System.out.println(leftRotate(str1,2)); // llohe
        String str2 = "hello";
        System.out.println(rightRotate(str2,2)); //lohel
    }
    public static String leftRotate(String str,int d){
        String ans = str.substring(d) + str.substring(0,d);
        return ans;
    }
    public static String rightRotate(String str,int d){
        String ans = leftRotate(str,str.length()-d);
        return ans;
    }
}
// Time Complexity: O(N), where N is the size of the given string.
