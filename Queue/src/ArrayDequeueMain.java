
public class ArrayDequeueMain {
    public static void main(String[] args) {
        ArrayDequeue queue=new ArrayDequeue(5);
        queue.enQueue(4);
        queue.enQueue(6);
        queue.enQueue(8);
        queue.deQueueRear();

    }
}
