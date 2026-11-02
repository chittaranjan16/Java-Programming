package string.String_psqs;

import java.util.Arrays;

public class p33 {
    public static void main(String[] args) {

        String str = "hello world java programming";

        String[] arr = new String[str.length()];

        int index = 0;
        int start = 0;

        for (int i = 0; i <= str.length(); i++) {

            if (i == str.length() || str.charAt(i) == ' ')
            {
                arr[index++] = str.substring(start, i);

                start = i + 1;
            }
        }
        arr = Arrays.copyOf(arr, index);
        System.out.println(Arrays.toString(arr));
    }
}

