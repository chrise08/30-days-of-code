import java.util.Scanner;

public class ReviewOne {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        String str;

        for (int i = 0; i < testCases; i++) {
            str = scan.next();

            for (int j = 0; j < str.length(); j++) {

                if (j % 2 == 0) {
                    System.out.print(str.charAt(j));
                }
            }

            System.out.print(" ");

            for(int j = 0; j < str.length(); j++){
                if (j % 2 == 1) {
                    System.out.print(str.charAt(j));
                }

            }
            System.out.println();
        }
    }
}
