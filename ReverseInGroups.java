public class ReverseInGroups {
    static Node reversegroup(Node head, int k) {
        if (head == null || k == 1)
            return head;

        Node dummy = new Node(0);
        dummy.next = head;

        Node curr = dummy;

        Node n = dummy;
        Node p = dummy;

        int count = 0;

        while (curr.next != null) {
            curr = curr.next;
            count++;
        }

        while (count >= k) {
            curr = p.next;
            n = curr.next;

            for (int i = 1; i < k; i++) {
                curr.next = n.next;
                n.next = p.next;
                p.next = n;
                n = curr.next;
            }

            p = curr;
            count -= k;
        }

        return dummy.next;
    }
}
