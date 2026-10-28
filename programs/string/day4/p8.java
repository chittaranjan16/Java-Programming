package string.day4;

//Q8: input: “AssmnAN” output: A=2, A=3, m=1, n=1, N=1?
//Q9: input:” Ramana” output:” R@m@n@”?
public class p8 {
    public static void main(String[] args) {

        String str = "AssmnAN";

        int upperCase = 0;
        int lowerCase = 0;
        int number = 0;



        for(int i = 0 ; i < str.length() ; i++ )
        {
            boolean alreadyCounted = false;

            int count = 1;
            for(int j = i+1; j < str.length()-1 ; j++ ){

                if(str.charAt(i) == str.charAt(j)){
                    alreadyCounted = true;
                    count++;
                }
            }

            System.out.println(str.charAt(i) + " : " + count + "  ");
        }

    }
}
