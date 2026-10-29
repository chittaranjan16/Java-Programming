package string.day4;

//  Q15: input: RaMana output: rAmANA?
public class p15 {
    public static void main(String[] args) {

        String s = "RaMana";
        String result = "";

        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);

            if (Character.isLowerCase(ch))
            {
                ch = Character.toUpperCase(ch);
            } else if (Character.isUpperCase(ch))
            {
                ch = Character.toLowerCase(ch);
            }

            result += ch;
        }
        System.out.println(result);
    }
}
