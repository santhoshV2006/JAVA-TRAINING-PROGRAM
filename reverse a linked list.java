class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {
    
    static Node reverse(Node head) {
        Node prev = null, current = head, next;
        
        while (current != null) {
            next = current.next;  
            current.next = prev;  
            prev = current;       
            current = next;       
        }
        return prev; 
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.print("Original List: ");
        printList(head);

        head = reverse(head);

        System.out.print("Reversed List: ");
        printList(head);
    }
}

