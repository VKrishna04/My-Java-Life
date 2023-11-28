interface Drawable {
  void draw();
}

class Circle implements Drawable {
  public void draw() {
    System.out.println("Drawing a circle...");
  }
}

class Square implements Drawable {
  public void draw() {
    System.out.println("Drawing a square...");
  }
}

public class DrawingCandS {
  public static void main(String[] args) {
    Circle circle = new Circle();
    circle.draw();
    Square square = new Square();
    square.draw();
  }
}
