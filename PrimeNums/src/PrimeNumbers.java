
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;

        System.out.print("Enter any Positive number ( to get primes between 1 to n ) : ");
        n = scan.nextInt();
        int[] count = new int[n];
        String primeNumbers = "";
        boolean isPrime = true;
        int countt = 0;
        for (int i = 1; i <= n; i++) {

            isPrime = check(i);
            if (isPrime) {
                primeNumbers = primeNumbers + i + "\n";
                countt = countt + 1;
            }
        }
        System.out.println("Prime numbers from 1 to " + n + " are:");
        System.out.println(primeNumbers);

        System.out.println("There Is "+countt+" prime numebrs beetween 1 and "+ n);
    }

    public static boolean check(int number) {
        int checker;
        for (int i = 2; i <= number / 2; i++) {
            checker = number % i;
            if (checker == 0) {
                return false;

            }
        }
        return true;
    }
}
