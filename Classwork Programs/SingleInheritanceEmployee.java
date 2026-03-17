class Employee{

int empId;
String name;


void displayEmployee(){

System.out.println("Employee ID: " + empId);
System.out.println("Employee Name: " + name);
}

}

class Developer extends Employee{

String technology;

void displayDeveloper(){

System.out.println("Technology: " + technology);
} 

}

public class SingleInheritanceEmployee{

public static void main(String[] args){

Developer d=new Developer();

d.empId=101;
d.name="Anushree";
d.technology="Java";

d.displayEmployee();
d.displayDeveloper();

}

}
