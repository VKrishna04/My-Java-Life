class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList_DeleteAtFrontLL {
    Node head;

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void deleteAtBegining() {
        head = head.next;
    }
}

public class DeleteAtFrontLL {
    public static void main(String[] args) {
        LinkedList_DeleteAtFrontLL list = new LinkedList_DeleteAtFrontLL();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        System.out.print("Linked list: ");
        list.printList();
        System.out.print("Linked List after deleting first element: ");
        list.deleteAtBegining();
        list.printList();
    }
}