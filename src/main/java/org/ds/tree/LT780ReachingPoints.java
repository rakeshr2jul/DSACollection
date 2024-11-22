package org.ds.tree;

public class LT780ReachingPoints {

    public static boolean reachingPoints(int sx, int sy, int tx, int ty) {

       while (tx >= sx && ty >= sy){
           if(tx > ty){
               if(sy == ty)
                   return (tx-sx) % ty ==0;
               tx %= ty ;
           }else {
               if(sx ==tx)
                   return (ty-sy) % tx == 0;
               ty %= tx;
           }
       }
            return false;
    }

    public static void main(String args[]){
        int sx = 1;
        int sy = 1;
        int tx = 2;
        int ty = 2;
       System.out.println(reachingPoints(sx,sy,tx,ty));
    }
}
