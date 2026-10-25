import java.util.Arrays;

public class practice {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 3, 5, 1, 2, 3};
        quicksort(arr , 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
//        count occurence


//        for(int i = 0 ; i< arr.length; i++){
//
//            if(arr[i]== '\u0000'){
//                continue;
//            }
//
//            int count=1;
//
//            for(int j = i+1 ; j< arr.length ; j++){
//                if(arr[j]== arr[i]){
//                    count++;
//                    arr[j] = '\u0000';
//                }
//            }
//
//            System.out.println(arr[i] + ":  "+ count);
//        }


//        remove duplicatess

//        for(int i = 0 ; i<arr.length ; i++){
//
//            if(arr[i] == '\u0000'){
//                continue;
//            }
//
//            for(int j = i+1 ; j< arr.length ; j++){
//                if(arr[j]== arr[i]){
//                    arr[j] = '\u0000';
//                }
//            }
//            System.out.println(arr[i]);
//        }



//        second largest
//        int max1 = 0 ;
//        int max2 = 0;
//
//        for(int i = 0 ; i<arr.length ;i++ ) {
//
//            if (arr[i] > max1) {
//                max2 = max1;
//                max1 = arr[i];
//            }
//
//            else if (arr[i] > max2 && arr[i] < max1) {
//                max2 = arr[i];
//            }
//        }
//
//        System.out.println(max1 + " " + max2);




////        bubble
//        for(int i = 0 ; i < arr.length ; i++){
//
//            for(int j = 0 ; j < arr.length - 1 ; j++){
//                if(arr[j] > arr[j+1]) {
////                 swap
//                    int temp = arr[j];
//                    arr[j]= arr[j+1];
//                    arr[j+1]= temp;
//
//                }
//            }
//        }
//
//        System.out.print(Arrays.toString(arr));


//
////        selection
//        for(int i = 0 ; i < arr.length ; i++){
//
//            int min = i;
//
//            for(int j = i+1 ; j < arr.length ; j++){
//                if(arr[j] < arr[min])
//                {
//                    min = j;
//                }
//            }
//
//            if (i != min) {
//                int temp = arr[i];
//                arr[i] = arr[min];
//                arr[min] = temp;                          // Fixed  temp to arr[min]
//            }
//
//            System.out.println(Arrays.toString(arr));
//        }

//
//        quick sorting
    public static void quicksort(int[] arr , int start , int end ) {

        if (start < end) {
            int pivot = arr[(start + end) / 2];

            int i = start;
            int j = end;


            while (arr[i] < pivot)
                i++;

            while (arr[j] > pivot)
                j--;

            if (i <= j) {
//            when pointers comes at a same place then swap

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }


            quicksort(arr, start, j);
            quicksort(arr, i, end);
        }
    }



}