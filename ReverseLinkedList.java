// function to reverse a linkedlist
class Node {
    int data;
    Node next;

    Node() {
        data = 0;
        next = null;
    }
}

class ReverseLinkedList {
    public static Node reverseList(Node head) {
        Node p = null, n = null;
        Node curr = head;

        while (curr != null) {
            n = curr.next;
            curr.next = p;
            p = curr;
            curr = n;
        }
        return p;
    }
}