package day2;

import java.util.Arrays;

public class p7 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int[] brr = {5, 6, 7};

        int[] crr = new int[arr.length + brr.length];

        for (int i = 0; i < arr.length; i++) {
            crr[i] = arr[i];
        }

        for (int j = 0; j < brr.length; j++) {
            crr[arr.length + j] = brr[j];
        }

        // Arrays.toString() ka use kiya hai array print karne ke liye
        System.out.println(Arrays.toString(crr));
    }
}