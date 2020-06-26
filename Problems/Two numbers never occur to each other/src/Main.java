import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arrLength = s.nextInt();
        int[] arr = new int[arrLength];

        boolean endVal = true;
        for (int i = 0; i < arrLength; i++) {
            arr[i] = s.nextInt();
        }

        int n = s.nextInt();
        int m = s.nextInt();

        for (int i = 0; i < arrLength; i++) {
            if (arr[i] == n) {
                if (i > 0 && arr[i - 1] == m) {
                    endVal = false;
                }
                if (i < arrLength - 1 && arr[i + 1] == m) {
                    endVal = false;
                }
//                for (int j = i; j < arrLength; j++) {
//                    if (arr[j] == m) {
//                        endVal = false;
//                    }
//                }
            }
        }
        System.out.println(endVal);
    }
}
