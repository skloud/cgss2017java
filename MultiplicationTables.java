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
        
        keyboard.nextLine();
        
        System.out.print("  ");
            for(int a = 0; a <= size; ++a)
            {
                System.out.printf("%7d", a);
            }
            System.out.println();
            for (int b = 0; b <= size; ++b)
            {        
                
                if(b<10)
                {
                    System.out.print(" " +b);
                } else
                
                {
                    System.out.print(b);
                }
                for(int a = 0; a <= size; ++a)
                {
                    System.out.printf("%7d", a * b);
                }
                System.out.println();
            }
            
           
            
        

    }   
}