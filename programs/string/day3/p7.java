package string.day3;


// reverse the word in string sentence  (java  is lang = avaj si ganl )
import java.util.Arrays;

public class p7 {
    public static void main(String[] args) {

        String s1 = "it is a beautiful place";


        String [] str = s1.split(" ");
        for(int i = 0 ; i < str.length ; i++){

            str[i] =rev(str[i]);


        }

        System.out.println(Arrays.toString(str));

    }


    public static String rev(String s) {

        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {

            rev = rev + s.charAt(i);
        }
        return rev;
    }
}
