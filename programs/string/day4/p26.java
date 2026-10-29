package string.day4;


//Q26: write a java program to find missing alphabet in a string
//  Input: “abc”  output:”d e f g h I j k l……….”
public class p26 {
    public static void main(String[] args) {

        String s = "bcdv".toLowerCase();

        for (char ch = 'a'; ch <= 'z'; ch++)
        {
            if (s.indexOf(ch) == -1) {
                System.out.print(ch + " ");
            }
        }

    }
}
