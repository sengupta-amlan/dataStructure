public class StackLinkedList {
    SingleLinkedList list;

    public StackLinkedList(){
        list=new SingleLinkedList();
    }

    //push
    //head variable stores the address of the last item that has been pushed
    public void push(int value){
            SingleLinkedList.SingleNode node=new SingleLinkedList.SingleNode();
            node.setValue(value);
            node.setNext(list.getHead());
            list.setHead(node);
            System.out.println("The value"+value +" has been pushed");
    }
    public boolean isEmpty(){
        if(list.getHead()==null){
            return true;
        }
        else {
            return false;
        }
    }


    public void pop(){
        if(isEmpty()){
            System.out.println("Can't perform");
            return;
        }
        else {
            int val=list.getHead().getValue();
            list.setHead(list.getHead().getNext());
            System.out.println("The value pooped is "+val);
        }
    }
}
