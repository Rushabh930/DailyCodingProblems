package DailyCodingProblem;


import java.util.Scanner;

/**
 * You are given a string consisting of the letters x and y, such as xyxxxyxyy.
 * In addition,you have an operation called flip, which changes a single x to y or vice versa.
 *
 * Determine how many times you would need to apply this operation to ensure that all x's come before all y's.
 * In the preceding example, it suffices to flip the second and sixth characters, so you should return 2.
 */
public class FlipMethod {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string ::");
        String input = in.nextLine();
        int lastFoundX= 0;
        int flipCount=0;

        // Find last occurrence of 'x'
        for(int i=input.length()-1;i<=input.length();i--){
            if(input.charAt(i) == 'x'){
                System.out.println("Last occurrence of x at :"+i);
                lastFoundX = i;
                break;
            }
        }

        //Check if last occurrence is 'x' than replace it with y and recalculate the lasFoundX
        if(lastFoundX == input.length()-1){
            flipCount=1;
           input = input.substring(0,lastFoundX)+'y'+input.substring(lastFoundX+1);
            System.out.println("New String ::"+input);
            for(int i=input.length()-1;i<=input.length();i--){
                if(input.charAt(i) == 'x'){
                    System.out.println("Inside Last occurrence of x at :"+i);
                    lastFoundX = i;
                    break;
                }
            }
        }

        //Find to total number for flip required
        for(int i=0;i<=lastFoundX;i++){
            if(input.charAt(i) == 'y'){
                flipCount++;
            }
        }

        System.out.println("Final flip count ::"+flipCount);
    }

}
