package string.String_psqs;

//Q43: Write a java program to count number of characters available in each word of a given String?
//Input:- “java is easy” Output:- java=4 is=2 easy=4

public class p43 {
    public static void main(String[] args) {

        String s = "java is easy";

        String[] arr = s.split(" ");
        for(int i = 0 ; i < arr.length ; i++ ){

            System.out.println(arr[i] + " : \t" + arr[i].length());
        }
    }
}
