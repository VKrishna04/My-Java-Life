// Write a Java program that uses multiple threads to perform concurrent tasks. Implement thread synchronization mechanisms to avoid conflicts.
public class Threading {
  public static void main(String[] args) {

    try {
      java.io.File file = new java.io.File("person.txt");
      java.io.ObjectOutputStream output = new java.io.ObjectOutputStream(new java.io.FileOutputStream(file));
      output.writeObject(new Person("Krishna", 19));
      output.writeObject(new Person("Vamsi", 17));
      output.writeObject(new Person("Surya", 18));
      output.close();
      java.io.ObjectInputStream input = new java.io.ObjectInputStream(new java.io.FileInputStream(file));
      while (true) {
        System.out.println(input.readObject());
      }
    } catch (java.io.EOFException ex) {
      System.out.println("End of file reached.");
    } catch (java.io.IOException ex) {
      System.out.println("IO Exception.");
    } catch (java.lang.ClassNotFoundException ex) {
      System.out.println("Class not found.");
    }
  }
}