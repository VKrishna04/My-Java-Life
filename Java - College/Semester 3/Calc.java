abstract class Shape {
  public abstract double area();

  public abstract double perimeter();
}

class Circle extends Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double area() {
    return Math.PI * radius * radius;
  }

  public double perimeter() {
    return 2 * Math.PI * radius;
  }
}

class Rectangle extends Shape {
  private double length;
  private double breadth;

  public Rectangle(double length, double breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  public double area() {
    return length * breadth;
  }

  public double perimeter() {
    return 2 * (length + breadth);
  }
}

class Triangle extends Shape {
  private double side1;
  private double side2;
  private double side3;

  public Triangle(double side1, double side2, double side3) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  public double area() {
    double s = (side1 + side2 + side3) / 2;
    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
  }

  public double perimeter() {
    return side1 + side2 + side3;
  }
}

public class Calc {
  public static void main(String[] args) {
    Circle circle = new Circle(5);
    System.out.println("Area of circle is: " + circle.area());
    System.out.println("Perimeter of circle is: " + circle.perimeter());
    Rectangle rectangle = new Rectangle(4, 6);
    System.out.println("Area of rectangle is: " + rectangle.area());
    System.out.println("Perimeter of rectangle is: " + rectangle.perimeter());
    Triangle triangle = new Triangle(3, 4, 5);
    System.out.println("Area of triangle is: " + triangle.area());
    System.out.println("Perimeter of triangle is: " + triangle.perimeter());
  }
}
