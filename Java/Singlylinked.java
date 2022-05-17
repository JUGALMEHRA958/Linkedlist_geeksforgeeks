// Q3 Insert node in Linked list
// Link : https://www.geeksforgeeks.org/linked-list-set-2-inserting-a-node/


public class Singlylinked {


    private Node head;


    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next=null;
        }
    }

    public void addAtFront(int data){
        // System.out.println("Data is  " + data);
        Node newNode = new Node(data);
        newNode.next = head;
        // System.out.println("Node data  is   " + newNode.data + "      head is  " + head.data);
        head = newNode;
    }
    
    public void addAtLast(int data){
        // System.out.println("Data to add in last  is  " + data);
        Node newNode = new Node(data);
        Node temp = head;
        if(head == null){
            // System.out.println("Head is null");
            head = newNode;
            return;
        }
        else{
            while(temp.next!= null){
                temp = temp.next;
            }
            temp.next = newNode;
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
    public void findLength(){
                Node temp = head;
                int count=0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Length of the linked list is "+count);
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
        sl.addAtFront(1330);
        sl.display();

        
        sl.addAtLast(1330);
        sl.display();


        sl.findLength();

        // System.out.println("Over");
        // System.out.println( "Hello World!" );
    }
}