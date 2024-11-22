package org.ds.string;

public class LT243ShortestDistance {


    public static int shortestDistance(String[] words, String word1, String word2) {
            int num1 = -1, num2 = -1;
            int ans = Integer.MAX_VALUE;
            for (int i=0; i<words.length; i++)
            {
                String word = words[i];
                if (word.equals(word1))
                {
                    num1 = i;

                    if (num2 != -1)
                    {
                        ans = Math.min(ans, Math.abs(num1-num2));
                    }
                }

                if (word.equals(word2))
                {
                    num2 = i;
                    if (num1 != -1)
                    {
                        ans = Math.min(ans, Math.abs(num1-num2));
                    }
                }
            }
            return ans;



    }

    public static void main(String args[]){
        String str = "The quick brown fox jumped over the large brown tree towards the lazy red dog.";
        String[] words = str.split(" ");
        System.out.print(shortestDistance(words,"quick","fox"));
    }
}
