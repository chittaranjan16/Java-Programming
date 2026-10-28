package string.day4;

//Q10:  write a java program to count vowel characters in a string?
public class p10 {
    public static void main(String[] args) {

        String s = "programming";

        int count = 0;
        for(int i = 0 ; i< s.length() ; i++){

            char ch = s.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }

        System.out.println("NUMBER OF VOWELS IN STRING : "+ s + " ARE = " + count );
    }
}
