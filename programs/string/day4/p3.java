package string.day4;

//Q3: write a java program to count words in a string?

public class p3 {
    public static void main(String[] args) {
        String str = "write a java program to count words in a string?";

        System.out.println("TOTAL NO. OF WORDS IN STRING :" + str);
        System.out.println(countWords(str));
    }


    public static int countWords(String s ){

        int countw = 0;

        String[] arr = s.split(" ");

        for(int i = 0 ; i < arr.length ; i++){
            countw++;
        }
        return countw;

    }
}
