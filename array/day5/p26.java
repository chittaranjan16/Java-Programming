package day5;


// matrix multiplication {3*3}
// row and column
//(1*1 + 1*4 + 1*7) for o/o index

public class p26 {
    public static void main(String[] args) {

        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] brr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };


        for(int i = 0 ; i< arr.length ; i++)
        {
            for(int j = 0; j < arr.length ; j++)
            {
                int sum = 0;
                for(int k = 0; k < arr.length ; k++)
                {
                    sum = arr[i][j]*brr[k][j];
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
