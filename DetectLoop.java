public class DetectLoop {
    public boolean detectLoop(Node head) {
        Node hare = head;
        Node turtle = head;

        while (hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;

            if (hare == turtle)
                return true;
        }

        return false;
    }
}