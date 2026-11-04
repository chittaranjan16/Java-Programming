package string.goodproblems;

//Q46: Write a java program to check two strings are Anagram or not without replace method?

import java.util.Arrays;

public class p46 {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        isAnagramStr(s1,s2);
    }

    public static void  isAnagramStr(String s1 , String s2){

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        char[] a = s1.toLowerCase().toCharArray();
        char[] b = s2.toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
