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

public class ShapesAandP {
  public static void main(String[] args) {
    Circle circle = new Circle(5);
    System.out.println("Circle Area will be: " + circle.area());
    System.out.println("Circle Perimeter will be: " + circle.perimeter());
    Rectangle rectangle = new Rectangle(4, 6);
    System.out.println("Rectangle Area will be: " + rectangle.area());
    System.out.println("Rectangle Perimeter will be: " + rectangle.perimeter());
  }
}
