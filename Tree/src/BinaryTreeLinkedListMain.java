public class BinaryTreeLinkedListMain {
    public static void main(String[] args) {
        BinaryTreeLinkedList tree=new BinaryTreeLinkedList();
        tree.insertBinaryNode(20);
        tree.insertBinaryNode(100);
        tree.insertBinaryNode(3);
        tree.insertBinaryNode(50);
        tree.insertBinaryNode(15);
        tree.insertBinaryNode(250);
        tree.insertBinaryNode(35);
        tree.insertBinaryNode(222);

        tree.levelOrderTraversal();
        System.out.println();
        tree.searchBinaryNode(15);
        System.out.println();
        tree.delete(100);
        tree.levelOrderTraversal();
    }
}
