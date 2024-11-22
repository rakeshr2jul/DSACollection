package org.ds.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubStringCount {

    public static void main(String[] args) {
        String input = "abcdabceabcfabch";
        String pattern = "abc";
        int count = countSubstring(input, pattern);
        System.out.println("Number of occurrences of \"" + pattern + "\" in \"" + input + "\": " + count);
    }

    public static int countSubstring(String input, String pattern) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        int count = 0;
        while (m.find()) {
            count++;
        }
        return count;
    }
}
