import java.util.Scanner;
import java.util.Random;

class Game{
    Random rand=new Random();
    private int guess;
     private int right_guess=rand.nextInt(1, 10);
     private int win=0;
     public void setGuess(int guess) {
        this.guess = guess;
    }


    public void  process(){

         if (guess==right_guess){
             win=1;
         }

    }

    public int  result (){
         if (win ==1){
             System.out.println("Your guess:"+guess+"\nRight guess:"+right_guess);
             System.out.println("Hurray....you won");
             
         } else if (right_guess%2==0  ) {
             System.out.println("HINT:Right guess is a multiple of 2...keep trying.");
             if (right_guess>guess){
                 System.out.println("Your guess is bit low....try again.");
             }
             else {
                 System.out.println("Your guess is bit high....try again.");
             }
         }
         else {
             if (right_guess>guess){
                 System.out.println("HINT:Your guess is bit low....try again.");
             }
             else {
                 System.out.println("HINT:Your guess is bit high....try again.");
             }

         }

         return  win;
    }

}

public class GuessingGame {
    static void menu (int chances){
        System.out.println("\n\t\tWelcome to Guessing Game");

        System.out.println("\nChances left:"+chances+"\n");

        System.out.println("1> Play\n2> Exit\n");
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Game g1=new Game();
      int you;
      int chances=5;
      char  choice;


      while (chances!=0){

          menu(chances);
            System.out.printf("Enter your choice:");
            choice=input.next().charAt(0);
            if (choice=='1'){
                System.out.printf("Enter your guess(1-10):");
                you=input.nextInt();
                g1.setGuess(you);
                g1.process();
                int res=g1.result();
                if (res==1){
                    System.out.println("Thanks for playing.....See you text time");
                    break;
                }
            }
            else if (choice=='2') {
                  System.out.println("Exiting game.....See you next time.");
                  break;
            }
            else {
                System.out.println("Invalid choice");
            }

            chances--;

      }




    }

}
