package tree;

public class BinaryTreeNode {

    private Object value;
    private BinaryTreeNode leftChild;
    private BinaryTreeNode rightChild;

    public BinaryTreeNode(){}

    public BinaryTreeNode(int value, BinaryTreeNode leftChild, BinaryTreeNode rightChild){
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public BinaryTreeNode(int value){
        this.value = value;
    }


    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public BinaryTreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinaryTreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public BinaryTreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinaryTreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
