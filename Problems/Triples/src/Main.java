import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        int[] myArray = new int[length];

        for (int i = 0; i < length; i++) {
            myArray[i] = s.nextInt();
        }
        int count = 0;
        for (int i = 0; i < myArray.length - 1; i++) {
            if (i > 0 && i < myArray.length - 1 &&
                    myArray[i] - 1 == myArray[i - 1] &&
                    myArray[i] + 1 == myArray[i + 1]
            ) {
                count++;
            }
        }
        System.out.println(count);
    }
}
