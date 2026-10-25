package day3_sorting;

import java.util.Arrays;
//insertion sort

public class p17 {
    public static void main(String[] args) {

        int[] arr = {6 , 4 , 7 , 1 , 9};

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];

            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
            System.out.println(Arrays.toString(arr));
        }

//        System.out.println(Arrays.toString(arr));
    }
}