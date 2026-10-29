package string.day4;

import java.util.Arrays;

//Q16: write a java program for initcap of string  input:
//        india that is bharat
//output: India That Is Bharat
public class p16 {
    public static void main(String[] args) {

        String s = "india that is bharat";
        String result = "";

        String [] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++)
        {
            result += Character.toUpperCase(arr[i].charAt(0))
                    + arr[i].substring(1) + " ";
        }

        System.out.println(result);

    }
}
