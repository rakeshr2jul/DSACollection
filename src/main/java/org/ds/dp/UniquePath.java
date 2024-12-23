package org.ds.dp;

public class UniquePath {

    public static int uniquePaths(int m, int n) {

        int dp [] [] = new int[m][n];

        for(int i=0;i<m;i++){
            dp[i][0]=1;
        }

        for(int i=0;i<n ;i++){
            dp[0][i]=1;
        }

        for(int i=1;i<m ;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }

    public static int uniquePathsRec(int m ,int n){
       int dp[][] = new int [m][n];
        return  rec(m,n,0,0,dp);
    }

    private  static  int rec(int m ,int n,int i,int j ,int dp[][]){

        if(i==m || j ==n)
            return 0;
        if(i ==  m-1 && j == n-1)
            return 1;

        int right = rec(m,n,i,j+1,dp);
        int down = rec(m,n,i+1,j,dp);

       return dp[i][j] = right+down;
    }

    public static void main(String[] args) {

        int m = 3, n = 7;

        System.out.println(uniquePathsRec(3,7));

    }
}
