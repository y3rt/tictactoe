import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[][] arr = new char[4][4];
        for (int i = 0; i < 4; i++) {
            String str = s.nextLine();
            for (int j = 0; j < 4; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        String pretty = "YES";

        for (int i = 1; i < 2; i++) {
            for (int j = 1; j < 2; j++) {
                String s1 = arr[i - 1][j - 1] + "" + arr[i - 1][j];
                String s15 = arr[i - 1][j] + "" + arr[i - 1][j + 1];

                String s2 = arr[i - 1][j + 1] + "" + arr[i - 1][j + 2];
                String s3 = arr[i][j - 1] + "" + arr[i][j];

                String s35 = arr[i][j] + "" + arr[i][j + 1];

                String s4 = arr[i][j + 1] + "" + arr[i][j + 2];
                String s5 = arr[i + 1][j - 1] + "" + arr[i + 1][j];

                String s55 = arr[i + 1][j] + "" + arr[i + 1][j + 1];

                String s6 = arr[i + 1][j + 1] + "" + arr[i + 1][j + 2];
                String s7 = arr[i + 2][j - 1] + "" + arr[i + 2][j];

                String s75 = arr[i + 2][j] + "" + arr[i + 2][j + 1];

                String s8 = arr[i + 2][j + 1] + "" + arr[i + 2][j + 2];


//                if (s1.equals("GG") && s4.equals("GY")) {
//                System.out.println(s1);
//                System.out.println(s2);
//                System.out.println(s3);
//                System.out.println(s4);
//                System.out.println(s5);
//                System.out.println(s6);
//                System.out.println(s7);
//                System.out.println(s8);
//                }
                if (s1.equals(s3) || s2.equals(s4) ||
                        s3.equals(s5) || s4.equals(s6) ||
                        s5.equals(s7) || s6.equals(s8) ||
                        s15.equals(s35) || s35.equals(s55) || s55.equals(s75)
                ) {
                    pretty = "NO";
                }
            }
        }
        System.out.println(pretty);
    }
}
//tests:
//    WWWW
//    BBBB
//    WWWW
//    YYYY
//-----------
//    YES
//===========
//    BBBB
//    BWWB
//    BWWB
//    BBBB
//----------
//    NO
//==========
//    BYBY
//    YBYB
//    BYBY
//    YBYB
//-----------
//    NO
//===========
//    BYBY
//    YGGB
//    BGGY
//    YBYB
//----------
//    NO
//==========
//    GGBY
//    YBGG
//    GGBY
//    YBGG
//----------
//    YES
//=========
//    GGBG
//    GBGG
//    GGGY
//    GBGG
//---------
//    NO
//=========

