// Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().

public class Employee {
  void work() {
    System.out.println("Employee works");
  }

  int getSalary() {
    return 10000;
  }

  public class HRManager extends Employee {
    @Override
    void work() {
      System.out.println("HR Manager works");
    }

    void addEmployee() {
      System.out.println("HR Manager adds employee");
    }
  }

  public static void main(String[] Args) {
    Employee employee = new Employee();
    HRManager hrManager = employee.new HRManager();
    
    employee.work();
    hrManager.work();
    hrManager.addEmployee();
  }
}
