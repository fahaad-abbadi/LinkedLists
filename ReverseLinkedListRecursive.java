public class ReverseLinkedListRecursive {
    static Node reverse(Node head) {
        if (head == null || head.next == null)
            return head;

        Node temp = reverse(head.next);

        head.next.next = head;
        head.next = null;

        return temp;
    }
}