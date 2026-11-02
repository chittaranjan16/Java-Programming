package string.String_psqs;

//Q39: write a java program to swap two string variables without using third variable?

public class p39 {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Python";

        s1 = s1 + s2;

        // remove first  part from combined to get s1 in s2
        s2 = s1.substring(0, s1.length() - s2.length());

        s1 = s1.substring(s2.length());

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }
}