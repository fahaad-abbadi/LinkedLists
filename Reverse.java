// function to reverse a linkedlist
public class Reverse {
    public static Node reverselist(Node head) {
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