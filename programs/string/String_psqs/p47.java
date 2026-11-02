package string.String_psqs;

//Q48: write a java program to find missing alphabet in a string by using indexOf method?

public class p47 {
    public static void main(String[] args) {

        String s = "abcdxyz";

        s=s.toLowerCase();


        for(char ch = 'a' ; ch <= 'z' ; ch++){
            if(s.indexOf(ch) == -1 ){
                System.out.print(ch + " ");
            }
        }
    }
}
