//Date: November 23, 2024
//Program Description: Creates an array of employee information, and displays some of it 
//Time Spent: About an hour

public class PayrollClient
{
    public static void main(String[] args)
    {
        Payroll payroll = new Payroll();

        int[] IDs = payroll.getIdList();
        for(int i = 0; i < 7; i++)
        {
            System.out.println("Employee #" + i);
            System.out.println("ID: " + IDs[i]);
            payroll.setData(IDs[i]);
            System.out.println();
        }

        System.out.println("Get details about employee " + IDs[0]);
        payroll.getEmployeeDetails(IDs[0]);
    }
}
