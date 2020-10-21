import java.util.Scanner;

/**
 * Write a program that determines the smallest number of perfect squares that sum up to N.
 * Here are a few examples:
 *
 * Given N = 4, return 1 (4)
 * Given N = 17, return 2 (16 + 1)
 * Given N = 18, return 2 (9 + 9)
 */

public class PerfectSquares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer Number ::");
        int number = input.nextInt();
        System.out.println("Smallest number of perfect squares that sum up to "+number +" is "+getMinSquare(number));
    }
    static int getMinSquare(int x){
        if(x <= 3)
            return x;

        int res = x;

        for(int i=1; i<=x; i++){
            int temp = i*i;
            if(temp > x)
                break;
            else {
                res = Math.min(res, 1+getMinSquare(x - temp));
//                System.out.println(res);
            }
        }
        return res;
    }
}
