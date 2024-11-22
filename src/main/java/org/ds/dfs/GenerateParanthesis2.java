package org.ds.dfs;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis2 {

    public static List<String> generateParenthesis(String in) {
        List<String> list = new ArrayList<>();
        String str ="";
        dfs(list,0,0,in.length()+1,str);

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

        String no="ab";
        List<String> list = generateParenthesis(no);
        System.out.println(list);
    }
}
