public class QueueUsingStackMain {
    public static void main(String[] args) {
        //int myArr[]={6,3,9,5,4,2,8,12,10};
        QueueUsingStack queue=new QueueUsingStack();
        queue.s1=new Stack(9);
        queue.s2=new Stack(9);


        queue.enqueue(6);
        queue.enqueue(3);
        queue.enqueue(9);
        queue.dequeue();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(2);
        queue.enqueue(8);
        queue.enqueue(12);
        queue.dequeue();
        queue.enqueue(10);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }

}
