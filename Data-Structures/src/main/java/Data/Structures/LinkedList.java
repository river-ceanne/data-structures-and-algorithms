package Data.Structures;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentLinkedDeque;

public class LinkedList {

    private Node head;

    public LinkedList(){
        head = null;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void insert(String value){
        Node newNode = new Node(value,head);
        head = newNode;
    }

    public boolean includes(String value, Node curr){

        if(curr == null){
            return false;
        }

        if(value == curr.getValue()){
            return true;
        }

        return includes(value,curr.getNextNode());
    }

    public ArrayList<String> print(){

        Node current = head;
        ArrayList<String> nodeValues = new ArrayList<>();

        while(current != null){
            nodeValues.add(current.getValue());
            current = current.getNextNode();
        }

        return nodeValues;
    }

    public void append(String value){
        Node current = head;
        while(current != null){
            if(current.getNextNode() == null){
                Node newNode = new Node(value);
                current.setNextNode(newNode);
                break;
            }
            current = current.getNextNode();
        }

    }

    public void insertBefore(String value, String newVal){
        Node current = head;

        while(current != null){
            if(current.getNextNode().getValue() == value){
                Node newNode = new Node(newVal,current.getNextNode());
                current.setNextNode(newNode);
                break;
            }
            current = current.getNextNode();
        }

    }

    public void insertAfter(String value, String newVal){
        Node current = head;

        while(current != null){
            if(current.getValue() == value){
                Node newNode = new Node(newVal,current.getNextNode());
                current.setNextNode(newNode);
            }

            current = current.getNextNode();
        }
    }

    public String toString(){
        StringBuilder output = new StringBuilder();
        Node current = head;
        while(current != null){
            output.append(current.getValue());
            output.append("\n");
            current = current.getNextNode();
        }
        return output.toString();
    }

}//end of class
