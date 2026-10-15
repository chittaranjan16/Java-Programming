package day2;

public class p10 {
    public static void main(String[] args) {

        int[] arr = {20, 13 , 40 , 106 , 52 , 99};

        int max1 = 0;
        int max2 = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max1){

                max2 = max1;
                max1 = arr[i];
            }
            else if (arr[i] > max2 && arr[i] < max1) {
                max2 = arr[i];
            }
        }

        System.out.println(max2 + " = second maximum number in an array");
    }
}
