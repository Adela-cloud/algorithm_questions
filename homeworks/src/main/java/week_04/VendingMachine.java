package week_04;

/**
 * You're developing software for a vending machine that dispenses items with given prices.
 * Write a program that takes in the item price and the amount paid by the customer and prints
 * the remaining change to be dispensed in various denominations (e.g., dollars, quarters, dimes,
 * nickels, pennies).
 * If any input is not greater than 0, it should print “Invalid input”
 * The vending machine operates with the following denominations:
 * Dollar bills: $1 Quarters: $0.25 Dimes: $0.10 Nickels: $0.05 Pennies: $0.01
 *
 * Example-1
 * Input: item price is $3.50 and the customer pays $5.00
 * Output: 1 dollar bill, 2 quarters, 0 dimes, 0 nickels, 0 pennies
 */

public class VendingMachine {
   public static void remainingChange(double price, double paidAmount) {
       if (price <= 0 || paidAmount <= 0) {
           System.out.println("invalid input");
       }
       if (paidAmount > price)   {
          double change= paidAmount - price;
          int changeInCents = (int)Math.round(change * 100);
          //we use math.round here to round it to nearest whole number.
          // otherwise, if we have a num like 149.999999 it only takes 149 instead of 150, which results inaccuracy.

          int dollarBill = (int)changeInCents/100;
         changeInCents %= 100;

           int quarter = (int)changeInCents/25;
           changeInCents %= 25;

          int dime= (changeInCents / 10);
          changeInCents %= 10;

           int nickle= (changeInCents / 5);
           changeInCents %= 5;

           int penny= (changeInCents / 1);

           System.out.printf("your change is : %d dollar bills, %d quarters, %d dimes, %d nickles, %d pennies",
                   dollarBill,quarter, dime,nickle,penny);
       }else {
           System.out.println(" insufficient payment");
       }
   }

    public static void main(String[] args) {
       remainingChange(3, 8.87);
    }
}
