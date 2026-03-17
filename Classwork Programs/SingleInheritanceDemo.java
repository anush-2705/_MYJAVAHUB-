// Base class
class Student {
    int rollNo;
    String name;

    // Method to set student details
    void setStudentDetails(int r, String n) 
    {
        rollNo=r;
        name=n;
    }

    // Method to display student details
    void displayStudentDetails() 
    {
        System.out.println("Roll No: " +rollNo);
        System.out.println("Name: " +name);
    }
}

// Derived class
class Marksheet extends Student 
{
    int marks1, marks2, marks3;

    // Method to set marks
    void setMarks(int m1, int m2, int m3) 
    {
        marks1=m1;
        marks2=m2;
        marks3=m3;
    }

    // Method to calculate and display result
    void displayResult() 
    {
        int total= marks1 + marks2 + marks3;
        double percentage= total / 3.0;

        System.out.println("Total Marks: " +total);
        System.out.println("Percentage : " +percentage);
    }
}

// Main class
public class SingleInheritanceDemo
{
    public static void main(String[] args)
    {

        // Creating object of derived class
        Marksheet m=new Marksheet();

        // Calling base class method
        m.setStudentDetails(101, "Anushree");

        // Calling derived class method
        m.setMarks(93, 90, 92);

        // Displaying details
        m.displayStudentDetails();
        m.displayResult();
    }
}
