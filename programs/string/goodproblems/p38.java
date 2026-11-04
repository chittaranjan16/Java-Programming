package string.goodproblems;

import string.String_psqs.p4;

public class p38 {
    public static void main(String[] args) {

        String test = "malayalam";
        System.out.println(smallestPalSubStr(test));
    }

    public static String smallestPalSubStr(String s) {

        String min = "";

        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j <= s.length(); j++) {

                String substr = s.substring(i, j);

                if (substr.length() > 1 && p4.isPalindromeStr(substr)) {

                    if (min.isEmpty() || substr.length() <= min.length()) {
                        min = substr;
                    }
                }
            }
        }

        return min.isEmpty() ? "No palindrome found" : min;
    }
}