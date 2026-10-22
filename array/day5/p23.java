package day5;


//sum of row elements
public class p23 {

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
                sum = sum+arr[i][j];

            }
            System.out.print("row no "+i +", sum : "+ sum);
            System.out.println();
        }
    }
}

