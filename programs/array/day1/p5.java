package day1;

import java.util.Scanner;

public class p5 {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i = 0 ; i< arr.length ; i++){
            arr[i]= sc.nextInt();
        }


//        calculation
        int EvenIndexSum = 0;

        for(int i = 0 ; i<arr.length ; i++){
            if (i % 2 == 0){
                EvenIndexSum = EvenIndexSum + arr[i];
            }
        }

        System.out.println("even index the values sum = " + EvenIndexSum);
    }
}
