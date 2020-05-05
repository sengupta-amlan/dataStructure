public class SingleCircularLinkedListMain {
    public static void main(String[] args) {
        SingleCircularLinkedList list=new SingleCircularLinkedList();
        list.create(10);

        list.insert(1,20);
        list.insert(2,30);
        list.insert(3,40);

        list.traverseLinkedList();
        list.deleteNode(2);
        System.out.println();
        list.traverseLinkedList();
    }
}
