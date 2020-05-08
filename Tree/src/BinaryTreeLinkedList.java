public class BinaryTreeLinkedList {
    BinaryNode root;

    public BinaryTreeLinkedList() {
        this.root = null;
    }

    //preOder
    void preOrder(BinaryNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getValue() + " ");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    //inOrder
    void inOrder(BinaryNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.getLeft());
        System.out.print(root.getValue() + " ");
        inOrder(root.getRight());
    }

    //postOrder
    void postOrder(BinaryNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getValue() + " ");
    }

    //level OderTraversal
    void levelOrderTraversal() {

        QueueLinkedList queue = new QueueLinkedList();
        queue.enQueue(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.deQueue();
            System.out.println(presentNode.getValue() + " ");
            if (presentNode.getLeft() != null) {
                queue.enQueue(presentNode.left);
            }
            if (presentNode.getRight() != null) {
                queue.enQueue(presentNode.right);
            }
        }
    }

    //insert a binaryNode to create the tree

    public void insertBinaryNode(int nodeValue) {
        BinaryNode node = new BinaryNode();
        node.setValue(nodeValue);
        if (root == null) {
            root = node;
            System.out.println("Root successfully inserted");
            return;
        } else {
            QueueLinkedList queue = new QueueLinkedList();
            queue.enQueue(root);
            while (!queue.isEmpty()) {
                BinaryNode presentNode = queue.deQueue();
                if (presentNode.getLeft() == null) {
                    presentNode.setLeft(node);
                    System.out.println("Successfully inserted new node !");
                    break;
                } else if (presentNode.getRight() == null) {
                    presentNode.setRight(node);
                    System.out.println("Successfully inserted new node !");
                    break;
                } else {
                    queue.enQueue(presentNode.getLeft());
                    queue.enQueue(presentNode.getRight());
                }
            }
        }
    }

    public void searchBinaryNode(int nodeValue){
        boolean flag=false;
        BinaryNode binaryNode=new BinaryNode();
        QueueLinkedList queue=new QueueLinkedList();
        queue.enQueue(root);
        while(!queue.isEmpty()){
            binaryNode=queue.deQueue();
            if(binaryNode.getValue()==nodeValue){
                flag=true;
            }
            else{
                if(binaryNode.getLeft()!=null){
                    queue.enQueue(binaryNode.getLeft());
                }
                else if(binaryNode.getRight()!=null){
                    queue.enQueue(binaryNode.getRight());
                }
            }
        }
        if(flag){
            System.out.println("Value found");
        }
        else{
            System.out.println("Value not found");
        }
    }
    //deepest node int value
    public BinaryNode getDeepestNode(){
        QueueLinkedList queue=new QueueLinkedList();
        BinaryNode presentNode=null;
        queue.enQueue(root);
        while(!queue.isEmpty()){
            presentNode=queue.deQueue();
            if(presentNode.getLeft()!=null){
                queue.enQueue(presentNode.getLeft());
            }
            else if(presentNode.getRight()!=null){
                queue.enQueue(presentNode.getRight());
            }
        }
        return presentNode;
    }

    //delete a value from the tree
    public void delete(int nodeValue){
        QueueLinkedList queue=new QueueLinkedList();
        queue.enQueue(root);

        while (!queue.isEmpty()){
            BinaryNode present=queue.deQueue();

            if(present.getValue()==nodeValue){
                present.setValue(getDeepestNode().getValue());
                deleteDeepestNode();
            }
            else{
                if(present.getLeft()!=null){
                    queue.enQueue(present.getLeft());
                }
                if(present.getRight()!=null){
                    queue.enQueue(present.getRight());
                }
            }
        }
        System.out.println("Did not find the node");
    }


    //IMPORTANT DELETE DEEPEST NODE
    public void deleteDeepestNode() {
        QueueLinkedList queue = new QueueLinkedList();
        queue.enQueue(root);
        BinaryNode previousNode, presentNode = null;
        while (!queue.isEmpty()) {
            previousNode = presentNode;
            presentNode = queue.deQueue();
            if (presentNode.getLeft() == null) {
                previousNode.setRight(null);
                return;
            } else if ((presentNode.getRight() == null)) {
                presentNode.setLeft(null);
                return;
            }
            queue.enQueue(presentNode.getLeft());
            queue.enQueue(presentNode.getRight());
        }
    }

}
