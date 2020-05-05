public class CircularDoubleLinkedListMain {
    public static void main(String[] args) {
        CircularDoubleLinkedList list=new CircularDoubleLinkedList();
        list.createCDLL(10);
        list.insertCDLL(20,1);
        list.insertCDLL(30,2);
        list.insertCDLL(40,3);
        list.insertCDLL(50,4);
        System.out.println();
        list.traverseCDLL();
        list.insertCDLL(60,3);
        System.out.println();
        list.traverseCDLL();
        list.deleteCDLL(2);
        System.out.println( );
        list.traverseCDLL();
    }
}
