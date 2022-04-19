package com.company;

import java.util.*;

class Generic {
    public static void main(String[] args)
    {
        Map<String, Integer> unique = new LinkedHashMap<String, Integer>();
        for (String string : "House, House, House, Dog, Dog, Dog, Dog".split(", ")) {
            unique.merge(string, 1, Integer::sum);
        }
        String uniqueString = join(unique.keySet(), ", ");
        List<Integer> value = new ArrayList<Integer>(unique.values());

        System.out.println("Output = " + uniqueString);
        System.out.println("Values = " + value);

    }

    public static String join(Collection<String> s, String delimiter) {
        StringBuilder buffer = new StringBuilder();
        Iterator<String> iter = s.iterator();
        while (iter.hasNext()) {
            buffer.append(iter.next());
            if (iter.hasNext()) {
                buffer.append(delimiter);
            }
        }
        return buffer.toString();
    }
}