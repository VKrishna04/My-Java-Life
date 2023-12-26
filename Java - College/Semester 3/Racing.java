// Create a program to simulate a race between multiple threads. Use synchronization to ensure fairness.
public class Racing implements Runnable {
  private static final int MAX_STEPS = 5;
  private static int racePosition = 1;

  private final String racerName;

  public Racing(String racerName) {
    this.racerName = racerName;
  }

  @Override
  public void run() {
    for (int i = 0; i < MAX_STEPS; i++) {
      synchronized (Racing.class) {
        System.out.println(racerName + " is at step " + i);
        if (i == MAX_STEPS - 1) {
          System.out.println(racerName + " finished the race at position " + racePosition++);
        }
      }
    }
  }

  public static void main(String[] args) {
    Thread racer1 = new Thread(new Racing("Racer 1"));
    Thread racer2 = new Thread(new Racing("Racer 2"));
    Thread racer3 = new Thread(new Racing("Racer 3"));

    racer1.start();
    racer2.start();
    racer3.start();
  }
}