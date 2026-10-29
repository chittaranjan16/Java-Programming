package string.day4;

//Q20: input: Ramana
//Output: R
//        Ra
//        Ram
//        Rama
//        Raman
//        Ramana
public class p20 {
    public static void main(String[] args) {

        String s = "PROGRAM";

        int i =0;
        for(int j = 0; j < s.length()+1 ; j++)
        {
            System.out.println(s.substring(i, j));
        }
    }
}
