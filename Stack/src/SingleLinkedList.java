public class SingleLinkedList {
    private SingleNode head;

    public SingleNode getHead() {
        return head;
    }

    public void setHead(SingleNode head) {
        this.head = head;
    }


    public static class SingleNode {
        private int value;
        private SingleNode next;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public SingleNode getNext() {
            return next;
        }

        public void setNext(SingleNode next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return value + " ";
        }
    }
}


