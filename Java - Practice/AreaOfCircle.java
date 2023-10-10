// A program to calculate the area of a circle.
import java.util.Scanner;

class AreaOfCircle {
  public static void main(String[] args) 
  {
  Scanner s= new Scanner(System.in);

  double area=0.0;
  System.out.println("Enter the radius of the circle.");
  double radius = s.nextDouble();
  area=Math.PI*Math.pow(radius,2);
  System.out.println("Area of the circle is "+area+" units or "+Math.pow(radius,2)+" * pi units.");
  
  s.close();
  }
}