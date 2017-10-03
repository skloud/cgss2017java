import static java.lang.System.out;
import java.util.Scanner;
public class Temperature
{

    public static void main(String []args){
        int[][] temps = new int[4][7];

        temps[0][0] = 68;            
        temps[0][1] = 70;            
        temps[0][2] = 76;            
        temps[0][3] = 70;            
        temps[0][4] = 68;            
        temps[0][5] = 71;            
        temps[0][6] = 75; 

        temps[1][0] = 76;
        temps[1][1] = 76;
        temps[1][2] = 87;
        temps[1][3] = 84;
        temps[1][4] = 82;
        temps[1][5] = 75;
        temps[1][6] = 83;

        temps[2][0] = 73;            
        temps[2][1] = 72;            
        temps[2][2] = 81;            
        temps[2][3] = 78;            
        temps[2][4] = 76;            
        temps[2][5] = 73;            
        temps[2][6] = 77;   

        temps[3][0] = 64;
        temps[3][1] = 65;
        temps[3][2] = 69;
        temps[3][3] = 68;
        temps[3][4] = 70;
        temps[3][5] = 74;
        temps[3][6] = 72;

        System.out.println("Temperature Calculator");
        System.out.println();
        System.out.println("The data provided are:");
        String times [] = {"7 AM: ", "3 PM: ", "7 PM: ", "3 AM:"};
        String daysOfWeek [] = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
        for (int i = 0; i < 4; i++) 
        {
            System.out.println();
            System.out.println(times[i]);

            for (int j = 0; j < 7; j++) {
                System.out.printf("%4d",  temps[i][j]);    
            }

        }
        System.out.println();
        System.out.println();
        System.out.println("Based on that data, the following are the average temperatures for the week."); 
        System.out.println();

        int sundaySum    =  0; 
        int mondaySum    =  0;
        int tuesdaySum   =  0;
        int wednesdaySum =  0;
        int thursdaySum  =  0;
        int fridaySum    =  0;
        int saturdaySum  =  0;

        for (int i = 0; i<4; i++){

            sundaySum    += temps[i][0];
            mondaySum    += temps[i][1];
            tuesdaySum   += temps[i][2];
            wednesdaySum += temps[i][3];
            thursdaySum  += temps[i][4];
            fridaySum    += temps[i][5];
            saturdaySum  += temps[i][6];
        }
        int sundayAvg    = sundaySum     / 4;
        int mondayAvg    = mondaySum     / 4;
        int tuesdayAvg   = tuesdaySum    / 4;
        int wednesdayAvg = wednesdaySum  / 4;
        int thursdayAvg  = thursdaySum   / 4;
        int fridayAvg    = fridaySum     / 4;
        int saturdayAvg  = saturdaySum   / 4;
        int dayAvgs[] = {sundayAvg, mondayAvg, tuesdayAvg, wednesdayAvg, thursdayAvg, fridayAvg, saturdayAvg};
        
        System.out.println();
        for (int a=0; a < dayAvgs.length; a++)

        {

            System.out.println(daysOfWeek[a] + ": " + dayAvgs[a]);

        }
        System.out.println();

        int sumOf7am = 0;
        int sumOf3pm = 0;
        int sumOf7pm = 0;
        int sumOf3am = 0;

        for (int b =0; b < 7; b++)

        {

            sumOf7am += temps[0][b];
            sumOf3pm += temps[1][b];
            sumOf7pm += temps[2][b];
            sumOf3am += temps[3][b];

        }

        int averageOf7am = sumOf7am / 7;
        int averageOf3pm = sumOf3pm / 7;
        int averageOf7pm = sumOf7pm / 7;
        int averageOf3am = sumOf3am / 7;
        int averageTime[] = {averageOf7am,averageOf3pm,averageOf7pm, averageOf3am};
        
        for (int a=0; a < averageTime.length; a++)
        {
            System.out.println(times[a] + averageTime[a]);
        }
        System.out.println();
        
        int totalDays = 0;
        for (int i= 0; i < 4; i++)
        {
            for (int j= 0;j < 7; j++)
            {
                totalDays += temps[i][j];
            }
        }
        int totalAvg = totalDays/28;
        System.out.println("The final average temperature for the week was:");
        System.out.println();
        System.out.println("Overall:  " + totalAvg );
    }

}
