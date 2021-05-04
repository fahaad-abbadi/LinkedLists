public class PrintList {
    static void PrintList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;

            if (node != null)
                System.out.print("->");
        }
        System.out.println();
    }
}
