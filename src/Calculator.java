import java.util.Scanner;

public class Calculator {

    static Scanner sc = new Scanner(System.in);
    static int lastResult = 0;

    public static void main(String[] args) {

        System.out.println("=== Simple Calculator ===");
        System.out.println("1. Add");
        System.out.println("2. Show Result");
        System.out.print("Choose option: ");

        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Addition feature coming soon...");
        } 
        else if (choice == 2) {
            System.out.println("Show feature coming soon...");
        }
        else {
            System.out.println("Invalid choice");
        }
    }
}
