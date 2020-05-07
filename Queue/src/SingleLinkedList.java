public class SingleLinkedList {

    private SingleNode front;
    private SingleNode rear;
    private int size;

    public SingleNode getFront() {
        return front;
    }

    public void setFront(SingleNode front) {
        this.front = front;
    }

    public SingleNode getRear() {
        return rear;
    }

    public void setRear(SingleNode rear) {
        this.rear = rear;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static class SingleNode{
        private int nodeValue;
        private SingleNode next;

        public int getNodeValue() {
            return nodeValue;
        }

        public void setNodeValue(int nodeValue) {
            this.nodeValue = nodeValue;
        }

        public SingleNode getNext() {
            return next;
        }

        public void setNext(SingleNode next) {
            this.next = next;
        }
    }
}
