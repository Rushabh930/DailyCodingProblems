package DailyCodingProblem;

/**
 * On a mysterious island there are creatures known as Quxes which come in three colors: red, green, and blue.
 * One power of the Qux is that if two of them are standing next to each other,
 * they can transform into a single creature of the third color.
 *
 * Given N Quxes standing in a line, determine the smallest number of them remaining after any possible sequence of such transformations.
 *
 * For example, given the input ['R', 'G', 'B', 'G', 'B'], it is possible to end up with a single Qux through the following steps:
 *
 *         Arrangement       |   Change
 * ----------------------------------------
 * ['R', 'G', 'B', 'G', 'B'] | (R, G) -> B
 * ['B', 'B', 'G', 'B']      | (B, G) -> R
 * ['B', 'R', 'B']           | (R, B) -> G
 * ['B', 'G']                | (B, G) -> R
 * ['R']                     |
 */
public class SmallestRemainingNumberInSequence {
    public static void main(String[] args) {
        char[] quxes = {'R', 'R','R','R','R'};
        System.out.println("The smallest number of them remaining after any possible sequence of such transformations :: "+lastCharAfterTransformation(quxes));
    }

    static int lastCharAfterTransformation(char[] input) {
        int red=0,blue=0,green=0;
        for(char c : input){
            switch (c) {
                case 'R' -> red++;
                case 'G' -> green++;
                case 'B' -> blue++;
            }
        }
        if(red == input.length || green == input.length || blue == input.length){
            return input.length;
        }
        if(red%2 == green%2 && red%2== blue%2){
            return 2;
        }
        return 1;
    }
}
