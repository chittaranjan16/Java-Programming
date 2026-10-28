package string.day4;

// Q6: wap to print sum of number present in a string?
// Input:” ash123” output: 6

import java.util.Arrays;

public class p6 {
    public static void main(String[] args) {
        String s1 = "ash123";
        System.out.println(sumOfNumInStr(s1));

    }




    public static int sumOfNumInStr(String s){
        int sum = 0;

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= '1' && arr[i] <= '9')
            {
                sum = sum + (arr[i]-'0');                     //'1' - '0' = 1
            }
        }
        return sum;
    }


}
