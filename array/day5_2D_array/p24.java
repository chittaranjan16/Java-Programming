package day5_2D_array;


//sum of columns elements
public class p24 {

    public static void main(String[] args) {

        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        for(int i = 0 ; i< arr.length ; i++)
        {
            int sum = 0;
            for(int j = 0; j < arr[i].length ; j++)
            {
                sum = sum+arr[j][i];

            }
            System.out.print(sum + ":  sum of column");
            System.out.println();
        }
    }
}

