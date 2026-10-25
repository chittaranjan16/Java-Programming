package day4;

import java.util.Arrays;

public class p19 {
    public static void main(String[] args) {

            int[] arr = {9, 4, 1, 3, 8, 2};

            quickSort(arr, 0, arr.length - 1);
            System.out.println(Arrays.toString(arr));
        }

        public static void quickSort(int[] arr, int start, int end) {
            if (start < end) {

                int pivot = arr[(start + end) / 2];

                int i = start;
                int j = end;


                while (arr[i] < pivot) {
                        i++;
                    }
                while (arr[j] > pivot) {
                        j--;
                    }

                if (i <= j)
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    i++;
                    j--;
                }


                if (start < j) {
                    quickSort(arr, start, j);
                }

                if (i < end) {
                    quickSort(arr, i, end);
                }
            }
        }
    }
