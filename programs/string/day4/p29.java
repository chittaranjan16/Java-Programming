package string.day4;
//Pangram is a sentence that contains all 26 English alphabets at least once.

//P29: Check whether a string is Pangram or not

public class p29 {
    public static void main(String[] args) {

        String s = "The quick brown fox jumps over the lazy dog";
        s = s.toLowerCase();

        boolean flag = true;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (s.indexOf(ch) == -1) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not Pangram");
        }
    }
}
