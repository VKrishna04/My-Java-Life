// Implement a class hierarchy for shapes (e.g., Circle, Rectangle, Triangle) with a base class "Shape." Calculate areas and perimeters for each shape.

class Circle extends Shapes1 {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double getPerimeter() {
    return 2 * Math.PI * radius;
  }

  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }
}

class Rectangle extends Shapes1 {
  private double length;
  private double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  @Override
  public double getPerimeter() {
    return 2 * (length + width);
  }

  @Override
  public double getArea() {
    return length * width;
  }
}

class Triangle extends Shapes1 {
  private double side1;
  private double side2;
  private double side3;

  public Triangle(double side1, double side2, double side3) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  @Override
  public double getPerimeter() {
    return side1 + side2 + side3;
  }

  @Override
  public double getArea() {
    double s = (side1 + side2 + side3) / 2;
    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
  }
}

public class Shapes1 {

  public double getPerimeter() {
    return 0.0;
  }

  public double getArea() {
    return 0.0;
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
}
