package Strings;

//Find the minimum distance between the given two words in String array
public class ShortestDistance {
    public static void main(String[] args) {
        String[] str = { "the", "quick", "brown", "fox", "hen" };
        System.out.println(shortestDistance(str,"the","brown"));
    }
    public static int shortestDistance(String[] str,String w1,String w2){
        int d1 = -1, d2 = -1;
        int ans = Integer.MAX_VALUE;

        for (int i=0;i<str.length;i++){
            if(str[i] == w1){
                d1 = i;
            }
            if(str[i] == w2){
                d2 = i;
            }
            if(d1 !=-1 && d2 !=-1){
                ans = Math.min(ans,Math.abs(d1-d2));
            }
        }
        return ans;
    }
}
