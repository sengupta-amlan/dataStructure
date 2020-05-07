public class LinkedListQueue {
    SingleLinkedList queue;

    public LinkedListQueue(){
       queue=new SingleLinkedList();
    }

    public void enQueue(int val){
        SingleLinkedList.SingleNode temp=new SingleLinkedList.SingleNode();
        if(temp==null){
            System.out.println("It is full");
        }
        else{
            temp.setNodeValue(val);
            temp.setNext(null);
            if(queue.getRear()==null){
                queue.setFront(temp);
            }
            else{
                queue.getRear().setNext(temp);
            }
            queue.setRear(temp);
        }
    }

    public void dequeue(){
        if(queue.getFront()==null){
            System.out.println("Queue is empty");
        }
        else{
            SingleLinkedList.SingleNode tempNode=queue.getFront();
            queue.setFront(queue.getFront().getNext());
            int x=tempNode.getNodeValue();
            System.out.println("The value dequeued is"+x);
        }
    }
}
