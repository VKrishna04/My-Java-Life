import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insert(int data, int position) {
        switch (position) {
            case 0:
                insertAtBeginning(data);
                break;
            case -1:
                insertAtEnd(data);
                break;
            default:
                if (position < 0) {
                    System.out.println("Invalid position: " + position);
                    return;
                }
                insertAtPosition(data, position);
        }
    }

    private void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    private void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    private void insertAtPosition(int data, int position) {
        if (position == 0) {
            insertAtBeginning(data);
            return;
        }

        Node current = head;
        int count = 1;
        while (current != null && count < position) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Position: " + position + " is after the end of the list");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = current.next;
        current.next = newNode;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class InsertSwitchLL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int choice, data, position;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at beginning");
            System.out.println("2. Insert at end");
            System.out.println("3. Insert at position");
            System.out.println("4. Print list");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at the beginning: ");
                    data = scanner.nextInt();
                    list.insert(data, 0);
                    break;
                case 2:
                    System.out.print("Enter data to insert at the end: ");
                    data = scanner.nextInt();
                    list.insert(data, -1);
                    break;
                case 3:
                    System.out.print("Enter data to insert: ");
                    data = scanner.nextInt();
                    System.out.print("Enter position (0 for beginning, -1 for end): ");
                    position = scanner.nextInt();
                    list.insert(data, position);
                    break;
                case 4:
                    list.printList();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        scanner.close();
    }
}
