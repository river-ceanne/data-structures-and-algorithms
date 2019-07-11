package code.challenges;

import tree.BinaryTreeNode;

import java.util.ArrayList;
import java.util.HashSet;

public class TreeIntersection {


    public static HashSet treeIntersection(BinaryTreeNode root1, BinaryTreeNode root2){

        ArrayList<Object> arr1 = new ArrayList<>();
        arr1 = treeIntersectionHelper(arr1,root1);

        ArrayList<Object> arr2 = new ArrayList<>();
        arr2 = treeIntersectionHelper(arr2,root2);

        HashSet hashSet = new HashSet();

        for (Object val: arr1) {
            if(arr2.contains(val)) hashSet.add(val);
        }

        return hashSet;
    }

    private static ArrayList<Object> treeIntersectionHelper(ArrayList<Object> arr, BinaryTreeNode node){
        if(node == null) return arr;

        //do something here

        arr.add(node.getValue());

        treeIntersectionHelper(arr, node.getLeftChild());

        treeIntersectionHelper(arr, node.getRightChild());

        return arr;
    }

}
