package code.challenges;

import graph.Node;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirst {
//    Extend your graph object with a breadth-first traversal method
//    that accepts a starting node. Without utilizing any of the built-in methods available
//    to your language, return a collection of nodes in the order they were visited. Display the collection.

    public static HashSet<Node<String>> breadthFirst(Node<String> node){

        Queue<Node<String>> queue = new LinkedList<>();
        HashSet<Node<String>> visited = new HashSet<>();

        queue.add(node);

        while(!queue.isEmpty()){

            Node<String> current = queue.remove();

            if(visited.contains(current)) continue;

            visited.add(current);

            for(Node<String> neighbor: current.getNeighbors()){
                queue.add(neighbor);
            }
        }

        return visited;

    }

}
