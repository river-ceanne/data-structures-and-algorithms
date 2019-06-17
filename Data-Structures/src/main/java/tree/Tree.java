package tree;

import java.util.ArrayList;

public class Tree {

    //Create a BinaryTree class
    //Define a method for each of the depth first traversals called preOrder, inOrder, and postOrder which returns an array of the values,
    // ordered appropriately.

    //At no time should an exception or stack trace be shown to the end user.
    // Catch and handle any such exceptions and return a printed value or operation which cleanly represents the state and either
    // stops execution cleanly, or provides the user with clear direction and output.
    //
    //Create a BinarySearchTree class
    //Define a method named add that accepts a value, and adds a new node with that value in the correct location in the binary search tree.
    //Define a method named contains that accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.


    public class BinaryTree{

        private BinaryTreeNode root;

        public BinaryTree(){}

        public BinaryTree(BinaryTreeNode root){
            this.root = root;
        }

        public ArrayList<Integer> preOrder(){
            //(b) Preorder (Root, Left, Right)
            // starts at root

            return new ArrayList<>();
        }

        public ArrayList<Integer> inOrder(){
            //(a) Inorder (Left, Root, Right)
            //starts with left most leaf

            return new ArrayList<>();
        }

        public ArrayList<Integer> postOrder(){
            //(c) Postorder (Left, Right, Root)
            //starts with left most leaf

            return new ArrayList<>();
        }

        public BinaryTreeNode getRoot() {
            return root;
        }

        public void setRoot(BinaryTreeNode root) {
            this.root = root;
        }
    }

    public static class BinarySearchTree{

        private BinaryTreeNode root;

        public BinarySearchTree(){}

        public BinarySearchTree(BinaryTreeNode root) {
            this.root = root;
        }

        public BinaryTreeNode getRoot() {
            return root;
        }

        public void setRoot(BinaryTreeNode root) {
            this.root = root;
        }

        public void insertValue(int value){
            BinaryTreeNode newChildNode = new BinaryTreeNode(value);

            if(root == null){
                this.root = newChildNode;
            }else{
                boolean res = insertToTree(newChildNode,root);
            }

        }

        protected boolean insertToTree(BinaryTreeNode newChildNode, BinaryTreeNode node){

            if(newChildNode.getValue() < node.getValue()){

                if(node.getLeftChild() != null){
                    return insertToTree(newChildNode,node.getLeftChild());
                }else{
                    node.setLeftChild(newChildNode);
                }

            }else if(newChildNode.getValue() > node.getValue()){

                if(node.getRightChild() != null){
                    return insertToTree(newChildNode, node.getRightChild());
                }else{
                    node.setRightChild(newChildNode);
                }

            }

            return true;
        }

        public boolean containsValue(int value){
            return searchTree(value,root);
        }

        protected boolean searchTree(int searchValue, BinaryTreeNode node){

            if(node.getValue() == searchValue){

                return true;

            }else if(searchValue < node.getValue() && node.getLeftChild() != null){

                return searchTree(searchValue, node.getLeftChild());

            }else if(searchValue > node.getValue() && node.getRightChild() != null){

                return searchTree(searchValue, node.getRightChild());
            }

            return false;
        }


    }


}
