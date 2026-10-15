package day2;

public class p12 {
    public static void main(String[] args) {

        int[] arr = {1, 2 , 1, 3 , 2 ,1 };

        for(int i = 0 ; i< arr.length ; i++){

//            check if the elemeny is precounted or not, if counted skips
            if(arr[i] == '\u0000'){
                continue;
            }

            int count = 1;

            for(int j = i+1 ; j< arr.length ; j++){
                if (arr[j] == arr[i]){

                    count++;
                    arr[j] = '\u0000';
                }
            }

            System.out.println(arr[i] + " : " + count);
        }
    }
}
