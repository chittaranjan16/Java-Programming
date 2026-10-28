package string.day4;


////Q4: write a java program to find given string is palindrome
public class p4 {
    public static void main(String[] args) {

        String s1 = "level";
        System.out.println(isPalindromeStr(s1));
    }


    public static boolean isPalindromeStr(String s){

        int i = 0;
        int j = s.length()-1;

        while (i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

