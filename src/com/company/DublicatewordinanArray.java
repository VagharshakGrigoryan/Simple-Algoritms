package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DublicatewordinanArray {
    public static void main(String[] args) {
        String str = "This is Dileep Dileep Kumar Verma Verma";
        DuplicateString(str);
    }
    public static void DuplicateString(String str) {
        String[] word = str.split(" ");
        Map< String, Integer > map = new HashMap< String, Integer >();
        for (String w: word)
            if (!map.containsKey(w)) {
                map.put(w, 1);
            }
            else {
                map.put(w, map.get(w) + 1);
            }
        Set< Map.Entry < String, Integer >> entrySet = map.entrySet();
        for (Map.Entry < String, Integer > entry: entrySet)
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
    }
}
