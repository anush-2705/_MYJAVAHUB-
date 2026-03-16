import java.util.*;

public class NumberUtility {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== NUMBER MENU =====");
            System.out.println("1. Check Even or Odd");
            System.out.println("2. Check Prime Number");
            System.out.println("3. Find Factorial");
            System.out.println("4. Reverse Number");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter number: ");
                    int num = sc.nextInt();

                    if(num % 2 == 0)
                        System.out.println("Even Number");
                    else
                        System.out.println("Odd Number");
                    break;

                case 2:
                    System.out.print("Enter number: ");
                    int n = sc.nextInt();
                    int count = 0;

                    for(int i = 1; i <= n; i++) {
                        if(n % i == 0)
                            count++;
                    }

                    if(count == 2)
                        System.out.println("Prime Number");
                    else
                        System.out.println("Not Prime");
                    break;

                case 3:
                    System.out.print("Enter number: ");
                    int fact = sc.nextInt();
                    int f = 1;

                    for(int i = 1; i <= fact; i++) {
                        f = f * i;
                    }

                    System.out.println("Factorial = " + f);
                    break;

                case 4:
                    System.out.print("Enter number: ");
                    int rev = sc.nextInt();
                    int r = 0;

                    while(rev != 0) {
                        int digit = rev % 10;
                        r = r * 10 + digit;
                        rev = rev / 10;
                    }

                    System.out.println("Reverse = " + r);
                    break;

                case 5:
                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while(choice != 5);

        sc.close();
    }
}