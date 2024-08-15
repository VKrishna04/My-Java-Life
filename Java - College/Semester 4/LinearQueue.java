import java.util.Scanner;

public class LinearQueue {
    private int front, rear, capacity;
    private int queue[];

    public LinearQueue(int c) {
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }

    public void enqueue(int data) {
        if (capacity == rear) {
            System.out.printf("\nQueue is full\n");
            return;
        } else {
            queue[rear] = data;
            rear++;
        }
    }

    public void dequeue() {
        if (front == rear) {
            System.out.printf("\nQueue is empty\n");
            return;
        } else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }

            if (rear < capacity) {
                queue[rear] = 0;
            }

            rear--;
        }
    }

    public void display() {
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }

        for (int i = front; i < rear; i++) {
            System.out.printf(" %d <-- ", queue[i]);
        }
        return;
    }

    public static void main(String[] args) {
        LinearQueue q = new LinearQueue(5);
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