import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        int[] incomeArr = new int[length];
        int[] taxArr = new int[length];

        for (int i = 0; i < length; i++) {
            incomeArr[i] = s.nextInt();
        }
        for (int i = 0; i < length; i++) {
            taxArr[i] = s.nextInt();
        }
        int company = 0;
        int most = 0;

        for (int i = 0; i < length; i++) {
            if (incomeArr[i] * taxArr[i] > most) {
                most = incomeArr[i] * taxArr[i];
                company = i;
            }
        }
        System.out.println(company + 1);
    }
}
