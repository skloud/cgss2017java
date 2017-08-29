import static java.lang. System.out;
import java.util.Scanner;

public class MultiplicationTables
{
    public static void main(String[] args)
    {

        System.out.println("Welcome to Multiplication Tables");
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.println("What size would you like to print to? ");
        int size = keyboard.nextInt();

        for(int a = 0; a <= size; ++a)
        {
            System.out.printf("%2d", a);
        }
        System.out.println();
        for (int b = 0; b <= size; ++b)
        {        
            System.out.printf("%2d", size);
        }
        System.out.println();

        {
            for(int a = 0; a <= size; ++a)
            {
                System.out.printf("%2d", a * size);
            }
            System.out.println();

        }

    }   
}