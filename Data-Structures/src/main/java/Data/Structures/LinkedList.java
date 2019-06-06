package Data.Structures;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentLinkedDeque;

public class LinkedList {

    private Node head;
    private int size;

    public LinkedList(){
        head = null;
        size = 0;
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
        size++;
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
        size++;
    }

    public void insertBefore(String value, String newVal){
        Node current = head;

        if(head.getValue() == value){
            Node newNode = new Node(newVal,head);
            head = newNode;
            return;
        }

        while(current != null){

            if(current.getNextNode().getValue() == value){
                Node newNode = new Node(newVal,current.getNextNode());
                current.setNextNode(newNode);
                break;
            }
            current = current.getNextNode();
        }

        size++;

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

        size++;
    }

    public String getKth(int k){
        int index = size - k;
        int count = 1;
        Node curr = head;

        if(k >= size || k < 0){
            throw new IllegalStateException("entered value(k) is greater than size or less than 0");
        }

        while(curr != null){
            if(count == index) return curr.getValue();
            count++;
            curr = curr.getNextNode();
        }

        return "";

    }

    public LinkedList mergeLists(LinkedList one, LinkedList two){



        return one;
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
