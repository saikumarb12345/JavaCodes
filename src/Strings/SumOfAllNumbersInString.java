package Strings;

// Java program to calculate sum of all numbers present
// in a string containing alphanumeric characters
public class SumOfAllNumbersInString {
    public static void main(String[] args) {
        String str = "4pq2ab11";  // 4 + 2 + 11 = 17
        System.out.println(findSum(str));
    }
    public static int findSum(String str){
        String temp = "0";
        int sum = 0;
        // traverse through each character
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            // check if character is digit
            // then add it to the temp
            if(Character.isDigit(ch)){
                temp = temp + ch;
            }
            // if character is alphabet
            // then add temp to the sum
            else {
                sum = sum + Integer.parseInt(temp);
                // reset temp eqauls to 0
                temp = "0";
            }
        }
        return sum + Integer.parseInt(temp);
    }
}
// Time Complexity == o(n) --> As we are traversing through the entire string