import java.util.Scanner;

public class Operators {
    // Complete the solve function below.
    static int solve(double meal_cost, int tip_percent, int tax_percent) {
        int tip = tip_percent / 100;
        int tax = tax_percent / 100;
        long totalCost = Math.round(meal_cost + tip + tax);
        return (int) totalCost;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
