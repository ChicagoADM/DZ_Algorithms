//Необходимо реализовать метод разворота связного списка (двухсвязного или односвязного на выбор).
package HW3;

public class Main {
    public static void main(String[] args) {
    LinkedList list = new LinkedList();

    Node node1 = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Node node4 = new Node(6);
    Node node5 = new Node(0);

    node1.next = node2;
    node2.prev = node1;
    node2.next = node3;
    node3.prev = node2;
    node3.next = node4;
    node4.prev = node3;
    node4.next = node5;
    node5.prev = node4;

    Node result = list.reverseList(node1);

        while (result != null) {
        System.out.print(result.val + " ");
        result = result.next;
    }
}
}
