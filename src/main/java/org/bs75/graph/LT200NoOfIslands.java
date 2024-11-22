package org.bs75.graph;

public class LT200NoOfIslands {

    public static int numIslands(char[][] grid) {
        int noIslands=0;
        if(grid.length==0)
            return noIslands;

        for(int i =0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    noIslands++;
                }
            }
        }

        return noIslands;
    }

    private static void  dfs(char [][] grid,int i,int j){

        if(i < 0 || i >=  grid.length || j < 0  || j >= grid[0].length || grid[i][j]=='0')
            return;

        grid[i][j]='0';
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);

    }
    public static void main(String args[]){
        char grid [][] = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};

        System.out.println(numIslands(grid));

    }
}
