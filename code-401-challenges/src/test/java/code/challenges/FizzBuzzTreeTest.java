package code.challenges;

import org.junit.Test;
import tree.BinaryTreeNode;
import tree.Tree;

import java.util.ArrayList;

import static code.challenges.BinarySearch.binarySearch;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FizzBuzzTreeTest {

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
    public void testFizzBuzzTree(){
        Tree.BinaryTree binaryTree = initializeBTree();
        ArrayList<Object> expected = new ArrayList<>();
        FizzBuzzTree.FizzBuzzTree(binaryTree);
        expected.add(1); expected.add(2); expected.add("Fizz"); expected.add(4);
        expected.add("Buzz"); expected.add("Fizz"); expected.add(7);

        assertEquals(expected,binaryTree.inOrder());

    }

}
