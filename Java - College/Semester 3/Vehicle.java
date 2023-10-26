public class Vehicle {
  String type;
  double speed;

  Vehicle(String type) {
    this.type = type;
  }

  void calculateSpeed(double distance, double time) {
    this.speed = distance / time;
    System.out.println("The speed of the " + type + " is " + speed + " units per hour.");
  }
  
  public static void main(String[] args) {
    Car car = new Car();
    car.calculateSpeed(100, 2);
    Bicycle bicycle = new Bicycle();
    bicycle.calculateSpeed(30, 1);
  }
}

class Car extends Vehicle {
  Car() {
    super("Car");
  }
}

class Bicycle extends Vehicle {
Bicycle() {
super("Bicycle");
  }
}