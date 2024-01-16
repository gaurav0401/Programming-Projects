import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String user , bot;
        bot="paper";
        System.out.println("Select ['rock' ,'paper','scissor']:");
        user=input.next();
        switch (user){
            case "rock"->{
                System.out.println("Bot:"+bot+"\nYou:"+user);
                System.out.println("You loose!!!");


            }
            case "paper"-> {
                System.out.println("Bot:"+bot+"\nYou:"+user);
                System.out.println("Draw....");}
            case "scissor"-> {
                System.out.println("Bot:"+bot+"\nYou:"+user);
                System.out.println("Hurray!...You Won");
            }
            default -> System.out.println("Invalid choiced is entered.");
        }
    }
}
