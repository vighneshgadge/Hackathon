package ArrayNumber;
import java.util.*;

public class ArrayDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the integer array
        System.out.println("Enter n:");
        int n = scanner.nextInt();

        // Read the integer array
        System.out.println("Enter numbers:");
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Read the string array
        System.out.println("Enter strings:");
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
        }

        // Display the integer array
        System.out.println("Displaying numbers");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Display the string array
        System.out.println("Displaying strings");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
