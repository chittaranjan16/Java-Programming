class Demo {

    public static void printMissing(int[] arr) {

        int start = arr[0];
        int end = arr[arr.length - 1];

        for (int i = start; i <= end; i++) {

            boolean found = false;

            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j]) {
                    found = true;
//                    break;
                    continue;
                }
            }

            if (!found) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 9};
        printMissing(arr);
    }
}