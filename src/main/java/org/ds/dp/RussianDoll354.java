package org.ds.dp;

import java.util.Arrays;
import java.util.TreeSet;

public class RussianDoll354 {


    public static int maxEnvelopes(int[][] envelopes) {

        Arrays.sort(envelopes, (a, b) -> {

            if (a[0] == b[0])
                return b[1] - a[1];

            return a[0] - b[0];
        });
        TreeSet<Integer> ts = new TreeSet<>();

        for(int i =0 ;i <envelopes.length;i++){
            int h = envelopes[i][1];

            Integer ceil = ts.ceiling(h);

            if(ceil !=null)
                ts.remove(ceil);
            ts.add(h);
        }

      return   ts.size();

    }



    public static void main(String[] args) {

        int nums[][] = {{5,4},{6,4},{6,7},{2,3}};

        System.out.println(maxEnvelopes(nums));

    }
}
