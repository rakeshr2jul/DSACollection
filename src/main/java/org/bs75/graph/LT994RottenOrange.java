package org.bs75.graph;

import java.util.ArrayDeque;
import java.util.Queue;

public class LT994RottenOrange {
// https://www.youtube.com/watch?v=NumW8x8XzbQ
    static class Pair{
        int x, y;
        Pair(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
    public static int orangesRotting(int[][] grid) {
            int n = grid.length;
            int m = grid[0].length;
            int fresh =0;
            int time =0;
        Queue<Pair> que = new ArrayDeque<>();
        // identify rotten orange and fresh oranges
        for(int i=0;i<n;i++){
            for(int j=0;j<m ;j++){
                if(grid[i][j]==2){
                    que.add(new Pair(i,j));
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0)
            return 0;
        // start BFS
            while (!que.isEmpty()){
                int size = que.size();
                int temp=0;
                while(size !=0){
                Pair pair= que.poll();
                int x1 = pair.x;
                int y1 = pair.y;

                int ax[] ={1,-1,0,0};
                int ay[]={0,0 ,1,-1};
                for(int i=0;i<4;i++){
                    int x = ax[i]+x1;
                    int y = ay[i]+y1;

                    if(isValid(x,y,n,m,grid)) {
                        grid[x][y]=2;
                        que.add(new Pair(x,y));
                        temp++;
                    }
                }
                size--;
                }

                if(temp!=0)
                    time++;
           }
        // check any fresh oranges
        for(int i=0;i<n ;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]== 1)
                    time = 0;
                break;
            }
        }

       return time==0 ?-1 : time;
    }

    private static boolean isValid(int i,int j ,int n,int m, int [][] grid){
        if(i >=0 && i <n && j >=0 && j<m && grid[i][j]==1)
            return true;
        return false;
    }

    public static void main(String args[]){

        int grid[][] ={{2,1,1},{1,1,0},{0,1,1}};
       // int grid [][] = {{2,1,1},{0,1,1},{1,0,1}};

      System.out.println("=="+  orangesRotting(grid));
    }
}
