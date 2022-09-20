package org.greatlearning.service;

import java.util.Random;

import org.greatlearning.model.Employees;

public class CredentialService {
	
	// method to generate email address
	public String generateEmailAddress(String firstName, String lastName, String department) {
		return firstName + lastName + "@" + department + ".greatlearning.com";
	}

	// method to generate password
	public char[] generatePassword() {
		String Alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		String symbols = "!@#$%^&*()_-";
		String numbers = "0123456789";
		String value = Alphabets + alphabets + symbols + numbers; //all strings concatenated and stored in variable value

		Random random = new Random();
		int len=value.length(); //store length of combined String value
		
		char[] pwd = new char[8];
		for (int i = 0; i < 8; i++) {
			pwd[i] = value.charAt(random.nextInt(len)); // for loop to generate 8 digit random password
		}
		return pwd;
	}

	// method to display credentials

	public void showCredentials(Employees emp, String email, char[] generatedPassword) {

		System.out.println("Dear " + emp.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email---> " + email);
		String printPassword=new String(generatedPassword);
		System.out.println("Password--->" +printPassword);

	}

}
