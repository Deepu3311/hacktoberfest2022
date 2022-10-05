//Queue with Array.
public class ImplWithArray{
    static class Queue{
        public static int arr[];
        public static int size;
        public static int rear = -1;
        Queue(int n){
            arr = new int[n];
            this.size = n;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        //Enqueue - O(1)
        public static void add(int data){
            if(rear==size-1){
                System.out.println("Queue is full.");
                return;
            }
            rear++;
            arr[rear] = data;
        }
        //dequeue - O(n)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        //peek - O(n)
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            return front;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}