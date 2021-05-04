class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class InsertAtPos {

    static Node GetNode(int data) {
        return new Node(data);
    }

    static Node InsertPos(Node headNode, int position, int data) {
        Node head = headNode;
        Node temp = new Node(data);

        if (position < 1)
            System.out.println("Invalid position");

        if (position == 1) {
            Node new_node = new Node(data);
            new_node.next = headNode;
            head = new_node;

            return head;
        }

        Node curr = head;

        for (int i = 1; i <= position - 2 && curr != null; i++) {
            curr = curr.next;
        }

        if (curr == null)
            return head;

        temp.next = curr.next;
        curr.next = temp;

        return head;
    }

    static void PrintList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;

            if (node != null)
                System.out.print("->");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = GetNode(3);
        head.next = GetNode(5);
        head.next.next = GetNode(8);
        head.next.next.next = GetNode(10);

        System.out.println("Linked list before insertion : ");
        PrintList(head);
        System.out.println();

        head = InsertPos(head, 3, 12);
        head = InsertPos(head, 5, 29);
        head = InsertPos(head, 6, 78);
        head = InsertPos(head, 7, 56);
        head = InsertPos(head, 8, 23);
        head = InsertPos(head, 10, 99);

        System.out.println("Linked list after insertion: ");
        PrintList(head);
    }
}