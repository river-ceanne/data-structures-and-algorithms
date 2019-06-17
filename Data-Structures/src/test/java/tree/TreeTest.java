package tree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

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


    }

    @Test
    public void testBinaryTreeConstructor(){


    }

    @Test
    public void testBinaryTreePreOrder(){

    }


    @Test
    public void testBinaryTreeInOrder(){

    }


    @Test
    public void testBinaryTreePostOrder(){

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


    }

    @Test
    public void testBinarySearchTreeContainsValue(){


    }

}
