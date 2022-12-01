package Strings;

// Minimum rotations required to get the same string
public class MinimumRotationsToGetSameString {
    public static void main(String[] args) {
        String str = "sai";
        System.out.println(minimum(str));
    }
    public static int minimum(String str){
        String temp = str + str;
        int n = str.length();
        for(int i=1;i<n;i++){

            String substring = temp.substring(i,i+str.length());

            // if substring matches with original string
            // then we will come out of the loop.
            if(str.equals(substring)){
                return i;
            }
        }
        return n;
    }
}
// Time Complexity: O(n**2)
