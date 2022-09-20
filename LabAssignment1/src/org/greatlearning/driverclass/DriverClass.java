package org.greatlearning.driverclass;

import java.util.Scanner;

import org.greatlearning.model.Employees;
import org.greatlearning.service.CredentialService;

public class DriverClass {

	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name:");
		String firstName = sc.nextLine(); // read first name from user
		System.out.println("Enter Last Name:");
		String lastName = sc.nextLine(); // read last name from user

		Employees emp = new Employees(firstName, lastName);
		CredentialService cred = new CredentialService();
		int ch; // variable declaration to choose the departments

		do {

			System.out.println("Please enter the department from the following");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			ch = sc.nextInt(); // read integer input for department from user

			String email;
			char[] password;

			switch (ch) {
			case 1:
				email = cred.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "tech");
				password = cred.generatePassword();
				cred.showCredentials(emp, email, password);
				break;
			case 2:
				email = cred.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "admin");
				password = cred.generatePassword();
				cred.showCredentials(emp, email, password);
				break;
			case 3:
				email = cred.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "humanresource");
				password = cred.generatePassword();
				cred.showCredentials(emp, email, password);
				break;
			case 4:
				email = cred.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "legal");
				password = cred.generatePassword();
				cred.showCredentials(emp, email, password);
				break;
			default:
				System.out.println("Department Selection is incorrect, Try again");

			} // end of switch statement

		} while (ch <= 4);

	}
}
