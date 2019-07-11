package code.challenges;

import org.junit.Test;
import tree.BinaryTreeNode;
import tree.Tree;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class TreeIntersectionTest {


    @Test
    public void testTreeIntersection(){

        HashSet res = TreeIntersection.treeIntersection(initialize1Tree().getRoot(),initialize2Tree().getRoot());

        HashSet expected = new HashSet();
        expected.add(1);
        expected.add(3);
        expected.add(4);
        expected.add(6);
        assertEquals(expected, res);

    }

    @Test
    public void testTreeIntersectionEmpty(){

        Tree.BinaryTree binaryTree1 = new Tree.BinaryTree();
        Tree.BinaryTree binaryTree2 = new Tree.BinaryTree();
        HashSet res = TreeIntersection.treeIntersection(binaryTree1.getRoot(),binaryTree2.getRoot());

        HashSet expected = new HashSet();
        assertEquals(expected, res);

    }

    @Test
    public void testTreeIntersectionNoCommon(){

        HashSet res = TreeIntersection.treeIntersection(initialize1Tree().getRoot(),initialize3Tree().getRoot());

        HashSet expected = new HashSet();
        assertEquals(expected, res);

    }


    private static Tree.BinaryTree initialize1Tree(){
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

    private static Tree.BinaryTree initialize2Tree(){
        BinaryTreeNode binaryTreeNode = new BinaryTreeNode(4);////
        binaryTreeNode.setLeftChild(new BinaryTreeNode(1));///
        binaryTreeNode.setRightChild(new BinaryTreeNode(6));////

        Tree.BinaryTree binaryTree = new Tree.BinaryTree(binaryTreeNode);

        binaryTree.getRoot().getLeftChild().setLeftChild(new BinaryTreeNode(10));
        binaryTree.getRoot().getLeftChild().setRightChild(new BinaryTreeNode(3));////
        binaryTree.getRoot().getRightChild().setLeftChild(new BinaryTreeNode(13));
        binaryTree.getRoot().getRightChild().setRightChild(new BinaryTreeNode(9));
        return binaryTree;
    }

    private static Tree.BinaryTree initialize3Tree(){
        BinaryTreeNode binaryTreeNode = new BinaryTreeNode(100);
        binaryTreeNode.setLeftChild(new BinaryTreeNode(200));
        binaryTreeNode.setRightChild(new BinaryTreeNode(300));

        Tree.BinaryTree binaryTree = new Tree.BinaryTree(binaryTreeNode);

        binaryTree.getRoot().getLeftChild().setLeftChild(new BinaryTreeNode(400));
        binaryTree.getRoot().getLeftChild().setRightChild(new BinaryTreeNode(900));
        binaryTree.getRoot().getRightChild().setLeftChild(new BinaryTreeNode(800));
        binaryTree.getRoot().getRightChild().setRightChild(new BinaryTreeNode(700));
        return binaryTree;
    }

}
