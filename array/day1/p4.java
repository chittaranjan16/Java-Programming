package day1;

import java.util.Scanner;

public class p4 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i = 0 ; i< arr.length ; i++)
        {
            arr[i]= sc.nextInt();

        }

//        calculation
        int sum = 0;

        for(int i = 0 ;i<arr.length;i++ ){
            sum+=arr[i];
//            sum = sum + arr[i];
        }

        System.out.println("SUM OF ARRAY = " + sum);

    }
}
