package tree;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TreeTest {

    // Can successfully instantiate an empty tree
    //Can successfully instantiate a tree with a single root node
    //Can successfully add a left child and right child to a single root node
    //Can successfully return a collection from a preorder traversal
    //Can successfully return a collection from an inorder traversal
    //Can successfully return a collection from a postorder traversal

    /////----- BINARY TREE NODE TEST -------/////////

    @Test
    public void testBinaryTreeNodeDefaultConstructor(){
        BinaryTreeNode binaryTreeNode = new BinaryTreeNode();
        assertEquals(0,binaryTreeNode.getValue());
        assertNull(binaryTreeNode.getLeftChild());
        assertNull(binaryTreeNode.getRightChild());
    }

    @Test
    public void testBinaryTreeNodeConstructor(){
        BinaryTreeNode binaryTreeNode = new BinaryTreeNode(22);
        assertEquals(22,binaryTreeNode.getValue());

        BinaryTreeNode binaryTreeNode1 = new BinaryTreeNode(23);
        assertEquals(23,binaryTreeNode1.getValue());

        BinaryTreeNode binaryTreeNode2 = new BinaryTreeNode(21,binaryTreeNode,binaryTreeNode1);
        assertEquals(21,binaryTreeNode2.getValue());
        assertEquals(22,binaryTreeNode2.getLeftChild().getValue());
        assertEquals(23,binaryTreeNode2.getRightChild().getValue());
    }

    @Test
    public void testBinaryTreeNodeAddChildren(){
        BinaryTreeNode binaryTreeNode = new BinaryTreeNode(10);
        binaryTreeNode.setLeftChild(new BinaryTreeNode(9));
        binaryTreeNode.setRightChild(new BinaryTreeNode(11));

        assertEquals(10,binaryTreeNode.getValue());
        assertEquals(9,binaryTreeNode.getLeftChild().getValue());
        assertEquals(11,binaryTreeNode.getRightChild().getValue());

    }


    /////----- BINARY TREE TEST -------/////////

    @Test
    public void testBinaryTreeDefaultConstructor(){
        Tree.BinaryTree binaryTree = new Tree.BinaryTree();
        assertEquals(null,binaryTree.getRoot());
    }

    @Test
    public void testBinaryTreeConstructor(){
        BinaryTreeNode binaryTreeNode = new BinaryTreeNode(10);
        Tree.BinaryTree binarySearchTree = new Tree.BinaryTree(binaryTreeNode);
        assertEquals(10,binarySearchTree.getRoot().getValue());
    }

    ///////////----- TESTS on DEPTH FIRST TRAVERSALS ----/////////

    private Tree.BinaryTree initializeBTree(){
        BinaryTreeNode binaryTreeNode = new BinaryTreeNode(4);
        binaryTreeNode.setLeftChild(new BinaryTreeNode(2));
        binaryTreeNode.setRightChild(new BinaryTreeNode(6));

        Tree.BinaryTree binaryTree = new Tree.BinaryTree(binaryTreeNode);

        binaryTree.getRoot().getLeftChild().setLeftChild(new BinaryTreeNode(1));
        binaryTree.getRoot().getLeftChild().setRightChild(new BinaryTreeNode(3));
        binaryTree.getRoot().getRightChild().setLeftChild(new BinaryTreeNode(5));
        binaryTree.getRoot().getRightChild().setRightChild(new BinaryTreeNode(7));
        return binaryTree;
    }

    @Test
    public void testBinaryTreePreOrder(){
        Tree.BinaryTree binaryTree = initializeBTree();
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(4); expected.add(2); expected.add(1); expected.add(3);
        expected.add(6); expected.add(5); expected.add(7);

        //expected: 4,2,1,3,6,5,7
        assertEquals(expected,binaryTree.preOrder());

    }

    @Test
    public void testBinaryTreeInOrder(){
        Tree.BinaryTree binaryTree = initializeBTree();
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1); expected.add(2); expected.add(3); expected.add(4);
        expected.add(5); expected.add(6); expected.add(7);
        //expected: 1,2,3,4,5,6,7
        assertEquals(expected, binaryTree.inOrder());
    }


    @Test
    public void testBinaryTreePostOrder(){
        Tree.BinaryTree binaryTree = initializeBTree();
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1); expected.add(3); expected.add(2);
        expected.add(5); expected.add(7); expected.add(6); expected.add(4);

        //expected: 1,3,2,5,7,6,4
        assertEquals(expected, binaryTree.postOrder());

    }


    /////----- BINARY SEARCH TREE TEST -------/////////

    @Test
    public void testBinarySearchTreeDefaultConstructor(){ // initialize empty tree test
        Tree.BinarySearchTree binarySearchTree = new Tree.BinarySearchTree();
        assertEquals(null,binarySearchTree.getRoot());
    }

    @Test
    public void testBinarySearchTreeConstructor(){
        BinaryTreeNode binaryTreeNode = new BinaryTreeNode(10);
        Tree.BinarySearchTree binarySearchTree = new Tree.BinarySearchTree(binaryTreeNode);
        assertEquals(10,binarySearchTree.getRoot().getValue());
    }

    @Test
    public void testBinarySearchTreeAddNewValueToEmptyTree(){
        Tree.BinarySearchTree binarySearchTree = new Tree.BinarySearchTree();
        binarySearchTree.insertValue(10);
        assertEquals(10,binarySearchTree.getRoot().getValue());
    }

    @Test
    public void testBinarySearchTreeAddNewValue(){
        Tree.BinarySearchTree binarySearchTree = initializeBST();

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1); expected.add(2); expected.add(3); expected.add(4);
        expected.add(5); expected.add(6); expected.add(7);

        //expected: 1,2,3,4,5,6,7
        assertEquals(expected,binarySearchTree.inOrder());

    }

    @Test
    public void testBinarySearchTreeContainsValue(){
        Tree.BinarySearchTree binarySearchTree = initializeBST();


    }

    private Tree.BinarySearchTree initializeBST(){
        Tree.BinarySearchTree binarySearchTree = new Tree.BinarySearchTree();
        binarySearchTree.insertValue(4);
        binarySearchTree.insertValue(6);
        binarySearchTree.insertValue(7);
        binarySearchTree.insertValue(5);
        binarySearchTree.insertValue(2);
        binarySearchTree.insertValue(1);
        binarySearchTree.insertValue(3);
        return  binarySearchTree;
    }

}
