package Strings;

public class Printing {
    public static void main(String[] args) {
        /* Placeholders In Java
        %c - Character
        %d - Decimal number (base 10)
        %e - Exponential floating-point number
        %f - Floating-point number
        %i - Integer (base 10)
        %o - Octal number (base 8)
        %s - String
        %u - Unsigned decimal (integer) number
        %x - Hexadecimal number (base 16)
        %t - Date/time
        %n - Newline
         */
        float num = 234.2672f;
        //System.out.printf("Format is %.1f",num);
        System.out.printf("Pie : %.2f %n",Math.PI);

        System.out.printf("Hello I am %s and I am %s","Sai","Cool");
    }
}
