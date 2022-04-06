


/**
 * Diese Klasse stellt ein Beispiel fuer Funktionen mit einer variablen Anzahl
 * von Parametern zur Verfuegung
 */
public class Sum {
    
   /**
    * Berechnet die Summe einer beliebigen Anzahl Integer
    * @param summanden Die Summanden die addiert werden sollen
    * @return Die Summe der Parameter
    */
   public static int sum(int... summanden){
      //Innerhalb der Methode kann der Parameter summanden wie ein Array 
      //verwendet werden
      int sum = 0;
      for(int i = 0; i< summanden.length; i++){
         sum+= summanden[i];
      }
      return sum;
   }

   public static void main(String[] args){
      System.out.println(sum(1)); // 1
      System.out.println(sum(1,1)); // 2
      System.out.println(sum(1,3,-1)); // 3

   }
}
