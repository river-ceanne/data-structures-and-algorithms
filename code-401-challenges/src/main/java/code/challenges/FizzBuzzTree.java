package code.challenges;

import tree.BinaryTreeNode;
import tree.Tree;

public class FizzBuzzTree {

    public Tree.BinaryTree FizzBuzzTree(Tree.BinaryTree binaryTree){

        return binaryTree;
    }

    private BinaryTreeNode fizzBuzzTreeHelper(BinaryTreeNode root, BinaryTreeNode node){
        if(node == null) return root;

        //do something here
        if(divisibleBy3And5(node.getValue())) node.setValue("FizzBuzz");
        else if(divisibleBy3(node.getValue())) node.setValue("Fizz");
        else if(divisibleBy5(node.getValue())) node.setValue("Buzz");

        fizzBuzzTreeHelper(root, node.getLeftChild());

        fizzBuzzTreeHelper(root, node.getRightChild());

        return root;
    }

    private boolean divisibleBy3(Object value){
        if(value.getClass() == Integer.class){
            return ((int) value) % 3 == 0;
        }

        return false;
    }

    private boolean divisibleBy5(Object value){
        if(value.getClass() == Integer.class){
            return ((int) value) % 5 == 0;
        }

        return false;
    }

    private boolean divisibleBy3And5(Object value){
        if(value.getClass() == Integer.class){
            return  ((int) value) % 5 == 0;
        }

        return false;
    }



}
