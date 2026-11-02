package string.goodproblems;

public class p50 {
    public static void main(String[] args) {

        String s = "abeijho".toLowerCase();

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (count > 3 && "aeiou".indexOf(ch) != -1) {
                result.append('_');
            } else {
                result.append(ch);
            }
        }

        System.out.println(result);
    }
}