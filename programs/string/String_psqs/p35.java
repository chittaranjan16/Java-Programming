package string.String_psqs;


////Q35: write all permutation of string “abc” output: “abc”,
////“acb”, “bac”, “bca”, “cba”, “cab”?
///
public class p35 {
    public static void main(String[] args) {

        String s1 = "abc";
        permutation(s1,0, s1.length()-1);
    }


    public static void permutation(String s , int start , int end){
        if(start == end){
            System.out.println(s);
            return;
        }

        for(int i = start ; i <= end ; i++){
            s= swap(s,start,i);
            permutation(s , start+1 , end);
        }
    }

    public static String swap(String s , int i , int j){
        char[] ch = s.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;

        return new String(ch);
    }
}
