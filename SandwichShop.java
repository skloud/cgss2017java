import static java.lang. System.out;
import java.util.Scanner;

public class SandwichShop
{
    public static void main(String[] args)
    {
        //
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;


        out.println("Checking sales goals.");

        out.println("The sales goal for veggie sandwiches is 50.");
        int veggiesOrdered;
        out.println("How many veggie sandwiches were sold today?");
        veggiesOrdered = keyboard.nextInt();

        if (veggiesOrdered >= goalForVeggies)     
        {
            out.println("Made goal for veggies.");
        }
        else
        {
            out.println("Fell short of goal.");
        }

        out.println("The sales goal for burgers is 250.");
        int burgersOrdered;
        out.println("How many burgers were sold today?");
        burgersOrdered = keyboard.nextInt();

        if (burgersOrdered >= goalForBurgers)     
        {
            out.println("Made goal for burgers.");
        }
        else
        {
            out.println("Fell short of goal.");
        }

        out.println("The sales goal for subs is 180.");
        int subsOrdered;
        out.println("How many subs were sold today?");
        subsOrdered = keyboard.nextInt();

        if (subsOrdered >= goalForSubs)     
        {
            out.println("Made goal for subs.");
        }
        else
        {
            out.println("Fell short of goal.");
        }

        out.println("The sales goal for soup is 70.");
        int soupOrdered;
        out.println("How many soup were sold today?");
        soupOrdered = keyboard.nextInt();

        if (soupOrdered >= goalForSoup)     
        {
            out.println("Made goal for soup.");
        }
        else
        {
            out.println("Fell short of goal.");
        }

        if (veggiesOrdered >= goalForVeggies && burgersOrdered >= goalForBurgers && subsOrdered >= goalForSubs && soupOrdered >= goalForSoup)
        {
            out.println("Made goal for everything.");
        }
    }
}
