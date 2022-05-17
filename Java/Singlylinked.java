

/**
 * Singlylinked
 */
public class Singlylinked {


    private Node head;


    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
         System.out.println( "null" );
    }


    public static void main(String[] args) {
        Singlylinked sl = new Singlylinked();
        sl.head = new Node(10);
        Node second = new Node(34);
        Node third = new Node(87);
        Node fourth = new Node(45);
        Node fifth = new Node(100);

        sl.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;

        sl.display();

        // System.out.println( "Hello World!" );
    }
}