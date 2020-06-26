import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        int maxNumber = Integer.MIN_VALUE;
        int iLoc = 0;
        int jLoc = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > maxNumber) {
                    maxNumber = arr[i][j];
                    iLoc = i;
                    jLoc = j;
                }
            }
        }
//        System.out.println(maxNumber);
        System.out.println(iLoc + " " + jLoc);
    }
}
