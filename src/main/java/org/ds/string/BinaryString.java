package org.ds.string;

import java.util.HashSet;
import java.util.Set;

public class BinaryString {


    public static boolean hasAllCodes(String s, int k) {
        Set<String> seen = new HashSet();
        int start =0;
        int count=0;
        for(int i=0;i<s.length();i++){
            count++;
            if(count==k) {
                seen.add(s.substring(start,start+k ));
                count--;
                start++;
            }

        }
        return seen.size() == Math.pow(2,k);
    }

    public static void main(String args[]){

       String s = "00110110";
       int k = 2;

      System.out.println( hasAllCodes(s,k));
    }
}
