/*
 *	Author: Pranav Arunachalam
 *  Date: October 23
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		System.out.println("Employee Annual Salary: " + michael.getAnnualSalary());
		Employee Dwight = new Employee(1987,"Dwight", "Schrute", 4416.66);
		Employee Jim = new Employee(2474,"Jim","Halpert",4416.66);
		Employee Pam = new Employee(2011,"Pam", "Beesly", 2250);
		Employee Jacob =  new Employee(2242,"Jacob", "Kim", 3453.34);
		Dwight.raiseSalary(25);
		Jim.raiseSalary(40);
		Pam.raiseSalary(15);
		Jacob.raiseSalary(35);
		Dwight.employeeToString();
		System.out.println("Employee Annual Salary: " + Dwight.getAnnualSalary());
		System.out.println("------------------------------");
		Jim.employeeToString();
		System.out.println("Employee Annual Salary: " + Jim.getAnnualSalary());
		System.out.println("------------------------------");
		Pam.employeeToString();
		System.out.println("Employee Annual Salary: " + Pam.getAnnualSalary());
		System.out.println("------------------------------");
		Jacob.employeeToString();
		System.out.println("Employee Annual Salary: " + Jacob.getAnnualSalary());
		System.out.println("------------------------------");
	}
}

