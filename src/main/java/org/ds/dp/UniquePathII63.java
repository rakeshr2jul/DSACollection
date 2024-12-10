package org.ds.dp;

public class UniquePathII63 {


    public static int uniquePathsWithObstacles(int[][] grid) {
     //return recursion(obstacleGrid,0,0);
        int dp[][] = new int [grid.length][grid[0].length];

      return memo(grid,0,0,dp)  ;
    }

    static  int recursion(int grid[][],int i,int j){
        int n = grid.length;
        int m = grid[0].length;

        if(i==n || j==m)  // out of bound condition
            return 0;
        if(grid[i][j] == 1)
            return 0;

        if(i ==  n-1 && j == m-1)
            return 1;

        int right = recursion(grid,i,j+1);
        int down = recursion(grid,i+1,j);
        return right+down;
    }

    static int memo(int grid[][],int i,int j,int dp[][]){
       int n = grid.length;
       int m = grid[0].length;

       if(i==n || j==m)
           return 0;
       if(grid[i][j] ==1)
           return 0;
       if(i==n-1 && j == m-1){
           return 1;
       }
       if(dp[i][j] != 0){
           return dp[i][j];
       }
        int right = memo(grid,i,j+1,dp);
        int down = memo(grid,i+1,j,dp);

        return dp[i][j] = right+down;
    }


    public static void main(String[] args) {
      int grid[][] = {{0,0},{0,1}};

        System.out.println(uniquePathsWithObstacles(grid));
    }
}
