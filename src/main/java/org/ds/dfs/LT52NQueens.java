package org.ds.dfs;

import java.util.ArrayList;
import java.util.List;

public class LT52NQueens {

    static List<List<String>> result ;
    public static List<List<String>> solveQueens(int n){
        result = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        List<int[]> queens = new ArrayList<>();
        dfs(board,0,queens);
        return result;
     }

     private static void dfs(char[][] board,int r,List<int[]> queens){
        if(queens.size()==board.length){
            List<String> rows = new ArrayList<>();
            for(char[] row : board){
                rows.add(new String(row));
            }
            result.add(rows);
        }
        // try adding queens
         for(int c=0;c<board.length;c++){
             if(canAddQueen(r,c,queens)){
               board[r][c]= 'Q';
               queens.add(new int[]{r,c});
               dfs(board,r+1,queens);
               board[r][c] ='.';
               queens.remove(queens.size()-1);
             }
         }
     }
    private  static boolean canAddQueen(int row,int col,List<int[]> queens){
        for(int [] q : queens){
            int dx = Math.abs(row -q[0]);
            int dy = Math.abs(col-q[1]);

            if(dx==0 || dy ==0 || dx==dy)
                return false;
        }
        return true;
    }
    public static void main(String args[]){
       List<List<String >> res = solveQueens(4);
        System.out.println(res.size());
        res.stream().forEach(System.out::println);
    }
}
