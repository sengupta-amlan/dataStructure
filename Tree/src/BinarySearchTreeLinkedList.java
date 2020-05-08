public class BinarySearchTreeLinkedList {
    BinaryNode root;

    BinarySearchTreeLinkedList(){
        root=null;
    }

    void insert(int value){
        root=insert(root,value);
    }

    //create a new blank node
    public BinaryNode createNewNode(int value){
        BinaryNode node=new BinaryNode();
        node.setValue(value);
        return node;
    }

    //helper function
    public BinaryNode insert(BinaryNode currentNode,int value){
        if(currentNode==null){
            return createNewNode(value);
        }
        else if(value<=currentNode.getValue()){
            currentNode.setLeft(insert(currentNode.getLeft(),value));
            return currentNode;
        }
        else{
            currentNode.setRight(insert(currentNode.getRight(),value));
            return currentNode;
        }
    }

    //traversal LEVEL ORDER
    public void levelOrderTraversal(){
        if(root==null){
            System.out.println("Tree not exist");
            return;
        }
        else{
            QueueLinkedList queue=new QueueLinkedList();
            queue.enQueue(root);
            BinaryNode currentNode=null;
            while (!queue.isEmpty()){
                currentNode=queue.deQueue();
                System.out.print(currentNode.getValue()+" ");
                if(currentNode.getLeft()!=null){
                    queue.enQueue(currentNode.getLeft());
                }
                else if(currentNode.getRight()!=null){
                    queue.enQueue(currentNode.getRight());
                }
            }
        }
    }
    public void deleteNodeOfBST(int value) {
        System.out.println("\n\nDeleting " + value + " from BST...");
        deleteNodeOfBST(root,value);
    }
    //deletion
    public BinaryNode deleteNodeOfBST(BinaryNode root,int value){
        if(root==null){
            System.out.println("Not found");
            return null;
        }
        if(value<root.getValue()){
            root.setLeft(deleteNodeOfBST(root.getLeft(),value));
        }
        else if(value>root.getValue()){
            root.setRight(deleteNodeOfBST(root.getRight(),value));
        }
        else {
            //if the node to be deleted has two child
            if(root.getLeft()!=null && root.getRight()!=null){
                BinaryNode temp=root;
                BinaryNode successorNode=minimumElement(temp.getRight());
                root.setValue(successorNode.getValue());
                root.setRight(deleteNodeOfBST(root.getRight(),successorNode.getValue()));
            }
            else if(root.getLeft()!=null){
                root=root.getLeft();
            }
            else if(root.getRight()!=null){
                root=root.getRight();
            }
            else{
                root=null;
            }
        }
        return root;
    }


    //getting the minimum element in the BST
    public static BinaryNode minimumElement(BinaryNode root){
        if(root.getLeft()==null){
            return root;
        }
        else{
            return minimumElement(root.getLeft());
        }
    }
}
