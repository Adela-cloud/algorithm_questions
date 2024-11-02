package week_01;

/**
 * A child is running up a staircase with n steps and can
 * hop either 1 step, or 2 steps at a time. how many possible
 * ways the child can run up the stairs.
 */

public class WaysToClimbStairs {
    public static int waysToClimb(int n){
        if (n <= 2){
            return  n;
        }
        int[]  ways= new int[n+1];//since we start counting from 1st index(index 0 isn't used), the size of array should be  n+1.
        ways[1] = 1;
        ways[2] = 2;
        for (int i= 3; i <= n ; i++){//If the child is at step 3 or higher, the number of ways to reach the top is the sum of the number of ways to reach the previous two steps.
            ways[i] = ways[i-1]+ ways[i-2];
        }
        return ways[n];
    }


    public static void main(String[] args) {
        System.out.println(waysToClimb(1));
        System.out.println(waysToClimb(5));
    }

}
