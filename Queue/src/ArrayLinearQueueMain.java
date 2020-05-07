public class ArrayLinearQueueMain {
    public static void main(String[] args) {
        ArrayLinearQueue queue=new ArrayLinearQueue(7);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);
        queue.dequeue();
        queue.dequeue();
    }
}
