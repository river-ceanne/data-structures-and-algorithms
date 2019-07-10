package hashtable;

public class Node {

    private String key;
    private String value;
    private Node nextNode;

    public Node(String value, Node nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }

    public Node(String value) {
        this.value = value;
        this.nextNode = null;
    }

    public Node(String key, String value) {
        setKey(key);
        setValue(value);
    }

    public Node() {
        this.value = "";
        this.nextNode = null;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public String getValue() {
        return value;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public void setValue(String value) {
        this.value = value;
    }


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
