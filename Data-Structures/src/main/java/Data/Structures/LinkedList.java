package Data.Structures;

import java.sql.SQLOutput;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentLinkedDeque;

public class LinkedList {

    private Node head;
    private Node current;

    public LinkedList(){
        head = new Node();
        current = head;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void insert(String value){

        Node newNode;

        if(head != null){
            newNode = new Node(value,head.getNextNode());
        }else{
            newNode = new Node(value,null);
        }

        head.setNextNode(newNode);
    }

    public boolean includes(String value, Node head){
        if(value == head.getValue()){
            return true;
        }
        return includes(value,head.getNextNode());
    }

    public void print(){

//        while(current.getNextNode()){
//
//        }

    }

}//end of class
