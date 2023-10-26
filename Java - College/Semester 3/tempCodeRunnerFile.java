// Java Program to Convert Celsius into Fahrenheit
import java.util.Scanner;
class CelsiusToFahrenheit {
	public static void main(String[] args)
	{
  Scanner s= new Scanner(System.in);
		// giving value to variables initializing
		double celsius = 10.0, fahrenheit = 0.0;

		//asking user to input the value of celsius
  System.out.println("Enter the temperature in celsius:");
		celsius = s.nextDouble();
  // formula for conversion
		fahrenheit = (celsius * 1.8) + 32;
		System.out.println(" Value of temperature in fahrenheit:"+ fahrenheit);
		s.close();
	}
}