import java.util.NoSuchElementException;

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
                    throw new IllegalArgumentException("Invalid position: " + position);
                } else {
                    insertAtPosition(data, position);
                }
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
            throw new NoSuchElementException("Position: " + position + " is after the end of the list");
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

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10, 0); // Insert at the beginning
        list.insert(20, -1); // Insert at the end
        try {
            list.insert(30, 2); // Insert at position 2
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            list.insert(40, 5); // Insert at invalid position (beyond the end)
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
        System.out.print("Linked list: ");
        list.printList();
    }
}
