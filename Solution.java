import java.util.Arrays;

/*
Thouhg this is a snippet of a few lines, with this problem
one could easily stray into lengthy calculations.
 */
public class Solution {

    public int getMaximumConsecutive(int[] coins) {

        int sum = 1;
        Arrays.sort(coins);

        /* sum >= coins[i] is to make sure that coins[i] 
           can be reached by stepping on each consequtive integer,
           starting from 0;
         */
        for (int i = 0; i < coins.length && sum >= coins[i]; i++) {
            sum += coins[i];
        }
        return sum;
    }
}
