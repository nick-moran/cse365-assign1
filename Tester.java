/**
 * This is the runner for the calculator class.
 * 
 * @author Nick Moran
 * @version 1.0
 * @since 10/05/20
 */

package cse360assignment02;

public class Tester{
  
  /**
   * A few test instances of the calculator running.
   */
  public static void main(String[] args){
    AddingMachine am = new AddingMachine();

    am.add(4);
    am.subtract(2);
    am.add(5);
    System.out.println("History: " + am);
    System.out.println("Total: " + am.getTotal());
    am.clear();
    
    System.out.println("History: " + am);
    System.out.println("Total: " + am.getTotal());

    am.add(10);
    System.out.println("History: " + am);
    System.out.println("Total: " + am.getTotal());
  }
}