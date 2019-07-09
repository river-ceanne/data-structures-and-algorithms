package Data.Structures;

public class Hashtable {

    protected Node[] map;

    public Hashtable(int size) {
        map = new Node[size];
    }

    protected int hash(String key) {
        int hashValue = 0;
        char[] letters = key.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            hashValue += letters[i];
        }
        hashValue = (hashValue * 599) % map.length;
        return hashValue;
    }

    public void add(String key, String value) {
        int hashkey = hash(key);

        if (this.map[hashkey] == null) {
            map[hashkey] = new Node(key,value);
        }
        else {//collision handling
            Node temp = map[hashkey];
            map[hashkey] = new Node(key,value);
            map[hashkey].setNextNode(temp);
        }


    }

//    Implement a Hashtable with the following methods:
//
//add: takes in both the key and value. This method should hash the key,
// and add the key and value pair to the table, handling collisions as needed.
//get: takes in the key and returns the value from the table.
//contains: takes in the key and returns a boolean, indicating if the key exists in the table already.
//hash: takes in an arbitrary key and returns an index in the collection.

    public String get(String key){
        int hashkey = hash(key);
        return map[hashkey] != null? map[hashkey].getValue() : null;
    }

    public boolean contains(String key){
        int hashkey = hash(key);
        return this.map[hashkey] != null;

    }

}
