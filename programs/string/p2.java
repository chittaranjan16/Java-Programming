package string;

import java.util.Arrays;

class p2{
    public static void main(String[] args) {
        
        String s = "developer";

        char[] arr = s.toCharArray();

        System.out.println(Arrays.toString(arr));

        for(int i = 0 ; i < arr.length ; i++){

            arr[i] = (char) (arr[i] - 32);

        }
        System.out.println(arr);
    }
}