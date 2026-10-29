package string.day4;

//Q21: input: “easy very is java” output: “java is very easy”

import javax.swing.plaf.PanelUI;
import java.util.Arrays;

public class p21 {
    public static void main(String[] args) {

        String s1 = "easy very is java";
        String result = "";

        String[] arr = s1.split(" ");

        for(int i = arr.length-1 ; i >= 0 ; i--){
            result += arr[i] + " ";
        }
        System.out.println(result);

    }

}
