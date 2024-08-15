import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class CircularLinkedList {
    Node head;

    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        Node temp = head;

        newNode.next = head;

        if (head != null) {
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
        } else {
            newNode.next = newNode;
        }

        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        Node temp = head;

        newNode.next = head;

        if (head != null) {
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
        } else {
            newNode.next = newNode;
            head = newNode;
        }
    }

    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 0; i < position - 1; i++) {
            if (temp.next == head) {
                break;
            }
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteAtFront() {
        if (head == null) {
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = head.next;
        head = head.next;
    }

    public void deleteAtEnd() {
        if (head == null) {
            return;
        }

        Node temp = head;
        Node prev = null;

        while (temp.next != head) {
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;
    }

    public void deleteAtPosition(int position) {
        if (head == null) {
            return;
        }

        Node temp = head, prev = null;

        for (int i = 0; i < position - 1; i++) {
            if (temp.next == head) {
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Insert at front");
            System.out.println("2. Insert at end");
            System.out.println("3. Insert at position");
            System.out.println("4. Delete at front");
            System.out.println("5. Delete at end");
            System.out.println("6. Delete at position");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the data to insert at front: ");
                    int frontData = input.nextInt();
                    list.insertAtFront(frontData);
                    break;
                case 2:
                    System.out.print("Enter the data to insert at end: ");
                    int endData = input.nextInt();
                    list.insertAtEnd(endData);
                    break;
                case 3:
                    System.out.print("Enter the data to insert: ");
                    int data = input.nextInt();
                    System.out.print("Enter the position to insert at: ");
                    int position = input.nextInt();
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
                    int delPosition = input.nextInt();
                    list.deleteAtPosition(delPosition);
                    break;
                case 7:
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}