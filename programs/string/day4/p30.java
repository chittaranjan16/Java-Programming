package string.day4;

//  Q30: Write a java program to check two strings are Anagram or not?

//Two strings are called Anagrams if they contain the same characters with the same frequency, but their order can be different.
//Example:
//- String 1: "listen"
//- String 2: "silent"
//- Output: Anagram

import java.util.Arrays;

public class p30 {
    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
