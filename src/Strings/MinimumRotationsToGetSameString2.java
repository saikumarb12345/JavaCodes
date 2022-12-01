package Strings;

public class MinimumRotationsToGetSameString2 {
    public static void main(String[] args)
    {
        String str = "sai";
        System.out.println(findRotations(str));
    }
    static int findRotations(String str)
    {
        int ans = 0; //to store the answer
        int n = str.length(); //length of the string

        //All the length where we can partition
        for(int i=1;i<str.length()-1;i++)
        {
            //right part + left part = rotated string
            // we are checking whether the rotated string is equal to
            //original string
            if(str.substring(i, str.length()-i) + str.substring(0, i)  == str)
            {
                ans = i;
                break;
            }
        }
        if(ans == 0)
            return n;
        return ans;
    }
}
