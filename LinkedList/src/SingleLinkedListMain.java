public class SingleLinkedListMain {

    public static void main(String[] args) {

       SingleLinkedList list=new SingleLinkedList();
       list.createSingleLinkedList(10);

       list.insertInSingleLinkedList(20,1);
       list.insertInSingleLinkedList(30,2);
       list.insertInSingleLinkedList(40,3);
       list.insertInSingleLinkedList(50,3);

       list.traverseLinkedList();

//       list.getHeadValue();
//       list.getHeadNext();
//       list.getTailValue();
//       list.getTailNext();

       list.searchLinkedList(20);
    }
}
