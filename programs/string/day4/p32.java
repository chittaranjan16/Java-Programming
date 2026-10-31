package string.day4;

//Q32: write a java program to find occurrence of a character in a string using replace method?

public class p32 {
    public static void main(String[] args) {

        String s = "helloWorld".toLowerCase();
        char target = 'l';

        int count = s.length() - s.replace(target + "", "").length();

//        System.out.println(s.replace(target + "", "").length());                   gives output 7 as "" double couts are replace so they are not counted.

        System.out.println("Occurrence = " + count);
    }

}
