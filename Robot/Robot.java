//Date: November 10, 2024
//Program Description: Create a robot
//Time Spent: about an hour

import java.util.Scanner;

public class Robot
{
    public static void main(String[] args)
    {
        // Get parameters about the robot's shape from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Width: ");
        int width = scanner.nextInt();
        if(width < 5)
        {
            System.out.println("Using width of 5 instead");
            width = 5;
        }

        System.out.print("Neck Length: ");
        int neckLength = scanner.nextInt();

        System.out.print("Body Length: ");
        int bodyLength = scanner.nextInt();

        System.out.print("Legs Length: ");
        int legsLength = scanner.nextInt();

        scanner.close();

        //Generate the robot
        Head(width); 
        Neck(neckLength, width); 
        Body(bodyLength, width); 
        Legs(legsLength, width); 
    }

    //Figures out how much white space is needed to the left
    public static String Offset(int object_width, int width)
    {
        width -= object_width; 
        width /= 2;
        String space = "";
        for(int i = 0; i < width; i++)
        {
            space += " "; 
        }
        return space;
    }

    //Displays a head
    public static void Head(int width)
    {
        //Create a big head if there is enough space
        if(width >= 9)
        {
            String space = Offset(9, width);
            System.out.println(space + "+-------+");
            System.out.println(space + "|  0 0  |");
            System.out.println(space + "|       |");
            System.out.println(space + "|  000  |");
            System.out.println(space + "+-------+");
        }
        //Otherwise, create a small head
        else if(width >= 5)
        {
            String space = Offset(5, width);
            System.out.println(space + "+---+");
            System.out.println(space + "|-_^|");
            System.out.println(space + "+---+");
        }
    }

    //Displays a neck
    public static void Neck(int length, int width)
    {
        String space = Offset(3, width);
        for(int y = 0; y < length; y++)
        {
            System.out.println(space + "| |");
        }
    }

    //Displays a body
    public static void Body(int length, int width)
    {
        for(int y=0; y < length; y++)
        {
            String Line = "";
            for(int x=0; x<width; x++)
            {
                Line += "#";
            }
            System.out.println(Line);
        }
    }

    //Display legs
    public static void Legs(int length, int width)
    {
        //If there are no legs, Do not draw
        if(length == 0) { return; }

        //Create leg shaft one smaller than total length
        String space = Offset(5, width);
        for(int y = 0; y < length; y++)
        {
            System.out.println(space + "|| ||");
        }

        //Add feet
        if(width >= 10)
        {
            space = Offset(9, width);
            System.out.println(space + "__|| ||__");
        }
        else if(width >= 8)
        {
            space = Offset(7, width);
            System.out.println(space + "_|| ||_");
        }
        else
        {
            space = Offset(5, width);
            System.out.println(space + "## ##");
        }
    }
}
