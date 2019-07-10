package code.challenges;

import hashtable.Hashtable;

public class RepeatedWord {

    public static String repeatedWord(String string){

        String[] arrString = string.split(" ");
        Hashtable hashtable = new Hashtable(100);
        String temp = arrString[0];

        for (String s: arrString) {

            hashtable.add(s,"");

        }


        return "";
    }

}
