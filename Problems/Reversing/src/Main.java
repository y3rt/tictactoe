import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String aString = a+"";
        int alpha = 0;
        switch (aString.length()){
            case 3:
                alpha = ((a % 10) - (a % 1));
                if (alpha > 0) {
                    System.out.print(alpha);
                }
                System.out.print(((a % 100) - (a % 10)) / 10);
                System.out.print((a - (a % 100)) / 100);
                break;
            case 2:
                alpha = ((a % 10) - (a % 1));
                if (alpha > 0) {
                    System.out.print(alpha);
                }
                System.out.print(((a % 100) - (a % 10)) / 10);
        }

    }
}
