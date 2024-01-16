import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random rand=new Random();
      int user , bot;
      int chances=5;
      while (chances>0) {
          System.out.println("\n\n\t\tRock Paper Scissor Game\n");
          System.out.println("Chances left:"+chances);
          bot = rand.nextInt(1, 3);
          System.out.println("Select ['1.rock' ,'2.paper','3.scissor']:");
          user = input.nextInt();
          if (user == bot) {
              System.out.println("Bot:" + bot + "\nYou:" + user);
              System.out.println("Draw.....");
          } else if (user == 1) {
              if (bot == 2) {
                  System.out.println("Bot:" + bot + "\nYou:" + user);
                  System.out.println("Sorry!...You loose");
              } else {
                  System.out.println("Bot:" + bot + "\nYou:" + user);
                  System.out.println("Hurray!...You Won");
              }
          } else if (user == 2) {
              if (bot == 3) {
                  System.out.println("Bot:" + bot + "\nYou:" + user);
                  System.out.println("Sorry!...You Loose");
              } else {
                  System.out.println("Bot:" + bot + "\nYou:" + user);
                  System.out.println("Hurray!...You Won");
              }
          } else if (user == 3) {
              if (bot == 1) {
                  System.out.println("Bot:" + bot + "\nYou:" + user);
                  System.out.println("Sorry!...You Loose");
              } else {
                  System.out.println("Bot:" + bot + "\nYou:" + user);
                  System.out.println("Hurray!...You Won");
              }
          }

          chances--;

      }



    }
}

