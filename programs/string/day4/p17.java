package string.day4;


//Q17: input: “java is very easy” output: avaj si yrev ysay”

import java.util.Arrays;

public class p17 {
    public static void main(String[] args) {

        String s = "java is very easy";
        String result="";

        String [] arr = s.split(" ");

        for(int i = 0 ; i < arr.length ; i++){

            arr[i] = p1.reVerse(arr[i]);
            // method from p1 , reverse method called using classname.method

            result = result+ arr[i] + " ";

        }

        //System.out.println(Arrays.toString(arr));

        System.out.println(result);

    }
}
