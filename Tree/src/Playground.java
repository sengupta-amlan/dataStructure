public class Playground {
    public static void main(String[] args)
    {
        System.out.println("Hello");
    }
}
//    // Helper Method
//    private BinaryNode leftRotate(BinaryNode currentNode) {
//        BinaryNode newRoot = currentNode.getRight();
//        currentNode.setRight(currentNode.getRight().getLeft());
//        newRoot.setLeft(currentNode);
//        currentNode.setHeight(calculateHeight(currentNode));
//        newRoot.setHeight(calculateHeight(newRoot));
//        return newRoot;
//    }// end of method
//
//
//    // Helper Method
//    private BinaryNode rightRotate(BinaryNode currentNode) {
//        BinaryNode newRoot = currentNode.getLeft();
//        currentNode.setLeft(currentNode.getLeft().getRight());
//        newRoot.setRight(currentNode);
//        currentNode.setHeight(calculateHeight(currentNode));
//        newRoot.setHeight(calculateHeight(newRoot));
//        return newRoot;
//    }// end of method
//
//}
