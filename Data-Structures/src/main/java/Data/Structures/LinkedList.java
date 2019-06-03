package Data.Structures;

import java.sql.SQLOutput;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentLinkedDeque;

public class LinkedList {

    private Node head;

    public LinkedList(){
        head = new Node();
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void insert(String value){

        Node newNode;

        newNode = new Node(value,head);

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

    public void print(){

        Node current = head;

        while(current != null){
            System.out.println(current.getValue());
            current = current.getNextNode();
        }

    }

}//end of class
