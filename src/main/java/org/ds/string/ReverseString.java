package org.ds.string;

public class ReverseString {

    static String   reverse(String str){

        if(str.isEmpty() ){
            return "";
        }else {
            //System.out.print(str.charAt(str.length()-1));
            return reverse(str.substring(1))+str.charAt(0);
        }
      //   return  reverse(str.substring(0,str.length()-1));

    }

    public static void main(String args[]){

       String st= reverse("Rakesh");
       System.out.println(st);
    }
}
