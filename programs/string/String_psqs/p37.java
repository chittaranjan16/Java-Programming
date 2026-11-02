package string.String_psqs;

// Q37: Remove duplicate words

public class p37 {
    public static void main(String[] args) {

        String s = "happy happy birthday";

        String[] arr = s.split(" ");
        String result = "";

        for (int i = 0; i < arr.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i].equals(arr[j])) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                result = result + arr[i] + " ";
            }
        }

        System.out.println(result.trim());
    }
}