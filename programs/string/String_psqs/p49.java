package string.String_psqs;

//Q49:write a java program to remove edge space using trim()?

//Input:”__java _is _easy__? Output: “java is easy”?
public class p49 {
    public static void main(String[] args) {

        String s = "  java is    easy  ";

        s = s.trim().replaceAll("\\s+", " ");            // ("\\s+", " ") → Replaces multiple consecutive whitespace characters with one space.

        System.out.println(s);
    }
}
