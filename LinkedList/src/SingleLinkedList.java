public class SingleLinkedList {
    private SingleNode head;
    private SingleNode tail;
    private int size;// denotes size of list

    //create a single linked list
    public SingleNode createSingleLinkedList(int nodeValue) {
        head = new SingleNode();
        SingleNode node = new SingleNode();
        node.setValue(nodeValue);
        node.setNext(null);
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public SingleNode getHead() {
        return head;
    }

    public void setHead(SingleNode head) {
        this.head = head;
    }

    public SingleNode getTail() {
        return tail;
    }

    public void setTail(SingleNode tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //check if the linked list is valid
    public boolean isValid() {
        if (head == null) {
            return false;
        } else {
            return true;
        }
    }

    //insert in a single linked list
    public void insertInSingleLinkedList(int value, int position) {
        SingleNode node = new SingleNode();
        node.setValue(value);
        if (!isValid()) {
            System.out.println("The linked list is not valid");
        } else if (position == 0) {
            node.setNext(head);
            head = node;
        } else if (position >= size) {
            node.setNext(null);
            tail.setNext(node);
            //update the last node address to the new node created
            tail = node;
        } else {
            SingleNode tempNode = new SingleNode();
            tempNode = head;
            int index = 0;
            while (index < position - 1) {
                tempNode = tempNode.getNext();
                index++;
            }
            SingleNode nextNode = tempNode.getNext();
            tempNode.setNext(node);
            node.setNext(nextNode);
        }
        setSize(getSize()+1);
    }


    //
    public void traverseLinkedList(){
        if(isValid()) {
            SingleNode temp = head;
            int index = 0;
            while (index != getSize()) {
                System.out.print(temp.getValue());
                if(index!=getSize()-1){
                    System.out.print("->");
                }
                index++;
                temp = temp.getNext();
            }
        }
        else{
            System.out.println("The linked list is invalid");
        }

        System.out.println();
    }

    public void getHeadValue(){
        int value=head.getValue();
        System.out.println("The value of the head is "+value);
    }

    public void getHeadNext(){
        SingleNode next=head.getNext();
        System.out.println("The value of the head next "+next);
    }

    public void getTailValue(){
        int value=tail.getValue();
        System.out.println("The value of the tail is "+value);
    }

    public void getTailNext(){
        SingleNode next=tail.getNext();
        System.out.println("The value of the tail next "+next);
    }

    //print 50 is located at node number 5
    public void searchLinkedList(int nodeValue){
       if(isValid()){
           SingleNode temp=head;
           for(int i=0;i<getSize();i++){
               if(temp.getValue()==nodeValue){
                   System.out.println("The value is found at node "+i);
                   break;
               }
               temp=temp.getNext();
           }
       }
       else{
           System.out.println("not found");
       }
    }
    public void deleteNodeInLinkedList(int location){
        if(!isValid()){
            System.out.println("It does not exist");
        }
        else if(location==0){
            head=head.getNext();
            setSize(getSize()-1);
            if(getSize()==0){
                tail=head;
            }
        }
        else if(location>=getSize()){
            SingleNode tempNode=head;
            for(int i=0;i<getSize()-1;i++){
                tempNode=tempNode.getNext();
            }
            if(tempNode==head){
                tail=head=null;
                setSize(getSize()-1);
            }
            tempNode.setNext(null);
            tail=tempNode;
            setSize(getSize()-1);
        }
        else{
            SingleNode tempNode=head;
            for(int i=0;i<location-1;i++){
                tempNode=tempNode.getNext();
            }
            tempNode.setNext(tempNode.getNext().getNext());
        }
    }
}