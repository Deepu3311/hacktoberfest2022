//Implement queue with linkedlist
class ImplWithLL{
    //creat a node
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next = null;
        }
    }
    //Implement a queue class
    static class Queue{
        static Node head = null;
        static Node tail = null;
        //check is empty or not
        public static boolean isEmpty() {
            return head==null &&tail==null;

        }
        // add a new node
        public static void add(int data){
            Node newNode = new Node(data);
            if(tail==null){
                head = tail = newNode;
                return;
            }
            
            tail.next = newNode;
            tail = newNode;
        }
        // Remove a node
        public static int remove(){
            if(isEmpty()){
                System.out.print("Queue is Empty");
                return -1;
            }
            int front = head.data;
            if(head==tail){
                tail = null;
            }
            head = head.next;
            return front;
        }
        // find peek element
        public static int peek(){
            if(isEmpty()){
                System.out.print("Queue is Empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}