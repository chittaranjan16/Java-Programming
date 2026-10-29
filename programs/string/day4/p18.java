package string.day4;


//Q18: write a java program to print palindrome words in a string?
public class p18 {
    public static void main(String[] args) {

        String s1 = "level up your coding skills with radar and kayak";
        palindromeWords(s1);
    }

    public static void palindromeWords(String s){

        String[] arr = s.split(" ");

        for(int i = 0; i< arr.length ; i++ ){
            if(isPalindromeStr(arr[i])){
                System.out.println(arr[i]);
            }
        }
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
