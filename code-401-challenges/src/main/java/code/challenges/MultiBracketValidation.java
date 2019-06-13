package code.challenges;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input){

        Stack<String> openBrackStack = new Stack<>();

        HashMap<String,String> bracketPairs = new HashMap<>();
        bracketPairs.put("{","}");
        bracketPairs.put("(",")");
        bracketPairs.put("[","]");

        String[] inputSplit = input.split("");
        for (String var : inputSplit) {

            if(bracketPairs.containsKey(var)) {
                openBrackStack.push(var);
                continue;
            }

            if(bracketPairs.containsValue(var)){

                if(openBrackStack.empty()) return false;

                String topOpenBracket = openBrackStack.pop();

                for (Map.Entry<String, String> entry : bracketPairs.entrySet()) {
                    String k = entry.getKey();
                    String v = entry.getValue();
                    if (var == v && topOpenBracket != k) {
                        return false;
                    }

                }//end of hashmap for loop
            }

        }//end of string split for loop

        return openBrackStack.empty();
    }
}
