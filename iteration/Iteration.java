import java.util.ArrayList;
import java.util.List;

public class Iteration
{
    public static void main(String[] args)
    {
        //This code takes an input of n and returns n!, or the factorial of n.
        int n = 12;
        int result = 1;
        for(int i = 1; i <= n; i++)
            result *= i;
        System.out.println(result);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for( int i=0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
