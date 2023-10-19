// Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.

public class Animal {
  void makeSound() {
    System.out.println("Animal makes sound");
  }

  public class Cat extends Animal {
    @Override
    void makeSound() {
      System.out.println("Cat meows");
    }
  }

/*
  public class Dog extends Animal {
    @Override
    void makeSound() {
      system.out.print("Dog Barks")
    }
  }
*/

  public static void main(String[] Args) {
    Animal animal = new Animal();
    Cat cat = animal.new Cat();
    
    animal.makeSound();
    cat.makeSound();
  }
}