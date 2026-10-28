package string.day4;

import java.util.Arrays;

// write a java program to reverse a string?

public class p1 {
    public static void main(String[] args) {
        String s1 = "java";
        String reverse = reVerse(s1);
        System.out.println(reverse);

    }


    public static String reVerse(String s){

        String rev = "";
        for(int i = 0 ; i < s.length() ; i++){

            rev = rev + s.charAt(s.length()-i-1);
        }
        return rev;
    }
}
