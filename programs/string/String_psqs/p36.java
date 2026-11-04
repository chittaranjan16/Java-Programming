package string.String_psqs;

//Q36: write a java program to find palindrome substring in a program?

//Input: “Malayalam”
//Output: ala, aya, layal, Malayalam

public class p36 {
    public static void main(String[] args) {
        String test = "malayalam";
        isPalSubStr(test);

    }

    public static void isPalSubStr(String s ){

        s =s.toLowerCase();

        for(int i = 0 ; i < s.length() ; i++){

            String str= "";

            for(int j = i+2; j < s.length()+1 ; j++){
                str = s.substring(i,j);

                if(p4.isPalindromeStr(str)) {
                    System.out.println(str);
                }
            }
        }
    }
}
