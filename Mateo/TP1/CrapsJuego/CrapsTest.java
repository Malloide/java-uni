// Fig. 6.10: CrapsTest.java
// Application to test class Craps.
package CrapsJuego;

public class CrapsTest {
   public static void main(String args[]) {
      Craps game = new Craps();
      int wins = 0;

      for (int counter = 0; counter < 100; counter++) {
         if (game.play() == true) {
            wins++;
         }
      }

      System.out.printf("De 100 juegos, gano %d", wins);
   } // end main
} // end class CrapsTest

/**************************************************************************
 * (C) Copyright 1992-2007 by Deitel & Associates, Inc. and *
 * Pearson Education, Inc. All Rights Reserved. *
 * *
 * DISCLAIMER: The authors and publisher of this book have used their *
 * best efforts in preparing the book. These efforts include the *
 * development, research, and testing of the theories and programs *
 * to determine their effectiveness. The authors and publisher make *
 * no warranty of any kind, expressed or implied, with regard to these *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or *
 * consequential damages in connection with, or arising out of, the *
 * furnishing, performance, or use of these programs. *
 *************************************************************************/
