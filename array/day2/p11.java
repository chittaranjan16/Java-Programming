package day2;

public class p11 {
    public static void main(String[] args) {
        int[] arr = {20, 13 , 40 , 106 , 52 , 99};

        int min1 = arr[0];
        int min2 = arr[0];

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < min1){

                min2 = min1;
                min1 = arr[i];
            }
            else if (arr[i] < min2 && arr[i] < min1) {
                min2 = arr[i];
            }
        }

        System.out.println(min2 + " = second maximum number in an array");
    }

}

