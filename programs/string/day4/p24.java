package string.day4;


//Q24: write a java program to print substring of a string
//Input: ”Malayalam”
public class p24 {
    public static void main(String[] args) {

        String s1 = "Malayalam";

        for(int i = 0 ; i <= s1.length() ; i++){
            for(int j = i+2; j <= s1.length() ; j++){

                System.out.println(s1.substring(i ,j));
            }
        }
    }

}
