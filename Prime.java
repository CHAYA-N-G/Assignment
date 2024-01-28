import java.util.Scanner;

public class Prime{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();

        System.out.println("Prime numbers between " + lowerBound + " and " + upperBound + ":");
        generatePrimesInRange(lowerBound, upperBound);

        scanner.close();
    }

    private static void generatePrimesInRange(int lowerBound, int upperBound) {
        for (int num = lowerBound; num <= upperBound; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); // Move to the next line after printing prime numbers
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

