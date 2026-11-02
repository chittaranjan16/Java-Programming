package string.String_psqs;

import javax.print.DocFlavor;

//Q48: input: class key=$ output: cla$$?
public class p48 {
    public static void main(String[] args) {
        String s1 = "clAssmate";
        String result = replaceChar(s1, 's' , '$');
        System.out.println(result);

    }


    public static String replaceChar(String s , char value , char replacement){

        s= s.toLowerCase();
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == value){

                s=s.replace(s.charAt(i) , replacement);
            }
        }
        return s;
    }
}
