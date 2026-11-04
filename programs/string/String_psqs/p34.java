package string.String_psqs;

//Q34: create one string array, size=5, add 5 elements and print it in reverse order?

import java.util.Arrays;
import java.util.Scanner;


public class p34 {
    public static void main(String[] args) {

        String[] arr = new String[5];

        for(int i = arr.length-1 ; i>=0; i--){

            Scanner sc = new Scanner(System.in);

            System.out.println("ENTER STRING ELEMENTS");
            arr[i]= sc.next();
        }
        System.out.println(Arrays.toString(arr));



    }


}
