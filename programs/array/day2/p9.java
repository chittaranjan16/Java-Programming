package day2;

public class p9 {
    public static void main(String[] args) {

        int[] arr = {100 , 20 , 40 , 22 , 11, 55};

        int min = arr[0];

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]< min) {
                min = arr[i];
            }
        }
        System.out.println("smallest element in the array = "+min);
    }
}
