/**
 * This is a very basic calculator class
 * 
 * @author Nick Moran
 * @version 1.0
 * @since 10/05/20
 */

package cse360assignment02;

public class AddingMachine {
  private int total;
  
  /**
   * This is the constructor. It takes no arguments, but sets total to zero.
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  /**
   * This returns the total.
   */
  public int getTotal () {
    return 0;
  }

  /**
   * This takes in a value and adds it to the total
   * @param value This is the number that will be added to the total
   */
  public void add (int value) {
  }

  /**
   * This takes in a value and subtracts it from the total
   * @param value This is the number that will be subtracted
   */
  public void subtract (int value) {
  }

  /**
   * This returns the value as a string
   * @return value as a string
   */
  public String toString () {
    return "";
  }

  /**
   * This clears the calculator by
   * setting total to zero
   */
  public void clear() {
  }
}