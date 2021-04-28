// import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

// class DetectLoop {
// public static void makeLoop(Node head, Node tail, int x) {
// if (x == 0)
// return;

// Node curr = head;
// for (int i = 1; i < x; i++) {
// curr = curr.next;
// }

// tail.next = curr;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int n = sc.nextInt();

// int num = sc.nextInt();

// Node head = new Node(num);
// Node tail = head;

// for (int i = 0; i < n - 1; i++) {
// num = sc.nextInt();
// tail.next = new Node(num);
// tail = tail.next;
// }

// int pos = sc.nextInt();
// makeLoop(head, tail, pos);

// Solution x = new Solution();

// if (x.detectLoop(head))
// System.out.println("True");
// else
// System.out.println("False");
// }
// }

class Solution {
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