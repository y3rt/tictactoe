import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int n2 = (int)Math.pow(n, 2);

        int[][] arr = new int[n2][n2];

        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < n2; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        String qwerty = "YES";
        boolean hasIt = false;
        boolean hasThat = false;
        boolean hasThis = false;
        int thisCount = 0;

        for (int i = 0; i < n2; i++) {
            thisCount = 0;
//            System.out.println(i+": ");
            for (int j = 0; j < n2; j++) {
//                System.out.print("\t"+j+": ");
//                System.out.println(" "+arr[j][i] + " | " + (i+1));
                if (arr[j][i] == (i+1)) {
//                    System.out.println("---");
                    thisCount++;
                }
//                System.out.println("===="+thisCount);
            }
            if (thisCount != 1){
                hasThis = true;
            }
        }
//        System.out.println(" "+hasThis);

        for (int i = 0; i < n; i++) {
//            System.out.println(i+": ");
            for (int j = 0; j < n; j++) {
                for (int k = 1; k <= n2; k++) {
//                    System.out.println("\t" + j + ": ");
//                    System.out.println("\t\t"+arr[i][j] + " | " + (i+1));
//                    System.out.println("\t\t" + arr[i][j]);
                    //check 1-(n*n)
                    if (arr[i][j] == k) {
                        hasThat = true;
                        break;
                    }
                }
            }
        }
//        System.out.println(" "+hasThat);


//        while(!hasIt) {
            for (int i = 0; i < n2; i++) {
//                System.out.println(i+": ");
                for (int j = 0; j < n2; j++) {
//                    System.out.println("\t"+j+": ");
//                    System.out.println("\t\t"+arr[i][j] + " | " + (i+1));
                    //check 1-(n*n)
                    if (arr[i][j] == i+1) {
                        hasIt = true;
                        break;
                    }
                }
            }
//            System.out.println(" "+hasIt);
//        }

        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < n2; j++) {
                for (int k = n2-1; k >= 0; k--) {
//                    System.out.println(i+":"+j+":"+k+" "+arr[i][j] +" == "+ arr[i][k] + " || "+arr[k][j] +" == "+ arr[k][i]);
                    if ((j != k && i != k && i != j) && (arr[i][j] == arr[i][k] || arr[k][j] == arr[k][i])) {
//                        System.out.println("!");
                        qwerty = "NO";
                        break;
                    }
                }
            }
        }
//        System.out.println("==============");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
//                System.out.println(i+":"+j+":"+arr[i][j] +" == "+ arr[j][i]);
                if ((i != j) && (arr[i][j] == arr[j][i])) {
//                    System.out.println("!");
                    qwerty = "NO";
                    break;
                }
            }
        }

        if (!hasIt || !hasThat || hasThis) {
            qwerty = "NO";
        }
        System.out.println(qwerty);
    }
}
