class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList_DeleteAtEndLL {
    Node head;

    public void insertAtEnd(int data) {
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

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("The Linked List is empty Please create a new node before performing Delete operation!!!");
            return;
        }
        Node last = head;
        Node lastFinal = head;
        lastFinal = lastFinal.next;

        while(lastFinal.next != null) {
            lastFinal = lastFinal.next;
            last = last.next;
        }
        last.next = null;
    }
}

public class DeleteAtEndLL {
    public static void main(String[] args) {
        LinkedList_DeleteAtEndLL list = new LinkedList_DeleteAtEndLL();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        System.out.print("Linked list: ");
        list.printList();
        System.out.print("Linked list After removing the Element at the End: ");
        list.deleteAtEnd();
        list.printList();
    }
}