package string.day4;

//P14 - Replace characters based on their occurrences (`helloworld` → `he121w2r3d`)

public class p14 {
    public static void main(String[] args) {
        String s1 = "helloworld";
        char[] arr = s1.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char target = s1.charAt(i); // Check against the original string characters
            int count = 0;

            // Count total occurrences from index 0 up to i
            for (int j = 0; j <= i; j++) {
                if (s1.charAt(j) == target) {
                    count++;
                }
            }

            // If it has appeared more than once, replace it with its occurrence number
            if (count > 1) {
                arr[i] = (char) ('0' + (count - 1));
            }
        }

        System.out.println(new String(arr));
        // Output: he121w2r3d
    }
}