public class DoubleLinkedList {
    private DoubleNode head;
    private DoubleNode tail;
    private int size;

    public DoubleNode getHead() {
        return head;
    }

    public void setHead(DoubleNode head) {
        this.head = head;
    }

    public DoubleNode getTail() {
        return tail;
    }

    public void setTail(DoubleNode tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //create a doubleLinkedList
    public DoubleNode create(int nodeValue){
        DoubleNode node=new DoubleNode();
        node.setNodeValue(nodeValue);
        node.setNext(null);
        node.setPrev(null);
        head=tail=node;
        size=1;
        return head;
    }

    public boolean isValid(){
        if(head==null){
            return false;
        }
        else{
            return true;
        }
    }

    //insert in DoubleLinkedList
    public void insertDoubleLinkedList(int nodeValue,int position){
        DoubleNode node=new DoubleNode();
        node.setNodeValue(nodeValue);
        if(!isValid()){
            System.out.println("The Double Linked List is not valid");
            return;
        }
        else if(position==0){
            node.setPrev(null);
            node.setNext(head);
            head.setPrev(node);
            head=node;
        }
        else if(position>=getSize()){
            node.setNext(null);
            tail.setNext(node);
            node.setPrev(tail);
            tail=node;
        }
        else{
            DoubleNode temp=head;
            int index=0;
            while (index<position-1){
                temp=temp.getNext();
                index++;
            }
            node.setPrev(temp);
            node.setNext(temp.getNext());
            temp.getNext().setPrev(node);
            temp.setNext(node);


        }
        size++;
    }

    void traverseLinkedList() {
        if(isValid()) {
            //System.out.println("Linked List now: ");
            DoubleNode tempNode=head;
            for(int i =0; i<size;i++) {

                System.out.print(tempNode.getNodeValue());
                if(i!=size-1) {
                    System.out.print(" -> ");
                }
                tempNode=tempNode.getNext();
            }
        }else {
            System.out.println("Linked List does not exists");
        }
        System.out.println("\n");
    }

    void traverseReverseLinkedList(){
        if(isValid()){
            DoubleNode temp=tail;
            for(int i=0;i<size;i++){
                System.out.print(temp.getNodeValue());
                if(i!=size-1){
                    System.out.print("->");
                }
                temp=temp.getPrev();
            }
        }
        else{
            System.out.println("Linked List does not exist");
        }
    }
    //searching in linked list
    void searchLinkedList(int nodeValue){
        if(isValid()){
            DoubleNode temp=head;
            int index=0;
            while(index<getSize()){
                if(temp.getNodeValue()==nodeValue){
                    System.out.print("The value is found at index "+index);
                    break;
                }
                else {
                    index++;
                    temp=temp.getNext();
                    if(index==size){
                        System.out.println("The value is not found");
                    }
                }
            }

        }
        else{
            System.out.println("The list is invalid");
        }
    }


    //delete a node from linked list
    public void deleteNode(int position){
        if(!isValid()){
            System.out.println("The list is invalid");
            return;
        }
        else if(position==0){
            head=head.getNext();
            head.setPrev(null);
            size--;
            if(getSize()==0){
                head=tail=null;
                head.setNext(null);
            }
        }
        else if(position>=getSize()){
            tail=tail.getPrev();
            tail.setNext(null);
            size--;
            if(getSize()==0){
                head=tail=null;
                tail.setPrev(null);
            }
        }
        else{
            DoubleNode temp=head;
            for(int i=0;i<position-1;i++){
                temp=temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
            temp.getNext().setPrev(temp);
            size--;
        }
    }
}
