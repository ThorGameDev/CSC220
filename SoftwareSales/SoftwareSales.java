//Date: October 30, 2024
//Program Description: Calculate the amount of money a purchase requires
//Time spent: Around 15 minutes

//These just appeared as I wrote my code.
//I love nothing more than my code editor.
import java.text.DecimalFormat;
import java.util.Scanner;

//Normal java boilerplate
public class SoftwareSales
{
    public static void main(String[] args)
    {
        //Prompt the user to input a number, and take input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many packages do you intend to purchase?");
        System.out.println("$99 per package, with discounts for bulk purchaces");
        int purchaced = keyboard.nextInt();
        //C++ has instilled in me an existential dread of memory leaks
        keyboard.close();

        //Find the price of your purchase
        float original = purchaced * 99;
        float discount = 0; 

        //Logic to find the discount
        if (purchaced >= 100)
            discount = original * 0.5f;
        else if (purchaced >= 50)
            discount = original * 0.4f;
        else if (purchaced >= 20)
            discount = original * 0.3f;
        else if (purchaced >= 10)
            discount = original * 0.2f;

        float price = original - discount; 

        //Fun abstraction to format my prices
        DecimalFormat df = new DecimalFormat("0.00");

        //Show the user how much they are spending
        System.out.println("Original price   : $" + df.format(original));
        System.out.println("Discount ammount : $" + df.format(discount));
        System.out.println("Final price      : $" + df.format(price));
    }
}
