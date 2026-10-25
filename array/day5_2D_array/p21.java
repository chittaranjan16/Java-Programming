package day5_2D_array;

//sum of all elemnets of 2d array

public class p21 {
    public static void main(String[] args) {

        int[][] arr =new int[2][3];
        arr[0][0]=10;
        arr[0][1]=2;
        arr[0][2]=4;
        arr[1][0]=6;
        arr[1][1]=1;
        arr[1][2]=20;

        int sum = 0;

        for(int i = 0 ; i< arr.length ;  i++)
        {
            for(int j = 0 ; j<arr[i].length ; j++){
                sum= sum+ arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println( );
        }

        System.out.println("sum of elements : "+sum);
    }
}
