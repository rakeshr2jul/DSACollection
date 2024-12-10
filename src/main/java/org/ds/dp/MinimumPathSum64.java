package org.ds.dp;

import java.util.Arrays;

public class MinimumPathSum64 {


    public static int minPathSum(int[][] grid) {

        int dp[][] = new int [grid.length][grid[0].length];
        for(int i =0;i< dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return  memo(grid,0,0,dp);
       // return  recurse(grid,0,0);
    }

    private static int memo(int grid[][],int i ,int j,int dp[][]){
       /* if(i < 0 || j < 0 || i==grid.length || j == grid[0].length){
            return Integer.MAX_VALUE;
        }

        if(i==grid.length-1 && j == grid[0].length-1){
            return grid[i][j];
        }*/

        if(i < 0 || j < 0 || i == grid.length || j==grid[0].length){
            return  Integer.MAX_VALUE;
        }
        if(i== grid.length-1  && j == grid[0].length-1){
            return grid[i][j];
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int right = memo(grid,i,j+1,dp);
        int down = memo(grid,i+1,j,dp);

       return dp[i][j]= Math.min(right,down)+grid[i][j];
    }

    private static int recurse(int grid[][], int i, int j){

        if(i < 0 || j < 0 || i == grid.length || j==grid[0].length){
            return  Integer.MAX_VALUE;
        }
        if(i== grid.length-1  && j == grid[0].length-1){
            return grid[i][j];
        }
        int right = recurse(grid,i,j+1);
        int down = recurse(grid,i+1,j);

        return Math.min(right,down)+grid[i][j];
    }


    public static void main(String[] args) {
        int grid[][] = {{1,3,1},{1,5,1},{4,2,1}};
         System.out.println(minPathSum(grid));

    }
}
