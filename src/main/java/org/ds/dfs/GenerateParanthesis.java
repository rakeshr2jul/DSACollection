package org.ds.dfs;

import java.util.ArrayList;
import java.util.List;
// Leetcode 22
public class GenerateParanthesis {

    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        String str ="";
        dfs(list,0,0,n,str);

        return list;
    }

    public static void dfs(List<String> list,int open,int close,int no,String str){
        if(str.length()==2*no){
            list.add(str);
        }
        if(open < no)
            dfs(list,open+1,close,no,str+"(");
        if(close < open)
            dfs(list,open,close+1,no,str+")");
    }


    public static void main(String args[]){

        int no=2;
        List<String> list = generateParenthesis(no);
        System.out.println(list);
    }
}
