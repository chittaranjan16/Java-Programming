package day6;

public class p28 {

    public static void main(String[] args) {
            int[][] arr = new int[5][5];
            char dir = 'r';
            int row = 0;
            int col = -1;
            int n = 25;

            for (int i = 1; i <= n; i++) {
                switch (dir) {
                    case 'r': {
                        col++;
                        arr[row][col] = i;
                        if (col == arr.length - 1 || arr[row][col+1]!=0)
                            dir = 'd';

                    }
                    break;
                    case 'd': {
                        row++;
                        arr[row][col] = i;
                        if (row == arr.length - 1 ||arr[row+1][col]!=0 )
                            dir = 'l';

                    }
                    break;
                    case 'l': {
                        col--;
                        arr[row][col] = i;
                        if (col == 0 || arr[row][col-1]!=0)
                            dir = 'u';

                    }
                    break;
                    case 'u': {
                        row--;
                        arr[row][col] = i;
                        if (row == 1 ||arr[row-1][col]!=0 )
                            dir = 'r';

                    }
                    break;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }

        }

    }
