package string.day4;

//  Q19: write a java program to change upper case to lower case?
public class p19 {
    public static void main(String[] args) {

        String s1 = "MASHMELLO";
        System.out.println(toLOWERcase(s1));
    }


    public static String toLOWERcase(String s){

        String result = "";

        for(int i = 0 ; i< s.length() ; i++){

            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result += ch;
        }
        return result;
    }
}
