/*public class numbergame {
    public static void main(String[] args){

      double x = Math.random();
      System.out.println(x);
   }

} */

import java.util.Scanner;

public class numbergame {

   public static void guessingNumberGame() {
      Scanner SC = new Scanner(System.in);
      int number = 1 + (int) (100 * Math.random());

      int K = 5;
      int i, guess;
      System.out.println(
            "A number is choosen" 
            + "beetwen 1 to 100. " + "Guess the number "
             + "within 5 trails.");

      for (i = 0; i < K; i++) {
         System.out.println("Guess the number: ");
         guess = SC.nextInt();

         if (number == guess) {
            System.out.println("Good" + "You gussed the correct number.");
            break;
         } else if (number > guess && i != K - 1) {
            System.out.println("The number" + "greater than " + guess);
         } else if (number < guess && i != K - 1) {
            System.out.println("Number is " + "less than " + guess);
         }

      }
      if (i == K) {
         System.out.println("What r u doing" + "K trials. ");
         System.out.println("Number was.... " + number);

      }
   }

   public static void main(String[] args) {
     guessingNumberGame();
   }
}