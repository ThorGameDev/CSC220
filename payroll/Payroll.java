import java.util.Scanner;

public class Payroll
{
    private int[] employeeID;
    private int[] hours;
    private double[] payRate;
    private double[] wages;
    Scanner keyboard = new Scanner(System.in);

    public void main(String[] args) { initialize(); }
    Payroll() { initialize(); }

    public void initialize()
    {
        employeeID = new int[] {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
        hours = new int[] {0, 0, 0, 0, 0, 0, 0};
        payRate = new double[] {0, 0, 0, 0, 0, 0, 0};
        wages = new double[] {0, 0, 0, 0, 0, 0, 0};
    }

    private int getIndex(int id)
    {
        for(int i = 0; i < employeeID.length; i++)
        {
            if(employeeID[i] == id)
            {
                return i;
            }
        }
        return -1;
    }
    
    public int[] getIdList()
    {
        return employeeID;
    }

    public void setData(int id)
    {
        int index = getIndex(id);

        System.out.print("Hours: ");
        hours[index] = keyboard.nextInt();
        System.out.print("PayRate: ");
        payRate[index] = keyboard.nextDouble();

        wages[index] = payRate[index] * hours[index];
        System.out.println("Wages: " + wages[index]);
    }
    
    public void getEmployeeDetails(int id)
    {
        int index = getIndex(id);
        if(index == -1)
        {
            System.out.println("Invalad employeeID");
            return;
        }
        System.out.println("Hours: " + hours[index]);
        System.out.println("PayRate: " + payRate[index]);
        System.out.println("wage: " + wages[index]);
    }
}
