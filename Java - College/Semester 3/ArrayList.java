
// Implement a program to store and manage a list of student records using ArrayList. Use generics to ensure type safety.
import java.util.List;

public class ArrayList {
  private String name;
  private int age;
  private static List<ArrayList> students = new java.util.ArrayList<>();

  public ArrayList(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student{name='" + name + "', age=" + age + "}";
  }

  public static void addStudent(ArrayList student) {
    students.add(student);
  }

  public static void printStudents() {
    students.forEach(System.out::println);
  }

  public static void main(String[] args) {
    addStudent(new ArrayList("John", 20));
    addStudent(new ArrayList("Jane", 22));
    printStudents();
  }
}