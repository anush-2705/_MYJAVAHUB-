import java.util.Scanner;

public class SimpleInterest 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal=sc.nextDouble();

        System.out.print("Enter rate of interest: ");
        double rate=sc.nextDouble();

        System.out.print("Enter time in years: ");
        double time=sc.nextDouble();

        // Formula for simple interest: SI = (P*R*T)/100
        double interest=(principal*rate*time)/100;
        System.out.println("Simple Interest= " +interest);

         
        //Total Amount with Interest
        double total=principal+interest;
        System.out.println("Total Amount= " +total);

       
    }
}
