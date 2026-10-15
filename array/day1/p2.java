package day1;

import java.util.Scanner;

public class p2 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter values");

        int[] arr = new int[5];

        for(int i = 0 ; i < arr.length ; i++){
            arr[i]= sc.nextInt();
        }

        for(int n : arr){
            System.out.println(n);
        }
    }
}
