// Base class "Shape"
class Shape {
    // Default constructor
    public Shape() {
    }

    // Method to calculate area (to be overridden by subclasses)
    public double calculateArea() {
        return 0.0;
    }

    // Method to calculate perimeter (to be overridden by subclasses)
    public double calculatePerimeter() {
        return 0.0;
    }
}

// Subclass "Circle"
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override the calculateArea method for circles
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Override the calculatePerimeter method for circles
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Subclass "Rectangle"
class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Override the calculateArea method for rectangles
    @Override
    public double calculateArea() {
        return width * height;
    }

    // Override the calculatePerimeter method for rectangles
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

// Subclass "Triangle"
class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    // Constructor
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Override the calculateArea method for triangles (Heron's formula)
    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Override the calculatePerimeter method for triangles
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
