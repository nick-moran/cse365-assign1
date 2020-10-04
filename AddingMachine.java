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
  private String history;
  /**
   * This is the constructor. It takes no arguments, but sets total to zero
   * and sets history to ""
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = "0";
  }
  
  /**
   * Returns the total
   * @return returns the total.
   */
  public int getTotal () {
    return this.total;
  }

  /**
   * This takes in a value and adds it to the total
   * it also writes a plus to the string history
   * @param value This is the number that will be added to the total
   */
  public void add (int value) {
    this.total += value;
    this.history = this.history + " + " + value;
  }

  /**
   * This takes in a value and subtracts it from the total
   * it also writes a subtract to the string history
   * @param value This is the number that will be subtracted
   */
  public void subtract (int value) {
    this.total -= value;
    this.history = this.history + " - " + value;
  }

  /**
   * This returns the string history
   * @return history as a string
   */
  public String toString () {
    return this.history;
  }

  /**
   * This clears the calculator by
   * setting total to zero
   */
  public void clear() {
    this.total = 0;
    this.history = "0";
  }
}