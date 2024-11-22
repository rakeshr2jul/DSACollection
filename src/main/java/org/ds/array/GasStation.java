package org.ds.array;

public class GasStation {

    static int canComplete(int gas[],int cost[]){
        int position=0,sum=0,total=0;

        for(int i =0;i<gas.length;i++){
            sum += gas[i] - cost[i];
            if(sum < 0){
                total +=sum;
                System.out.println("==tot==="+total);
                sum=0;
                position = i+1;
            }
            System.out.println("==sum==="+sum);
        }
        total +=sum;

        return  total >=0 ? position : -1;
    }

    public static void main (String args[]){

        int g[] = {1,2,3,4,5};
        int c[]= {3,4,5,1,2};

        int r =canComplete(g,c);
        System.out.println(r);
    }
}
