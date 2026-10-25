package day6;

public class p27 {
    public static void main(String[] args) {

        int n = 5;
        int[][] arr = new int[n][];

        pascal(arr);

        for (int i = 0; i < arr.length; i++) {

            for (int s = 0; s < arr.length - i - 1; s++) {
                System.out.print("  ");
            }
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
    }


//
    public static void pascal(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            arr[i] = new int[i + 1];

            for (int j = 0; j < arr[i].length; j++)
            {
                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                }
                else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }
    }
}

