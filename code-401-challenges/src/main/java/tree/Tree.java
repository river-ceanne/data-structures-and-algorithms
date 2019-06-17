package tree;

import java.util.ArrayList;

public class Tree {

    public static class BinaryTree{

        private BinaryTreeNode root;

        public BinaryTree(){}

        public BinaryTree(BinaryTreeNode root){
            this.root = root;
        }

        public ArrayList<Object> preOrder(){
            //(b) Preorder (Root, Left, Right)
            // starts at root
            ArrayList<Object> arr = new ArrayList<>();

            return preOrderTree(arr,root);
        }

        private ArrayList<Object> preOrderTree(ArrayList<Object> arr, BinaryTreeNode node){
            if(node == null) return arr;

            arr.add(node.getValue());

            preOrderTree(arr,node.getLeftChild());

            preOrderTree(arr,node.getRightChild());

            return arr;
        }

        public ArrayList<Object> inOrder(){
            //(a) Inorder (Left, Root, Right)
            //starts with left most leaf(will order values properly tree if BST)
            ArrayList<Object> arr = new ArrayList<>();

            return inOrderTree(arr,root);
        }

        private ArrayList<Object> inOrderTree(ArrayList<Object> arr, BinaryTreeNode node){
            if(node == null) return arr;

            inOrderTree(arr,node.getLeftChild());

            arr.add(node.getValue());

            inOrderTree(arr,node.getRightChild());

            return arr;
        }

        public ArrayList<Object> postOrder(){
            //(c) Postorder (Left, Right, Root)
            //starts with left most leaf
            ArrayList<Object> arr = new ArrayList<>();

            return postOrderTree(arr,root);
        }

        private ArrayList<Object> postOrderTree(ArrayList<Object> arr, BinaryTreeNode node){
            if(node == null) return arr;

            postOrderTree(arr,node.getLeftChild());

            postOrderTree(arr,node.getRightChild());

            arr.add(node.getValue());

            return arr;
        }


        public BinaryTreeNode getRoot() {
            return root;
        }

        public void setRoot(BinaryTreeNode root) {
            this.root = root;
        }
    }



}//end of Tree class
