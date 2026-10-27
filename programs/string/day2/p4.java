package string.day2;


//palindrome
public class p4 {
    public static void main(String[] args) {

        String s = "level";
        System.out.println(isPlindrome(s));
    }



    public static boolean isPlindrome(String s1){

        int i = 0 ;
        int j = s1.length() - 1 ;

        while(i <= j){

            if(s1.charAt(i) != s1.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}


