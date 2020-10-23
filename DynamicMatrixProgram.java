package DailyCodingProblem;

import java.util.Scanner;

/**
 * This problem was asked by Facebook.
 *
 * There is an N by M matrix of zeroes. Given N and M,
 * write a function to count the number of ways of starting at the top-left corner and getting to the bottom-right corner.
 * You can only move right or down.
 *
 * For example, given a 2 by 2 matrix, you should return 2, since there are two ways to get to the bottom-right:
 *      Right, then down
 *      Down, then right
 * Given a 5 by 5 matrix, there are 70 ways to get to the bottom-right.
 *
 */
public class DynamicMatrixProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int col;
        int row;

        System.out.println("Enter number of column ::");
        col = input.nextInt();
        System.out.println("Enter number of row ::");
        row = input.nextInt();

        System.out.println("Total ways to reach to end block :: "+countPath(col,row));
    }

    // Find number of ways to reach
    // mat[m-1][n-1] from mat[0][0]
    // in a matrix mat[][]]
    static int countPath(int m,int n){
        m = m-1;
        n= n-1;
        return factorial(m+n)/(factorial(m)*factorial(n));
    }

    static int factorial(int n){
        int res=1,i;

        for(i=2;i<=n;i++)
            res*=i;
        return res;
    }

}
