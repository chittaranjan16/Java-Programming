package string.String_psqs;

//Q42: Write a java program to remove space in given String without using inbuilt function?

public class p42 {
    public static void main(String[] args) {

        String s = "java is very easy";
        String result = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch != ' ') {
                result = result + ch;
            }
        }

        System.out.println(result);
    }
}