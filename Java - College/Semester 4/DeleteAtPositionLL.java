class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList_DeleteAtPosition {
    Node head;

    public void insertAtPosition(int data, int position) {
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }

        Node newNode = new Node(data);

        if (position == 0) {
            // Insert at the beginning
            newNode.next = head;
            head = newNode;
        } else {
            // Find the node at the position before the insertion point
            Node current = head;
            int count = 1;
            while (current != null && count < position) {
                current = current.next;
                count++;
            }

            if (current == null) {
                System.out.println("Invalid position");
                return;
            }

            // Insert the new node after the found node
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void deleteAtPosition(int position) {
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }
        Node current = head;
        for (int i = 0; i < position - 2; i++) {
            current = current.next;
        }
        current.next = current.next.next;
    }
}

public class DeleteAtPositionLL {
    public static void main(String[] args) {
        LinkedList_DeleteAtPosition list = new LinkedList_DeleteAtPosition();
        list.insertAtPosition(10, 0); // Insert at the beginning
        list.insertAtPosition(20, 1); // Insert after the first node
        list.insertAtPosition(30, 2); // Insert at the end
        System.out.print("Linked list: ");
        list.printList();
        System.out.print("Now we will try to remove 2nd element in the Linked List");
        System.out.print("Linked list After removing 2nd Element: ");
        list.deleteAtPosition(2);
        list.printList();
    }
}
