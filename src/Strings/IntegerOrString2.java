package Strings;

// Java program to check if a given
// string is a valid integer
public class IntegerOrString2 {
        static public void main(String[] args)
        {
            String s = "123";
            //if String involves other than 0-9 it throws numberexception.
            try{
                Integer.parseInt(s);
                System.out.println("Integer");
            }catch(NumberFormatException e){
                System.out.println("String");
            }

            //System.out.println(Integer.parseInt("123q")); --> NumberFormatException
        }
    }

