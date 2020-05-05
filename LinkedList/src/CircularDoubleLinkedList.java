public class CircularDoubleLinkedList {
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

    public void createCDLL(int nodeValue){
        DoubleNode node=new DoubleNode();
        node.setNodeValue(nodeValue);
        node.setPrev(null);
        node.setNext(null);
        head=tail=node;
        size=1;
        return;
    }

    public boolean isValid(){
        if(head==null){
            return false;
        }
        else {
            return true;
        }
    }

    public void insertCDLL(int nodeValue,int position){
        DoubleNode node=new DoubleNode();
        node.setNodeValue(nodeValue);
        if(!isValid()){
            System.out.println("the linked list is not valid");
            return;
        }
        else if(position==0){
            node.setPrev(tail);
            node.setNext(head);
            tail.setNext(node);
            head.setPrev(node);
            head=node;
        }
        else if(position>=getSize()){
            node.setPrev(tail);
            node.setNext(head);
            head.setPrev(node);
            tail.setNext(node);
            tail=node;
        }
        else{
            DoubleNode temp=head;
            for(int i=0;i<position-1;i++){
                temp=temp.getNext();
            }
            node.setPrev(temp);
            node.setNext(temp.getNext());
            node.getNext().setPrev(node);
            temp.setNext(node);
        }
        size++;
    }

    public void traverseCDLL(){
        if(!isValid()){
            System.out.println("The linked list is not valid");
        }
        else{
            int index=0;
            DoubleNode temp=head;
            while(index!=getSize()){
                System.out.print(temp.getNodeValue());
                temp=temp.getNext();
                if(index!=getSize()-1){
                    System.out.print("->");
                }
                index++;
            }
        }
    }

    public void deleteCDLL(int position){
        if(!isValid()){
            System.out.println("The linked list is not valid");
        }
        else{
            if(position==0){
                head=head.getNext();
                tail.setNext(head);
                head.setPrev(tail);
                size--;
                if(size==0) {
                    head.setPrev(null);
                    head.setNext(null);
                    head = tail = null;
                }
            }
            else if(position>=getSize()){
                tail=tail.getPrev();
                head.setPrev(tail);
                tail.setNext(head);
                size--;
                if(size==0){
                    tail.setNext(null);
                    tail.setPrev(null);
                    head=tail=null;
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
}
