//Date: November 3, 2024
//Program Description: Check if expenses are within budget
//Time Spent: about 35 minutes

import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class BudgetAnalysis
{
    //Function declaration
    public static void main(String[] args) throws IOException
    {
        //Input method
        Scanner keyboard = new Scanner(System.in);

        //Check if output should be a file
        System.out.print("Display to file? y/n: ");
        Boolean toFile = keyboard.nextLine().equals("y");
        System.out.println(toFile ? "Displaying to file" : "Displaying to console");

        //Request information about month and budget
        System.out.print("Days in month:");
        int monthDays = keyboard.nextInt();
        System.out.print("Budget: ");
        float budget = keyboard.nextFloat();

        //Keep track of expense
        float expense = 0;
        //Iterate through each day
        for(int i = 1; i <= monthDays; i++)
        {
            //Get day expenses
            System.out.print("Day " + i + " expenses: ");
            expense += keyboard.nextFloat();
        }

        //Get rid of yellow squiggly lines, and improve memory safety
        keyboard.close();

        String log = "";

        //Details about the day's expense
        DecimalFormat df = new DecimalFormat("0.00");
        log += "Days: " + monthDays + "\n";
        log += "\n";

        log += "Budget: " + df.format(budget) + "\n";
        log += "Daily Budget: " + df.format(budget / monthDays) + "\n";
        log += "\n";

        log += "Expense: " + df.format(expense) + "\n";
        log += "Daily Expense: " + df.format(expense / monthDays) + "\n";
        log += "\n";
        if(expense > budget)
        {
            log += df.format(expense - budget) + "$ over budget" + "\n";
            log += df.format((expense - budget) / monthDays) + "$ over daily budget" + "\n";
        }
        else if(expense ==  budget)
        {
            log += "Expenses equal budget" + "\n";
        }
        else
        {
            log += df.format(budget - expense) + "$ under budget" + "\n";
            log += df.format((budget - expense) / monthDays) + "$ under daily budget" + "\n";
        }

        //Display the output to either file or console
        if(toFile)
        {
            FileWriter file = new FileWriter("Budget.txt");
            file.append(log);
            file.close();
        }
        else
        {
            System.out.println(log);
        }
    }
}
