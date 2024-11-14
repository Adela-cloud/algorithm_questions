package week_05;

import java.util.IllegalFormatCodePointException;

/**
 * factorial mark = !
 * 0!= 1
 * 4!= 4 x 3 x 2 x 1 = 24
 */

public class Factorial {

    //time complexity: O(n)
    //space: O(1)
    public static int factorial(int num){
      if (num == 0)
          return 1;

      int fact= 1;
      for (int i = 1;  i<= num; i++ ){
          fact *=  i;
      }
      return fact;
    }


    public static long factorial1(int n) {
        if(n==0){
            return 1L;
        }
        int fact= 1;
        for(int i= 1; i<= n; i++){
            fact*= i;
        }
        return Long.valueOf(fact);
    }


    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(factorial1(4));
    }
}
