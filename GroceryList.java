import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList
{
    public static void main(String[] args)
    {
        // 
        Scanner keyboard = new Scanner(System.in);
        out.println("Please list three items on your grocery shopping list.");

        String Item1;
        out.print("Item 1?  ");
        Item1 = keyboard.nextLine();

        String Item2;
        out.print("Item 2?  ");
        Item2 = keyboard.nextLine();

        String Item3;
        out.print("Item 3?  ");
        Item3 = keyboard.nextLine();

        out.println("Now, please enter the quantity of each item.");
        int Item1Count;
        out.print("How many " +Item1+" ? " );
        Item1Count = keyboard.nextInt();
        
        int Item2Count = 0;
        out.print("How many "+Item2+" ? "  );
        Item2Count = keyboard.nextInt();
        
        int Item3Count = 0;
        out.print("How many "+Item3+" ? "  );
        Item3Count = keyboard.nextInt();

        out.println("Now, please enter the price of each item.");
        float Item1CostInDollars;
        out.print("How much does one "+ Item1 +" cost?  "); 
        Item1CostInDollars = keyboard.nextFloat();

        float Item2CostInDollars;
        out.print("How much does one "+ Item2 +" cost?  "); 
        Item2CostInDollars = keyboard.nextFloat();

        float Item3CostInDollars;
        out.print("How much does one "+ Item3 +" cost?  "); 
        Item3CostInDollars = keyboard.nextFloat();

        out.println("Calculating your grocery bill.");

        float priceInDollars = (float)Item1Count * (float)Item1CostInDollars + (float)Item2Count * (float)Item2CostInDollars + (float)Item3Count * (float)Item3CostInDollars;
        out.println("Your total cost is "+ priceInDollars +"");

        // 
    }
}