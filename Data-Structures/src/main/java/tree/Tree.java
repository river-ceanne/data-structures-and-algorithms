package tree;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;

public class Tree {

    public static class BinaryTree{

        private BinaryTreeNode root;

        public BinaryTree(){}

        public BinaryTree(BinaryTreeNode root){
            this.root = root;
        }

        public ArrayList<Integer> preOrder(){
            //(b) Preorder (Root, Left, Right)
            // starts at root
            ArrayList<Integer> arr = new ArrayList<>();

            return preOrderTree(arr,root);
        }

        private ArrayList<Integer> preOrderTree(ArrayList<Integer> arr, BinaryTreeNode node){
            if(node == null) return arr;

            arr.add(node.getValue());

            preOrderTree(arr,node.getLeftChild());

            preOrderTree(arr,node.getRightChild());

            return arr;
        }

        public ArrayList<Integer> inOrder(){
            //(a) Inorder (Left, Root, Right)
            //starts with left most leaf(will order values properly tree if BST)
            ArrayList<Integer> arr = new ArrayList<>();

            return inOrderTree(arr,root);
        }

        private ArrayList<Integer> inOrderTree(ArrayList<Integer> arr, BinaryTreeNode node){
            if(node == null) return arr;

            inOrderTree(arr,node.getLeftChild());

            arr.add(node.getValue());

            inOrderTree(arr,node.getRightChild());

            return arr;
        }

        public ArrayList<Integer> postOrder(){
            //(c) Postorder (Left, Right, Root)
            //starts with left most leaf
            ArrayList<Integer> arr = new ArrayList<>();

            return postOrderTree(arr,root);
        }

        private ArrayList<Integer> postOrderTree(ArrayList<Integer> arr, BinaryTreeNode node){
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
                }

                node.setLeftChild(newChildNode);

            }else if(newChildNode.getValue() > node.getValue()){

                if(node.getRightChild() != null){
                    return insertToTree(newChildNode, node.getRightChild());
                }

                node.setRightChild(newChildNode);

            }

            return true;
        }

        public boolean containsValue(int value){
            return searchTree(value,root);
        }

        protected boolean searchTree(int searchValue, BinaryTreeNode node){

            if(node.getValue() == searchValue){

                return true;

            }

            if(searchValue < node.getValue() && node.getLeftChild() != null){

                return searchTree(searchValue, node.getLeftChild());

            }

            if(searchValue > node.getValue() && node.getRightChild() != null){

                return searchTree(searchValue, node.getRightChild());
            }

            return false;
        }

        public ArrayList<Integer> inOrder(){
            //(a) Inorder (Left, Root, Right)
            //starts with left most leaf(will order values properly tree if BST)
            ArrayList<Integer> arr = new ArrayList<>();

            return inOrderTree(arr,root);
        }

        private ArrayList<Integer> inOrderTree(ArrayList<Integer> arr, BinaryTreeNode node){
            if(node == null) return arr;

            inOrderTree(arr,node.getLeftChild());

            arr.add(node.getValue());

            inOrderTree(arr,node.getRightChild());

            return arr;
        }


    }//End of BST class


}//end of Tree class
