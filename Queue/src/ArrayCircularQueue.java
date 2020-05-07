public class ArrayCircularQueue {
    private int front=0;
    private int rear=0;
    private int queue[];

    public ArrayCircularQueue(int size) {
        queue = new int[size];
    }
    //rear=(rear+1)%size;
    public boolean isFull(){
        if(((rear+1)%queue.length)==front){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isEmpty(){
        if(front==rear){
            return true;
        }
        else{
            return false;
        }
    }

    public void enQueue(int value){
        if(isFull()){
            System.out.println("Can't insert any value");
        }
        else{
            rear=(rear+1)%queue.length;
            queue[rear]=value;
        }
    }

    public void deQueue(){
        if(isEmpty()){
            System.out.println("Can't remove any value");
        }
        else{
            front=(front+1)%queue.length;
            int val=queue[front];
            System.out.println("The value dequeue is:"+val);
        }
    }
}
