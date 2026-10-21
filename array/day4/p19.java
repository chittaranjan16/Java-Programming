package day4;

import java.util.Arrays;

public class p19 {
    public static void main(String[] args)
    {
        int[] arr = {9 , 4 , 1 , 3};
        sort(arr , 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


    //    sorting / dividing array using pivot
    public static void sort(int[] arr , int low , int high){
        if(low < high){

            int pivot = partition(arr , low , high);

            sort(arr , low , pivot-1);
            sort(arr , pivot+1 , high);
        }
    }


    //    placing pivot at its correct position
    public static int partition(int[] arr , int low , int high)
    {
        int pivot = arr[high];
        int i = low-1;

        for(int j = low ; j < high ; j++)
        {
            if(arr[j] < pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

}
