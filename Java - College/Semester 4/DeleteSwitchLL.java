import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList_DeleteSwitchLL {
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

    public void deleteAtBegining() {
        head = head.next;
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
    
    public void deleteAtPosition(int position) {
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 0) {
            deleteAtBegining();
            return;
        }

        Node current = head;
        for(int i = 0; i < position-2; i++){
            current = current.next;
        }
        current.next = current.next.next;
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

public class DeleteSwitchLL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList_DeleteSwitchLL list = new LinkedList_DeleteSwitchLL();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);        
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertAtEnd(60);        
        list.insertAtEnd(70);
        list.insertAtEnd(80);
        list.insertAtEnd(90);        
        System.out.print("\nCurrent Linked List: ");
        list.printList();

        int choice, position;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Delete at beginning");
            System.out.println("2. Delete at end");
            System.out.println("3. Delete at position");
            System.out.println("4. Print list");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Current Linked List after Deleting Node at Beginning: ");
                    list.deleteAtBegining();
                    list.printList();
                    break;
                case 2:
                    System.out.print("Enter data to delete at the end: ");
                    list.deleteAtEnd();
                    System.out.print("Current Linked List after Deleting Node at End: ");
                    list.printList();
                    break;
                case 3:
                    System.out.print("Enter position to delete (0 for beginning, -1 for end): ");
                    position = scanner.nextInt();
                    list.deleteAtPosition(position);
                    System.out.print("Current Linked List after Deleting Node at Position "+position+": ");
                    list.printList();
                    break;
                case 4:
                System.out.print("Current Linked List is: ");
                list.printList();
                    break;
                case 5:
                    System.out.print("Final Linked List: ");
                    list.printList();
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        scanner.close();
    }
}
