
package string.day4;

import java.util.Arrays;

//Q5: Convert a String into a Character Array without a Built-in Function
//Input: "Ram"   Output: ['R', 'a', 'm']

public class p5 {
    public static void main(String[] args) {

        String str = "Ram";
        char[] arr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        System.out.println(Arrays.toString(arr));
    }
}
