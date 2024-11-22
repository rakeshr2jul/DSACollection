package org.ds.string;

public class LT2038WinngGame {

    public static boolean winnerOfGame(String colors) {

        int cntA=0;
        int cntB=0;
        int cnt=0;

        for(int i =0;i<colors.length();i++){
            if(colors.charAt(i)=='A') {
                cnt++;
            }else {
                if(cnt>=3){
                    cntA += cnt-2;
                }
                cnt=0;
            }
        }
        if(cnt>=3){
            cntA += cnt-2;
        }
       cnt=0;
        for (int i =0;i<colors.length();i++){
            if(colors.charAt(i)=='B')
                cnt++;
            else{
                if(cnt>=3){
                    cntB += cnt-2;
                }
                cnt=0;
            }
        }
        if(cnt>=3){
            cntB += cnt-2;
        }

       return cntA > cntB;
    }

    public static void main(String args[]){
         System.out.println(winnerOfGame("ABBBBBBBAAA"));
    }
}
