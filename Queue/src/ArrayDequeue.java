public class ArrayDequeue {
    private int front=-1;
    private int rear=-1;
    private int[] arr;

    public ArrayDequeue(int size){
        arr=new int[size];
    }

    public boolean isFull(){
        if(rear==arr.length-1){
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

    public void enQueue(int val){
        if(isFull()){
            System.out.println("Can't add anything");
        }
        else{
            rear++;
            arr[rear]=val;
        }
    }

    public void enqueueFront(int val){
        if(isFull() && front==-1){
            System.out.println("Can't add anything");
        }
        else{
            arr[front]=val;
            front--;
        }
    }

    public void deQueue(){
        if(isEmpty()){
            System.out.println("Can't remove anything");
        }
        else{
            front++;
            int val=arr[front];
            System.out.println("The value is removed from the queue "+val);
            arr[front]=Integer.MIN_VALUE;
        }
    }

    public void deQueueRear(){
        if(isEmpty() && rear>=0){
            System.out.println("Can't remove anything");
        }
        else{
            int val=arr[rear];
            System.out.println("The value that is removed is:"+val);
            arr[rear]=Integer.MIN_VALUE;
            rear--;
        }
    }
}
