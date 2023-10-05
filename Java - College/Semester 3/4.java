// Factorial Calculator
import java.util.Scanner;

class Factorial{
    public static void main(String[] args) {   
        Scanner s= new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = s.nextInt();
        if (n < 0) {
            n = -n;
        }
        long factorial = 1; 
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of "+n+" is "+factorial);
        s.close();
    }
}