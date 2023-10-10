// Create a class "Circle" with attributes for radius and methods to calculate its area and circumference.
import java.util.Scanner;

class Circle {
  double radius;
  double area;
  double circumference;

  Circle(double radius){
  this.radius = radius;
  this.area = Math.PI*Math.pow(radius,2);
  this.circumference = 2*Math.PI*radius;
  }

  void display(){
  System.out.println("Area of the Circle"+area);
  System.out.println("Circumference of the circle"+circumference);
  }
  public static void main(String [] args){
  Scanner s = new Scanner(System.in);

  System.out.println("Please enter the radius of the circle :");
  int radius = s.nextInt();
  s.nextLine();
  
  Circle circle = new Circle(radius);
  circle.display();

  s.close();
  }
}
