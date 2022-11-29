package Strings;

public class MaximumNumericValue {
    public static void main(String[] args) {
        String str = "1ab289c234g"; // 289
        System.out.println(findMax(str));
    }
    public static int findMax(String str){

        String temp = "0";
        int max = 0;
        // traverse through each character
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            // check if character is digit
            // then add it to the temp
            if(Character.isDigit(ch)){
                temp = temp + ch;
            }
            // compare temp and max for greater one
            else {
                if(max < Integer.parseInt(temp)){
                    max = Integer.parseInt(temp);
                }
                temp = "0";
            }
        }
        return max;
    }
}
