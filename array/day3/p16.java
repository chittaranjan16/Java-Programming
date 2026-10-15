package day3;

import java.util.Arrays;

public class p16 {
    public static void main(String[] args) {


        int[] arr = {13, 1, 5, 25, 7};

        for (int i = 0; i < arr.length; i++)
        {

            int min = i;

            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[min] > arr[j])
                {
                    min = j;
                }
            }

            if (i != min)
            {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;                          // Fixed: assigned temp to arr[min]
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}