public class DoubleLinkedListMain {
    public static void main(String[] args) {
        DoubleLinkedList list=new DoubleLinkedList();
        list.create(10);
        list.insertDoubleLinkedList(20,1);
        list.insertDoubleLinkedList(30,2);
        list.insertDoubleLinkedList(40,3);
        list.insertDoubleLinkedList(50,4);
        list.traverseLinkedList();
        System.out.println();
        list.traverseReverseLinkedList();
        System.out.println();
        list.searchLinkedList(50);
        System.out.println();
        list.deleteNode(2);
        list.traverseLinkedList();
    }
}
