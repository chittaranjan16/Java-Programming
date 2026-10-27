package string.day2;


// to find reverse string
public class p5 {
    public static void main(String[] args) {
        String s = "developer";
        System.out.println(rev(s));

    }



//    reverse method
    public static String rev(String s){

        String rev = "";
        for(int i = s.length()-1 ; i>= 0 ; i--){

            rev = rev + s.charAt(i);
        }
        return rev;
    }
}
