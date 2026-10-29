package string.day4;


//P13 - Find the minimum-occurring character and its count (`ramana` → `r=1`)

public class p13 {
    public static void main(String[] args) {

        String s = "ramana";
        int minCount= s.length();
        char minChar = ' ';

        for(int i = 0 ; i < s.length() ; i++)
        {
            int count = 0;

            for(int j = 0; j < s.length() ; j++){
                if(s.charAt(i) == s.charAt(j))
                {
                    count++;
                }

            }
            if(count < minCount){
                minCount = count;
                minChar = s.charAt(i);
            }

        }
        System.out.println(minChar + " : " + minCount);

    }
}
