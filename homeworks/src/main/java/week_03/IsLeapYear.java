package week_03;

/**
 * Write a program that takes a year as input and checks if it is a leap year or not.
 * A leap year is defined as a year that is divisible by 4, except for years that are divisible by 100.
 * However, years that are divisible by 400 are considered leap years.

 * Example 1:
 * input:
 * year = 2024
 * output:
 * 2024 is a leap year = true
 * explanation: 2024 is divisible by 4, so it satisfies the basic requirement for a leap year.
 * 2024 is not divisible by 100, so it doesn't fall under the exception for non-leap years.
 * Therefore, 2024 is a leap year.
 *
 *  Example 2:
 *     input:
 *     year = 1900
 *     output:
 *  1900 is a leap year = false
 */

public class IsLeapYear {

    public static boolean isLeapYear(int year){
        if ((year % 4 ==0 && year % 100 != 0 )|| year % 400==0 ){
            System.out.println(year + "is leap year");
            return true;
        }
        System.out.println(year + "is not leap year");
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2024));
        System.out.println(isLeapYear(1900));
    }

}
