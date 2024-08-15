import java.util.Scanner;

public class CircularQueue {
    private int front, rear, size;
    private int queue[];

    public CircularQueue(int c) {
        front = rear = 0;
        size = c;
        queue = new int[size];
    }

    public void enqueue(int data) {
        if ((rear + 1) % size == front) {
            System.out.printf("\nQueue is full\n");
            return;
        } else {
            rear = (rear + 1) % size;
            queue[rear] = data;
        }
    }

    public void dequeue() {
        if (front == rear) {
            System.out.printf("\nQueue is empty\n");
            return;
        } else {
            front = (front + 1) % size;
        }
    }

    public void display() {
        int i;
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }

        for (i = (front + 1) % size; i != (rear + 1) % size; i = (i + 1) % size) {
            System.out.printf(" %d <-- ", queue[i]);
        }
        return;
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the data to enqueue: ");
                    int data = scanner.nextInt();
                    q.enqueue(data);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}