package string.String_psqs;

//Q44: Write a java program to find the occurrence of character from given String with replace method?


public class p44 {
    public static void main(String[] args) {

        String s = "helloworld".toLowerCase();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '\u0000')
                continue;

            int count = 0;
            char ch = s.charAt(i);

            for (int j = 0; j < s.length(); j++) {
                if (ch == s.charAt(j)) {
                    count++;
                }
            }

            System.out.println(ch + " : " + count);

            s = s.replace(ch, '\u0000');
        }
    }
}