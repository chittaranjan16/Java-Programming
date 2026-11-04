package string.String_psqs;

//Q23: input: “ccaabbd” output: “aabbccd” (sort given string)?

import java.util.Arrays;

public class p23 {
    public static void main(String[] args) {
        String test = "ccaabbd";
        System.out.println(sortStr(test));

    }

    public static String sortStr(String s){

        char [] ch = s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}
