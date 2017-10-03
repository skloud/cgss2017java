import static java.lang.System.out;
import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber{

    public static void main(String[] args){
        Random number = new Random();
        int guessedNumber = number.nextInt(100);
        int triesGuessed = 0;
        Scanner keyboard = new Scanner(System.in);
        String name1;
        String name2;
        int guessone;
        int guesstwo;
        boolean correct = false;
        int counter =0;
        System.out.println("Player 1, what is your name?");
        name1 = keyboard.nextLine();

        System.out.println("Player 2, what is your name?");
        name2 = keyboard.nextLine();
        do{
        

            System.out.println(""+ name1 +", guess a number between 1 and 100:");
            guessone = keyboard.nextInt();
            triesGuessed++;

            if (guessone == guessedNumber){
                correct = true;
                System.out.println("That's correct "+ name1 +". You win!");
            }    
            else if (guessone < guessedNumber){
                System.out.println("Your guess is too low");
            }
            else if (guessone > guessedNumber){
                System.out.println("Your guess is too high");
            }

            System.out.println("" + name2+ " , guess a number between 1 and 100:");
            guesstwo = keyboard.nextInt();
            triesGuessed++;

            if (guesstwo == guessedNumber){
                correct = true;
                System.out.println("That's correct "+ name2 +". You win!");
            }
            else if (guesstwo < guessedNumber){
                System.out.println("Your guess is too low");
            }
            else if (guesstwo > guessedNumber){
                System.out.println("Your guess is too high");

            }
        }while (triesGuessed <= 5 && correct == false); 
        {
            
            System.out.println("The number was "+guessedNumber+".");
            System.out.println("It took you "+triesGuessed+" tries to guess!!");  
            System.out.println("You're both WRONG!! Go AWAY!");
        }
    }
}
