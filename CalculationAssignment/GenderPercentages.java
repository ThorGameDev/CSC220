//Date: October 20, 2024
//Program Description: Takes the number of male and female students in a class,
//      and finds the percentage of each gender
//Time spent completing this program: about 20 minutes. 

import java.util.Scanner;

public class GenderPercentages
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Number of male students: ");
        int numMale = keyboard.nextInt();
        System.out.print("Number of female students: ");
        int numFemale = keyboard.nextInt();

        int total = numMale + numFemale;

        //The somewhat strange ordering is just a way to get around the need for floating point.
        int percentMale = numMale * 100 / total;
        //Avoid an expensive division operation.
        int percentFemale = 100 - percentMale;

        System.out.println("Percent Male: " + percentMale + "%");
        System.out.println("Percent Female: " + percentFemale + "%");

        //The book hasn't said anything about preventing memory leaks yet
        //It might not be necessary, but it prevents yellow squiggly lines
        keyboard.close();
    }
}
