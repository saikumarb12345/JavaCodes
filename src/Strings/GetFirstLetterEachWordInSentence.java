package Strings;

public class GetFirstLetterEachWordInSentence {
    public static void main(String[] args) {

     String str = "hello world";
        System.out.println(firstLetterWord(str));
//     StringBuilder out = new StringBuilder();
//     for(String s : str.split(" ")){
//         out.append(s.charAt(0));
//     }
//        System.out.println(out.toString());
    }
    public static String firstLetterWord(String str){
        String result = "";
        boolean v = true;
        for(int i=0;i<str.length();i++){

            if(str.charAt(i) == ' '){
                v = true;
            }
            else if(str.charAt(i) != ' ' && v == true){
                result = result + str.charAt(i);
                v = false;
            }
        }
        return result;
    }
}
