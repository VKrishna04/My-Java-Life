import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class DoubleLinkedList {
    Node head;

    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;

        if (head != null) {
            head.prev = newNode;
        }

        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        Node last = head;

        newNode.next = null;

        if (head == null) {
            newNode.prev = null;
            head = newNode;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
        newNode.prev = last;
    }

    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        Node nodeAtPosition = head;

        for (int i = 1; i < position && nodeAtPosition != null; i++) {
            nodeAtPosition = nodeAtPosition.next;
        }

        if (nodeAtPosition == null) {
            System.out.println("The given position is greater than the list's length.");
            return;
        }

        newNode.next = nodeAtPosition.next;
        newNode.prev = nodeAtPosition;

        if (nodeAtPosition.next != null) {
            nodeAtPosition.next.prev = newNode;
        }

        nodeAtPosition.next = newNode;
    }

    public void deleteAtFront() {
        if (head == null) {
            return;
        }

        head = head.next;

        if (head != null) {
            head.prev = null;
        }
    }

    public void deleteAtEnd() {
        if (head == null) {
            return;
        }

        Node last = head;

        while (last.next != null) {
            last = last.next;
        }

        last.prev.next = null;
    }

    public void deleteAtPosition(int position) {
        if (head == null) {
            return;
        }

        Node nodeAtPosition = head;

        for (int i = 1; i < position && nodeAtPosition != null; i++) {
            nodeAtPosition = nodeAtPosition.next;
        }

        if (nodeAtPosition == null) {
            System.out.println("The given position is greater than the list's length.");
            return;
        }

        if (nodeAtPosition.next != null) {
            nodeAtPosition.next.prev = nodeAtPosition.prev;
        }

        if (nodeAtPosition.prev != null) {
            nodeAtPosition.prev.next = nodeAtPosition.next;
        }

        if (position == 1) {
            head = head.next;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Insert at front");
            System.out.println("2. Insert at end");
            System.out.println("3. Insert at position");
            System.out.println("4. Delete at front");
            System.out.println("5. Delete at end");
            System.out.println("6. Delete at position");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the data to insert at front: ");
                    int frontData = scanner.nextInt();
                    list.insertAtFront(frontData);
                    break;
                case 2:
                    System.out.print("Enter the data to insert at end: ");
                    int endData = scanner.nextInt();
                    list.insertAtEnd(endData);
                    break;
                case 3:
                    System.out.print("Enter the data to insert: ");
                    int data = scanner.nextInt();
                    System.out.print("Enter the position to insert at: ");
                    int position = scanner.nextInt();
                    list.insertAtPosition(data, position);
                    break;
                case 4:
                    list.deleteAtFront();
                    break;
                case 5:
                    list.deleteAtEnd();
                    break;
                case 6:
                    System.out.print("Enter the position to delete at: ");
                    int delPosition = scanner.nextInt();
                    list.deleteAtPosition(delPosition);
                    break;
                case 7:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}