// Circular Queue eith Array.

public class CirQwithArray{
    static class Queue2{
        public static int arr[];
        public static int size;
        public static int rear = -1;
        public static int front = -1;
        Queue2(int n){
            arr = new int[n];
            this.size = n;
        }
        //is empty?
        public static boolean isEmpty(){
            return rear == -1 & front== -1;
        }
        //is full?
        public static boolean isFull(){
            return (rear+1)%size == front;
        }
        //Enqueue - O(1)
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full.");
                return;
            }
            if(front==-1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }
        //dequeue - O(1)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            if(rear==front){
                rear = front = 1;
            }else{
                front = (front+1)%size;
            }
            return result;
        }

        //peek - O(1)
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue2 q = new Queue2(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}