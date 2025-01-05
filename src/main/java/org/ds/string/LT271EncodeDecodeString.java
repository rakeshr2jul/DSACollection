package org.ds.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LT271EncodeDecodeString {


    // Encodes a list of strings to a single string.
    public static String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb = sb.append(str.length()).append("#").append(str);
        }
       return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public  static List<String> decode(String s) {

        List<String> deCodeStringList = new ArrayList<>();

        int i =0;
        while (i<s.length()){

             int idx = s.indexOf("#",i);
             System.out.println("idx # :" +idx);
             int len = Integer.parseInt(s.substring(i,idx));

            System.out.println("(i, idx) len  # :" +len);
             i = idx+1;
             String decodeString = s.substring(i,i+len);
             deCodeStringList.add(decodeString);
             i=i+len;

        }
       return  deCodeStringList;


    }
    public static void main(String[] args) {
      List<String> str = new ArrayList<>();
      str.add("Hello");
      str.add("world");
      String op = encode(str);
       System.out.println("=====: "+op);
        decode(op);
      //  System.out.println(Arrays.asList( decode(op)).toString());
    }
}
