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
            return new ArrayList<>();
        }

        public ArrayList<Integer> inOrder(){
            return new ArrayList<>();
        }

        public ArrayList<Integer> postOrder(){
            return new ArrayList<>();
        }

        public BinaryTreeNode getRoot() {
            return root;
        }

        public void setRoot(BinaryTreeNode root) {
            this.root = root;
        }
    }

    public class BinarySearchTree{

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

        public void insertToTree(int value){
            BinaryTreeNode newChildNode = new BinaryTreeNode(value);
        }


    }


}
