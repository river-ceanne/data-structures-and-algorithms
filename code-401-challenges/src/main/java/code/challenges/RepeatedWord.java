package code.challenges;


import java.security.KeyStore;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class RepeatedWord {

    public static String repeatedWord(String string){

        String[] arrString = string.split(" ");
        Hashtable<String,Integer> hashtable = new Hashtable<>();

        for (String s: arrString) {

            String lowercased = s.toLowerCase();
            if(hashtable.containsKey(lowercased)) return lowercased;

            hashtable.put(lowercased,1);
        }


        return "";
    }

}
