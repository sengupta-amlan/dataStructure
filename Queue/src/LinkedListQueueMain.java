public class LinkedListQueueMain {
    public static void main(String[] args) {
        LinkedListQueue queue=new LinkedListQueue();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
