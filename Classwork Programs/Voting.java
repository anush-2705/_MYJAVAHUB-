import java.util.Scanner;

public class Voting 
{
   public static void main(String[] args) 
   {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=sc.nextInt();

        // Check if age is 18 or more
        if (age>=18)
        {
        System.out.println("You are eligible to vote.");
        } 
        else 
        {
        System.out.println("You are not eligible to vote as your age "+age+" is less than 18.");
        }
    }
}
