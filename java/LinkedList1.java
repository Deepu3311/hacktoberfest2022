package Sample;

public class LinkedList1 {

    Node head;
    static class Node{
        public int value;
        public Node next;
        Node(int d){
            value = d;
            next = null;
        }
    }

    public static void main(String[] args){
        LinkedList1 linkedList1 = new LinkedList1();

        //Assigning value to nodes
        linkedList1.head = new Node(51);
        Node second = new Node(25);
        Node third = new Node(38);

        //Connecting the nodes with each other
        linkedList1.head.next = second;
        second.next = third;

        System.out.println("LinkedList : ");
        while(linkedList1.head != null){
            System.out.println(linkedList1.head.value + "");
            linkedList1.head = linkedList1.head.next;
        }
    }

}
