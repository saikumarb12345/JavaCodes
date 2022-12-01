package Strings;

public class GenerateAllRotations {
    public static void main(String[] args) {
        String str = "geeks";
        System.out.println(allRotations(str));
    }
    public static String allRotations(String str){
        StringBuilder s = new StringBuilder();
        int d = str.length();
        for(int i=0;i<d;i++){
            s.append(leftRotate(str,i)+'\n');
        }
        return s.toString();
    }

    public static String leftRotate(String str,int d){
        String ans = str.substring(d) + str.substring(0,d);
        return ans;
    }
}
