package string.day4;

//Q31: write a java program to print missing vowels in a string?

public class p31 {
    public static void main(String[] args) {

        String s = "developer";

        String vowels = "aeiou";

        for (int i = 0; i < vowels.length(); i++) {

            char ch = vowels.charAt(i);

            if (s.indexOf(ch) == -1) {
                System.out.print(ch + " ");
            }
        }
    }
}
