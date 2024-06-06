package week_28;

/**
 * Simba has a number of staircases in his house, and he likes to climb each staircase 1 or 2 steps at a time.
 * It takes n steps to reach the top. In how many distinct ways can he climb to the top?
 * Example 1:
 * Input: n = 2 Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 * Input: n = 3 Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 * Constraints:
 *  1 <= n <= 45
 */

public class ClimbingStairs {
    public static int waysToClimbStairs(int n){//n- > steps to reach the top
        if (n == 0 || n==1) {//there is only one way
            return 1;
        }

        //calculate the number of ways for the next n  by adding number of ways for the previous 2 n.
        // n=3, number of ways = 2+1;    n=4,  number of ways =3+2;   n=5, number of ways = 5+3;
        int first= 1;//there is only one way to climb the first stair using 1 step
        int second =2;
        int third= 0;// for third and following stairs

        if (n== second)  return second;

        for (int i = 3; i <= n ; i++) {
            third = first+ second;
            first = second;
            second = third;
        }
        return third;
    }


    /** What if he climbs each staircase 1, 2 or 3 steps at a time?*/
     public static int waysToClimbStairs1(int n){//n- > steps to reach the top
        if (n == 0 || n==1) {//there is only one way
            return 1;
        }

        //calculate the number of ways for the next n  by adding number of ways for the previous 2 n.
        // n=3, number of ways = 2+1;    n=4,  number of ways =3+2;   n=5, number of ways = 5+3;
         int first= 1;
        int second= 2;
        int third =3; //there are 2 ways to take 2 steps
        int fourth= 0;// for third and following steps

        for (int i = 3; i <= n ; i++) {
            third = first+ second;
            first = second;
            second = third;
        }
        return third;
    }

    public static void main(String[] args) {

    }

}

