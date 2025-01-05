package org.ds.string;

public class PascleTriangle {

    public static void printPascalsTriangle(int numRows) {
        int[] row = new int[numRows];

        // Loop to print each row
        for (int i = 0; i < numRows; i++) {
            // Set the first value of each row to 1
            row[i] = 1;

            // Calculate the rest of the elements in the row
            for (int j = i - 1; j > 0; j--) {
                row[j] = row[j] + row[j - 1];
            }

            // Print the row with leading spaces
            for (int j = 0; j <= i; j++) {
                System.out.print(row[j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       printPascalsTriangle(5);
    }

}
