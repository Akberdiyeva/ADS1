import java.util.Scanner;

public class Main {

    //1
    public static void printDigits(int n) {
        if (n < 10) {
            System.out.println(n);
            return;
        }
        printDigits(n / 10);
        System.out.println(n % 10);
    }

    //2
    public static int sum(int[] arr, int n) {
        if (n == 0) return 0;
        return arr[n - 1] + sum(arr, n - 1);
    }

    //3
    public static boolean isPrime(int n, int i) {
        if (n <= 2) return n == 2;
        if (n % i == 0) return false;
        if (i * i > n) return true;
        return isPrime(n, i + 1);
    }

    //4
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    //5
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //6
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    //7
    public static void reversePrint(Scanner sc, int n) {
        if (n == 0) return;
        int x = sc.nextInt();
        reversePrint(sc, n - 1);
        System.out.print(x + " ");
    }

    //8
    public static boolean isDigits(String s, int i) {
        if (i == s.length()) return true;
        if (!Character.isDigit(s.charAt(i))) return false;
        return isDigits(s, i + 1);
    }

    //9
    public static int countChars(String s) {
        if (s.equals("")) return 0;
        return 1 + countChars(s.substring(1));
    }

    //10
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Task 1:");
        printDigits(5481);

        System.out.println("\nTask 2:");
        int[] arr = {3, 2, 4, 1};
        int s = sum(arr, arr.length);
        System.out.println((double)s / arr.length);

        System.out.println("\nTask 3:");
        System.out.println(isPrime(7, 2) ? "Prime" : "Composite");

        System.out.println("\nTask 4:");
        System.out.println(factorial(5));

        System.out.println("\nTask 5:");
        System.out.println(fibonacci(5));

        System.out.println("\nTask 6:");
        System.out.println(power(2, 10));

        System.out.println("\nTask 7:");
        System.out.println("Enter 4 numbers:");
        reversePrint(sc, 4);
        System.out.println();

        System.out.println("\nTask 8:");
        System.out.println(isDigits("123456", 0) ? "Yes" : "No");

        System.out.println("\nTask 9:");
        System.out.println(countChars("hello"));

        System.out.println("\nTask 10:");
        System.out.println(gcd(32, 48));
    }
}