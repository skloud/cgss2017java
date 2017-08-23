import java.util.Scanner;

public class MailMerge 
{

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String donorName = "";
        boolean keepGoing = true;

        System.out.println("---Thank You Letters---");
        while (keepGoing == true)
        {
            System.out.println("What is the donor's name?");
            donorName = keyboard.nextLine();
            System.out.println("What is the donation amount?");
            float donationAmount = keyboard.nextFloat();
            keyboard.nextLine(); 
            System.out.print("Dear "+ donorName +",\n");
            System.out.println();
            System.out.println("Thank you for your donation! We rely on donors like you to keep our \norganization effective, and you came through for us.Your donation of $"+ donationAmount +"\nwill help our efforts to make a difference in the world.");
            System.out.println();
            System.out.println("As you may know, we are a registered non-profit organization, so your \ndonation is tax deductible. You may use this letter as a receipt for tax \npurposes.");
            System.out.println();
            System.out.println("Thank you again for your support!");
            System.out.println();
            System.out.println("Sincerely,");  
            System.out.println("Paula Jones");
            System.out.println("YourCharity.org");

            if (donorName.equals("quit")) { 
                 keepGoing = false;

            }
        }
        
    }
}