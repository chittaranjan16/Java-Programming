package string.String_psqs;

// Q40: Extract numbers and calculate their sum

public class p40 {
    public static void main(String[] args) {

        String s = "acb243d10";

        int sum = 0;
        int num = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else {
                sum = sum + num;
                num = 0;
            }
        }

        sum = sum + num; // Add the last number

        System.out.println(sum);
    }
}
