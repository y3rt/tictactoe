import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int maxLoc = 0;
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxNumber) {
                maxLoc = i;
                maxNumber = arr[i];
            }
        }
        System.out.println(maxLoc);
    }
}
