// Implement a class hierarchy for shapes (e.g., Circle, Rectangle, Triangle) with a base class "Shape." Calculate areas and perimeters for each shape.
public class Shapes1 {

  public double getPerimeter() {
  return 0.0;
  }

  public double getArea() {
  return 0.0;
  }
}
  class Circle extends Shapes1 {
    private double radius;

    public Circle (double radius) {
      this.radius = radius;
    }

    @Override 
    public double calculateArea() {
      return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double cal
  }

  public static void main(String[] args) {
    Circle circle = new Circle(5);
    Rectangle rectangle = new Rectangle(5, 10);
    Triangle triangle = new Triangle(5, 10, 15);

    System.out.println("Circle Area: " + circle.getArea());
    System.out.println("Circle Perimeter: " + circle.getPerimeter());
    System.out.println("Rectangle Area: " + rectangle.getArea());
    System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
    System.out.println("Triangle Area: " + triangle.getArea());
    System.out.println("Triangle Perimeter: " + triangle.getPerimeter());
  }
