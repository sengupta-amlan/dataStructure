public class BinarySearchTreeMain {
    public static void main(String[] args) {
        BinarySearchTreeLinkedList bst=new BinarySearchTreeLinkedList();
        bst.insert(10);
        bst.insert(20);
        bst.insert(30);
        bst.insert(40);
        bst.insert(50);
        bst.levelOrderTraversal();
    }
}
