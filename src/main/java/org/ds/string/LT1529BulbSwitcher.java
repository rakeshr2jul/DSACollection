package org.ds.string;

public class LT1529BulbSwitcher {

    public static int minFlips(String target) {
        int state =0;
        int count =0;
        for(char ch : target.toCharArray()){
            if(ch - '0'!= state){
                state = ch-'0';
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]){
        System.out.println(minFlips("0100"));
    }
}
