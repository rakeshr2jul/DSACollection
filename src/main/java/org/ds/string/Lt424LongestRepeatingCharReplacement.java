package org.ds.string;

public class Lt424LongestRepeatingCharReplacement {

    public static int characterReplacement(String s, int k){

        int fre[] = new int [26];
        int l = 0;
        int maxfreq=0;
        int maxWindow =0;


        for(int r =0;r <s.length();r++){
            fre[s.charAt(r)-'A']++;
            maxfreq = Math.max(maxfreq, fre[s.charAt(r)-'A'] );
            int winLength = r - l +1;

            if(winLength - maxfreq >k){
                fre[s.charAt(l) - 'A']--;
                l++;
            }

            winLength = r -l +1;
            maxWindow = Math.max(maxWindow ,winLength);
        }

        return maxWindow;
    }

    public static void main(String[] args) {

        System.out.println(characterReplacement("ABAB",2));
    }
}
