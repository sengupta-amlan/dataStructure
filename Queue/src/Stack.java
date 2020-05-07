public class Stack {
    private int arr[];
    private int top=-1;

    public int getSize(){
        return arr.length;
    }


    public Stack(int size){
        arr=new int[size];
    }

    public void push(int val){
        if(isFull()){
            System.out.println("Can't enter a number as the stack is full.");
        }
        else{
            top++;
            arr[top]=val;
            System.out.println("The element pushed is :"+arr[top]);
        }
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("The array is empty so we can't remove an element");

        }
        else{
            int x=arr[top];
            arr[top]=Integer.MIN_VALUE;
            top--;
            System.out.println("The element pop is :"+x);
        }
    }

    public int popInt(){
        if(isEmpty()){
            return Integer.MIN_VALUE;

        }
        else{
            int x=arr[top];
            arr[top]=Integer.MIN_VALUE;
            top--;
            return x;
        }
    }

    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFull(){
        if(top==arr.length-1){
            return true;
        }
        else{
            return false;
        }
    }
}
