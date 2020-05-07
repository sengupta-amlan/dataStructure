public class StackArray {
    int[] arr;
    int top;

    public StackArray(int size){
        this.arr=new int[size];
        this.top=-1;
        System.out.println("Successfully created a stack of size:"+size);

    }

    public boolean isFull(){
        if(top==arr.length-1){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else {
            return false;
        }
    }

    public void push(int value){
        if(isFull()){
            System.out.println("Operation can't perform");
            return;
        }
        else {
            top++;
            arr[top]=value;
        }
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Operation can't be performed");
        }
        else{
            int val=arr[top];
            top--;
            System.out.println("The value poped is :"+val);
        }
    }

    public void  peek(){
        if(isEmpty()){
            System.out.println("Can't perform");
            return;
        }
        else{
            System.out.println("The number peek is:"+arr[top]);
        }
    }

    public void delete(){
        arr=null;
        System.out.println("stack deleted");
        return;
    }
}
