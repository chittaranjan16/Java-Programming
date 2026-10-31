package string.day4;

// Q28: String = I love python Input: - “java” REPLACE WITH  “python”
// Output: - I love java?

public class p28 {
    public static String rePlace(String s ,String target , String replace){

        String[] arr = s.split(" ");

        String result = "";

        for (int i = 0 ; i < arr.length ; i++){
            if (target.equals(arr[i])){
                arr[i] = replace;
            }

            result += arr[i] + " ";

        }
        return result;
    }



    public static void main(String[] args) {
        String s1 = "I love python";
        String r = rePlace(s1, "python" , "java?");
        System.out.println(r);
    }
}
