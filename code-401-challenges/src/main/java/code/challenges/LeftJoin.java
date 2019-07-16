package code.challenges;

import java.util.HashMap;
import java.util.Hashtable;

public class LeftJoin {

    public static Hashtable<String,String[]> leftJoin(HashMap<String,String> synonyms, HashMap<String,String> antonymns){

        Hashtable<String,String[]> hashtable = new Hashtable<>();

        synonyms.forEach((k,v) -> {
            String[] values = new String[2];
            values[0] = v;
            values[1] = antonymns.get(k);
            hashtable.put(k,values);
        });

        return hashtable;
    }
}
