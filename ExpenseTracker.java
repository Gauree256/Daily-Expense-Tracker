import java.util.Arrays;
import java.util.Scanner;

public class ExpenseTracker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] expenses = new double[7];

        System.out.println("====== Expense Tracker ======\n");

        // Input expenses for each day
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter expense for Day " + (i + 1) + ": ");
            expenses[i] = sc.nextDouble();
        }

        // Display expenses
        System.out.println("\nExpenses entered:");
        for (int i = 0; i < 7; i++) {
            System.out.println("Day " + (i + 1) + ": " + expenses[i]);
        }

        // Calculate total
        double total = 0;
        for (int i = 0; i < 7; i++) {
            total += expenses[i];
        }

        // Sort
        Arrays.sort(expenses);

        // After sorting
        double lowest = expenses[0];
        double highest = expenses[6];

        System.out.println("\n===== Results =====");
        System.out.println("Total Weekly Expense: " + total);
        System.out.println("Lowest Expense: " + lowest);
        System.out.println("Highest Expense: " + highest);

        System.out.println("\nExpenses in sorted order (low to high):");
        for (int i = 0; i < 7; i++) {
            System.out.print(expenses[i] + "  ");
        }

        sc.close();
    }
}
