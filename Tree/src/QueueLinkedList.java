public class QueueLinkedList{
    SingleNode head;
    SingleNode tail;
    int size;

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

    //enQueue
    public void enQueue(BinaryNode binaryNode) {
        SingleNode node = new SingleNode();
        node.setBinaryNode(binaryNode);
        node.setNext(null);
        if (head == null) {
            head = tail = node;
            size = 1;
        } else {
            tail.setNext(node);
            tail = node;
            setSize(getSize() + 1);
        }
    }
    public boolean isEmpty()
    {
        if(head==null){
            return true;
        }
        else{
            return false;
        }
    }
    // deQueue
    public BinaryNode deQueue(){
        BinaryNode temp;
        if(isEmpty()){
            return null;
        }
        else{
            temp= (head.getBinaryNode());
            head=head.getNext();
            return temp;
        }
    }

    //create the SingleNode
    public class SingleNode{
        BinaryNode binaryNode;
        SingleNode next;

        public BinaryNode getBinaryNode() {
            return binaryNode;
        }

        public void setBinaryNode(BinaryNode binaryNode) {
            this.binaryNode = binaryNode;
        }

        public SingleNode getNext() {
            return next;
        }

        public void setNext(SingleNode next) {
            this.next = next;
        }
    }
}