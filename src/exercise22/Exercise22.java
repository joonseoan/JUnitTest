package exercise22;

/**
 * 
 * Exercise 22.
 * 
 * 
 * Your goal is to make all of the test cases pass.  Do not change any 
 * of the test cases.
 * 
 * Write a method that makes change for amounts less than one dollar. Input 
 * must be a positive integer up to 100, representing an amount of money, 
 * in cents. Output must be the original amount of money together with a set 
 * of coins (quarters, dimes, nickels) that could make up the amount. The 
 * program must produce change containing the minimum number of coins required 
 * to produce the given amount. Remember that the penny is no longer in 
 * production, so you must round the value up or down accordingly.  The output 
 * must be reasonable and non-stilted. For example, the input of 54 should 
 * produce results such as: 
 *           54 cents requires 2 quarters, 1 nickel
 * rather than
 *           54 cents requires 2 quarters, 0 dimes, 1 nickels
 * 
 * Critical values for makeChange:
 * � If the number entered is outside the range 0-100, then 
 * a BadChangeException should be thrown.
 * � If the number entered rounds down to 0, or up to 100, then the 
 * method should return the string "Cannot calculate change".
 * 
 */

public class Exercise22{  
   
  public static String makeChange(int amount) throws BadChangeException{
	  
      if (amount < 0 || amount > 100) {
          throw new BadChangeException("The range is 1 to 99 inclusive.");
      }
      
      int roundoff = amount % 5;
      
      int newAmount = 0;

      if (roundoff < 3 || roundoff == 0) {
          newAmount = amount - roundoff;
      } else if (roundoff > 2) {
          newAmount = amount - roundoff + 5;
      }

      if (newAmount == 100 || newAmount == 0) {
          return "Cannot calculate change.";
      } else {

          int quarter = newAmount / 25;
          int dime = (newAmount % 25) / 10;
          int nickle = ((newAmount % 25) % 10) / 5;

          String q = String.valueOf(quarter);
          String d = String.valueOf(dime);
          String n = String.valueOf(nickle);
          String a = String.valueOf(amount);

          String str = a + " cents requires";

          if (quarter != 0) {
              if (quarter == 1) {
                  if (dime != 0 || nickle != 0) {
                      str = str + " " + q + " quarter,";
                  } else {
                      str = str + " " + q + " quarter";
                  }
              } else if (quarter >= 2) {
                  if (dime != 0 || nickle != 0) {
                      str = str + " " + q + " quarters,";
                  } else {
                      str = str + " " + q + " quarters";
                  }

              }
          }

          if (dime != 0) {
              if (dime == 1) {
                  if (nickle != 0) {
                      str = str + " " + d + " dime,";
                  } else {
                      str = str + " " + d + " dime";
                  }

              } else if (dime >= 2) {
                  if (nickle != 0) {
                      str = str + " " + d + " dimes,";
                  } else {
                      str = str + " " + d + " dimes";
                  }
              }
          }

          if (nickle != 0 && nickle == 1) {
              str = str + " " + n + " nickel";
          } else if (nickle != 0 && nickle >= 2) {
              str = str + " " + n + " nickels";

          }

          //System.out.println(str);
          return str;

      }
    
  }
}
