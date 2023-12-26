
// Implement a program that reads and writes objects to a file. Create a class "Person" and demonstrate object serialization.'
import java.io.*;

public class Person implements Serializable {
  private static final long serialVersionUID = 1L;
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{name='" + name + "', age=" + age + "}";
  }

  public static void saveToFile(Person[] people, String filename) throws IOException {
    FileOutputStream fos = new FileOutputStream(filename);
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    for (Person p : people) {
      oos.writeObject(p);
    }
    oos.close();
  }

  public static void loadFromFile(String filename) throws IOException, ClassNotFoundException {
    FileInputStream fis = new FileInputStream(filename);
    ObjectInputStream ois = new ObjectInputStream(fis);
    try {
      while (true) {
        Person p = (Person) ois.readObject();
        System.out.println(p);
      }
    } catch (EOFException e) {
      // End of file reached
    }
    ois.close();
  }

  public static void main(String[] args) {
    Person[] people = {
        new Person("Krishna", 19),
        new Person("Vamsi", 18),
        new Person("Surya", 16)
    };

    try {
      saveToFile(people, "people.ser");
      loadFromFile("people.ser");
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}