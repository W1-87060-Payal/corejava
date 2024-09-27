package com.sunbeam;

class Employee {
private String firstName;
private String lastName;
private double monthlySalary;

public Employee() {}
public Employee(String firstName, String lastName, double monthlySalary) {
super();
this.firstName = firstName;
this.lastName = lastName;
this.monthlySalary = monthlySalary;
}
public String getFirstName() {
return firstName;
}
public void setFirstName(String firstName) {
this.firstName = firstName;
}
public String getLastName() {
return lastName;
}
public void setLastName(String lastName) {
this.lastName = lastName;
}
public double getMonthlySalary() {
return monthlySalary;
}
public void setMonthlySalary(double monthlySalary) {
this.monthlySalary = monthlySalary;
}

public double raiseSal() {
monthlySalary=monthlySalary+(monthlySalary*10/100);
return monthlySalary;
}

}

public class Que2 {

public static void main(String[]args) {
 Employee emp= new Employee("gauri", "patil", -27852);

if (emp.getMonthlySalary()<= 0) {
 System.out.println("salaray is negative.");

}
else {
 emp.setMonthlySalary(10000);
 System.out.println(emp.getMonthlySalary());

}

Employee emp1= new Employee("sakshi", "paliwal",10000 );
Employee emp2= new Employee("gauri", "raut", 27852);
 System.out.println(emp1.getMonthlySalary());
 System.out.println(emp2.getMonthlySalary());

System.out.println(emp1.raiseSal());
System.out.println(emp2.raiseSal());



}
}   
