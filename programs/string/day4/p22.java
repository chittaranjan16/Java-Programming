package string.day4;

//Q22: write a java program to print words in a given string,
//input: “Java Is Very Easy”
//Output: Java
//Is
//Very
//Easy
public class p22 {
    public static void main(String[] args) {

        String s = "Java Is Very Easy";

        String[] arr = s.split(" ");

        for(int i = 0 ; i< arr.length ; i++ ){

            String st = arr[i];
            System.out.println(st);
        }

    }
}
