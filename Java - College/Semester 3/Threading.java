// Write a Java program that uses multiple threads to perform concurrent tasks. Implement thread synchronization mechanisms to avoid conflicts.
class Counter {
  private int count = 0;

  public synchronized void increment() {
    count++;
  }

  public int getCount() {
    return count;
  }
}

public class Threading {
  public static void main(String[] args) throws InterruptedException {
    Counter counter = new Counter();

    // Create two threads that increment the counter
    Thread thread1 = new Thread(() -> {
      for (int i = 0; i < 10000; i++) {
        counter.increment();
      }
    });

    Thread thread2 = new Thread(() -> {
      for (int i = 0; i < 10000; i++) {
        counter.increment();
      }
    });

    // Start the threads
    thread1.start();
    thread2.start();

    // Wait for both threads to finish
    thread1.join();
    thread2.join();

    // Print the final count
    System.out.println("Final count: " + counter.getCount());
  }
}