package code.challenges;

import graph.Graph;

import java.util.ArrayList;
import java.util.HashSet;

public class GetEdge {

//    Write a function based on the specifications above, which takes in a graph,
//    and an array of city names. Without utilizing any of the built-in methods available
//    to your language, return whether the full trip is possible with direct flights, and how much it would cost.

    static class PathAndWeight{

        protected boolean hasExactPath;
        protected int accumulation;

        public PathAndWeight(){}

        public PathAndWeight(boolean hasExactPath, int accumulation){
            this.accumulation = accumulation;
            this.hasExactPath = hasExactPath;
        }

        public boolean isHasExactPath() {
            return hasExactPath;
        }

        public int getAccumulation() {
            return accumulation;
        }
    }

    public static PathAndWeight isTripPossible(Graph graph, ArrayList<String> cities){

        PathAndWeight pathAndWeight = new PathAndWeight();

        return pathAndWeight;
    }

}
