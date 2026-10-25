package day5_2D_array;

//largest and smallest element in 2d array

public class p22 {
    public static void main(String[] args) {


        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        int largest = arr[0][0];
        int smallest = arr[0][0];


        for (int i = 0 ;i < arr.length ; i++)
        {
            for (int j = 0; j < arr[i].length ; j++)
            {
                if(largest<arr[i][j]){
                    largest=arr[i][j];
                }

                if(smallest > arr[i][j]){
                    smallest=arr[i][j];
                }
            }
        }


        System.out.println("largest element : " + largest);
        System.out.println("smallest element : " + smallest);

    }
}
