package org.ds.hashmap;

import java.util.HashMap;

public class RomanToInteger {

    public static int romanToInt(String num) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

       int sum =0;
       for(int i=0;i<num.toCharArray().length;i++) {
           if (i + 1 < num.length() && map.get(num.charAt(i)) < map.get(num.charAt(i + 1))) {
               sum -= map.get(num.charAt(i));
           } else {
               sum += map.get(num.charAt(i));
           }
       }
      return sum;
    }

    public static void main(String args[]){
      System.out.println(romanToInt("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMCXXXVI"));
    }
}
