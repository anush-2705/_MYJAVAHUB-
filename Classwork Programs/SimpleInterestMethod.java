import java.util.Scanner;

class SimpleInterestMethod 
{

    //Method to calculate Simple Interest
    void calculateSI(int p, int r, int t) 
    {

        int si=(p*r*t)/100; //Simple Interest formula
        System.out.println("Simple Interest = " + si);

        int tot=(si+p);  //Total Amount with interest
        System.out.println("Total Amount = " + tot);
    }

    //Main method
    public static void main(String args[]) 
    {

        Scanner sc=new Scanner(System.in); //Scanner object

        //Taking input from user
        System.out.print("Enter Principal amount: ");
        int p=sc.nextInt();

        System.out.print("Enter Rate of Interest: ");
        int r=sc.nextInt();

        System.out.print("Enter Time: ");
        int t=sc.nextInt();

        //Create object of class
        SimpleInterestMethod obj=new SimpleInterestMethod();

        //Call method
        obj.calculateSI(p, r, t);
    }
}
