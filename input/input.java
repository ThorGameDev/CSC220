import java.util.Scanner;

public class input
{
    public static void main(String[] args)
    {
        String name;
        Scanner keyboard = new Scanner(System.in);
        name = keyboard.nextLine();
        System.out.println("Here! " + name);
        
        keyboard.close();
    }
}
