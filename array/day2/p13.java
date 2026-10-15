package day2;

public class p13 {
    public static void main(String[] args) {

        int[] arr = {1, 2 , 1, 3 , 2 ,1 ,4};

        for(int i = 0 ; i<arr.length ; i++ ){

            if(arr[i] == '\u0000'){
                continue;
            }

            for(int j = i+1 ; j< arr.length ; j++){
                if(arr[j] == arr[i]){
                    arr[j] = '\u0000';
                }
            }

            System.out.println(arr[i]);

        }
    }
}
