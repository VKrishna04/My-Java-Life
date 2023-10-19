import java.util.Scanner;

class FactorialCalculator {
    public static long calculateFactorial(int n) {
        if (n < 0) {
            n = -n;
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = s.nextInt();
        long factorial = calculateFactorial(n);

        System.out.println("Factorial of " + n + " is " + factorial);
        s.close();
    }
}
