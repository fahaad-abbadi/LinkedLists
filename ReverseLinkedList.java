// function to reverse a linkedlist
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