public class SingleCircularLinkedList {
    private SingleNode head;
    private SingleNode tail;
    private int size;

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

    public SingleNode create(int nodeValue) {
        SingleNode node = new SingleNode();
        node.setValue(nodeValue);
        node.setNext(node);
        tail = head = node;
        size = 1;
        return head;
    }

    public boolean isValid() {
        if (head == null) {
            return false;
        } else {
            return true;
        }
    }

    public void insert(int position, int nodeValue) {
        SingleNode node = new SingleNode();
        node.setValue(nodeValue);
        if (!isValid()) {
            System.out.println("The linked list is not valid");
            return;
        } else if (position == 0) {
            node.setNext(head);
            head = node;
            tail.setNext(head);
        } else if (position >= getSize()) {
            tail.setNext(node);
            tail = node;
            tail.setNext(head);
        } else {
            int index = 0;
            SingleNode tempNode = head;
            while (index < position - 1) {
                tempNode = tempNode.getNext();
                index++;
            }
            node.setNext(tempNode.getNext());
            tempNode.setNext(node);
        }
        size++;
    }

    public void traverseLinkedList() {
        SingleNode temp = head;
        if (!isValid()) {
            return;
        } else {
            int index = 0;
            while (index <= getSize()) {
                System.out.print(temp.getValue());
                if (index != getSize()) {
                    System.out.print("->");
                }
                index++;
                temp = temp.getNext();
            }
        }
    }
    //search given value in linkedList
    public void searchNodeValue(int nodeValue){
        System.out.println();
        SingleNode temp=head;

        if(!isValid()){
            System.out.println("The linked list is not valid");
        }
        else{
            int index=0;
            while(index!=getSize()) {
                if (temp.getValue() == nodeValue) {
                    System.out.println("The node is found at positon " + index);
                    return;
                } else {
                    index++;
                    temp = temp.getNext();
                }
            }
            System.out.println("The value is not found");
        }
    }

    //delete from a position
    public void deleteNode(int position){
        if(!isValid()){
            System.out.println("The linked list is not valid");
            return;
        }
        else if(position==0){
            head=head.getNext();
            tail.setNext(head);
            size--;
            if(getSize()==0){
                head.setNext(null);
                head=tail=null;
            }
        }
        else if(position>=getSize()){
            int index=0;
            SingleNode temp=head;
            while(index<getSize()-1){
                temp=temp.getNext();
            }
            temp.setNext(head);
            tail=temp;
            size--;
            if(getSize()==0){
                tail.setNext(null);
                head=tail=null;
            }
        }
        else{
            SingleNode temp=head;
            for(int index=0;index<position;index++){
                temp=temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
            size--;
        }
    }
}