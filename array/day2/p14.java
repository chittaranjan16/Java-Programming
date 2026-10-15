package day2;

import java.util.Arrays;

public class p14 {
    public static void main(String[] args) {

        int[] arr = {1 , 29 ,7 , 100 , 99 };

        for(int i = 0 ; i < arr.length ; i++){

            while(arr[i] > 9){

                int num = arr[i];
                int sum = 0;

                while(num > 0){

                    int rem = num % 10;
                    sum = sum + rem;
                    num = num / 10;

                }

                arr[i]= sum;
            }


            System.out.println(Arrays.toString(arr));
//            Arrays.toString(arr) these is used to print array simply and its present in java.util

        }

    }
}
