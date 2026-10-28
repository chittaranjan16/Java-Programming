package string.day4;


//Q9: input:” Ramana” output:” R@m@n@”?
public class p9 {
    public static void main(String[] args) {

        String s1 = "Ramana";
        System.out.println(rePlace(s1,'a','@'));
    }



    public static String rePlace(String s , char target , char replaceValue ){

        char[] arr = s.toCharArray();

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target){
                arr[i] = replaceValue;
            }
            s = new String(arr);
        }
        return s;
    }
}
