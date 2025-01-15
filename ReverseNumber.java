import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int reversed = 0;
        
        // Reverse the number
        while (number != 0) {
            int digit = number % 10;  // Get the last digit of the number
            reversed = reversed * 10 + digit;  // Append the digit to the reversed number
            number /= 10;  // Remove the last digit from the original number
        }
        
        System.out.println("Reversed number: " + reversed);
    }
}
