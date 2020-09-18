import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int num2;
        double dbl2;
        String str2;

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        num2 = scan.nextInt();
        dbl2 = scan.nextDouble();
        str2 = scan.next() + scan.nextLine(); // needed .next() b/c of space

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + num2);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + dbl2);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + str2);

        scan.close();
    }
}
