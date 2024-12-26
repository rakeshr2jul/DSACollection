package org.ds.linkedList;

public class HappyNumber {


    public static boolean isHappy(int n){

        int slow = n;
        int fast = n;

        do {

            slow = sequare(n);
            fast = sequare(sequare(fast));
        }while (slow !=fast);

        if(slow==1){
            return true;
        }

       return false;
    }

    private static int sequare(int number){

        int ans=0;

        while (number > 0 ){

            int rem = number % 10;
            ans += rem * rem ;
            number /= 10;

        }

        return  ans;


    }
    public static void main(String[] args) {

    }
}
