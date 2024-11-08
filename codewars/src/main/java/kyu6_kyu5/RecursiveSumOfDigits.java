package kyu6_kyu5;

/**
 * DESCRIPTION:
 * Digital root is the recursive sum of all the digits in a number.
 * Given n, take the sum of the digits of n. If that value has more than one digit,
 * continue reducing in this way until a single-digit number is produced.
 * The input will be a non-negative integer.
 * Examples
 *     16  -->  1 + 6 = 7
 *    942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
 */

public class RecursiveSumOfDigits {


        //with recursive
        //time complexity: O(n)
        //space complexity: O(1)
        public static int digitalRoot1(int n) {
            if (n < 10) return n;

            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            return digitalRoot1(sum);
        }


        // with math
 /**      the remainder of n%9 is often correspond the digital root of n.
         for example : 38 % 9= 11 , and digital root of 38 is 11.

          when the remainder is 0 , then the digital root is 9.
          for example : 18 % 9 = 0 , the digital root of 18 is 9.
  */
        // time & space = O (1)
        public static int digitalRoot2(int n) {
            if (n == 0) return 0;
            return (n % 9 == 0) ? 9 : n % 9;
        }





    public static void main(String[] args) {
        System.out.println(digitalRoot1(55555));
        System.out.println(digitalRoot1(123));


        System.out.println(digitalRoot2(55555));
        System.out.println(digitalRoot2(123));
        System.out.println(digitalRoot2(18));

    }

}

