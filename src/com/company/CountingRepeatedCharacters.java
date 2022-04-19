package com.company;


import java.util.*;

public class CountingRepeatedCharacters {
    public static void main(String[] args) {
        String str = "aasdsaaadccdc";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String s = String.valueOf(chars);
        for (int i = 0; i < chars.length; ) {
            System.out.println(chars[i] + "(" + (s.lastIndexOf(chars[i]) - s.indexOf(chars[i]) + 1) + ")");
            i += (s.lastIndexOf(chars[i]) - s.indexOf(chars[i]) + 1);
        }
    }
}

