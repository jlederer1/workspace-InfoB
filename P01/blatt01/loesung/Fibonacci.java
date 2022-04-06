/**
 * 
 * Class Fibonacci. A Fibonacci object holds the information of a Fibonacci
 * series. One can get the next number f(n) in the series with the method next,
 * starting with f(2).
 * 
 * @author Lars Huning
 * 
 */
public class Fibonacci {

   /**
    * Holds f(n-1)
    */
   private int nMinus1;
   /**
    * Holds f(n-2)
    */
   private int nMinus2;

   /**
    * Create new Fibonacci series, next would deliver f(2).
    */
   public Fibonacci() {
      nMinus1 = 1;
      nMinus2 = 0;
   }
   
   /**
    * Get next number in this Fibonacci series. Starts with f(2).
    * 
    * @return next number in Fibonacci series.
    */
   public int next() {
      int n = nMinus1 + nMinus2;
      nMinus2 = nMinus1;
      nMinus1 = n;
      return n;
   }
}
