package string.day4;


//Q2: write a java program to arrange a character in a string?
//Input:” ram#123”  output:”123#ram”

public class p2 {
    public static void main(String[] args) {

        String s = "ram#123";
        String num = "", letters = "", special = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Character.isDigits()  checks and return true & false based on digits

            if (Character.isDigit(ch))
                num += ch;
            else if (Character.isLetter(ch))
                letters += ch;
            else
                special += ch;
        }

        System.out.println(num + special + letters);

    }
}
