public class ArrayCircularQueueMain {
    public static void main(String[] args) {
        ArrayCircularQueue queue=new ArrayCircularQueue(5);
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);

        queue.deQueue();
    }
}
