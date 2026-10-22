package day5;

//2d array
// basis printing values and adding values

public class p20 {
    public static void main(String[] args) {

        int[][] arr ={
                    {10, 20, 30},
                    {40, 50, 60},
                    {70, 80, 90}
        };

        for(int i = 0 ; i< arr.length ; i++)                   //to access rows
        {
            for (int j = 0 ; j< arr[i].length ; j++){         //to access element/column in row

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
