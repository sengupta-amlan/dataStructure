public class ArrayLinearQueue {
    private int[] arr;
    private int front=-1;
    private int rear=-1;


    public ArrayLinearQueue(int size){
        arr=new int[size];
    }

    public void enqueue(int value){
        if(isFull()){
            System.out.println("Can't add the queue is full");
        }
        else{
            rear++;
            arr[rear]=value;
        }
    }


    public void dequeue(){
        if(isEmpty()){
            System.out.println("Can't dequeue as there is no element");
        }
        else{
            front++;
            int val=arr[front];
            System.out.println("The value dequeue is" +val);
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

    public boolean isFull(){
        if(rear==arr.length-1){
            return true;
        }
        else{
            return false;
        }
    }
}
