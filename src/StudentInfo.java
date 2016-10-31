/**

 * Name: Ana Luiza Fonseca Teixeira

 * Teacher: Mr. Hardman 

 * Assignment #3, Program #1

 * Date Last Modified: 10/26/2016

 */

import java.util.Scanner;

public class StudentInfo {


	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		String firstName;
		String lastName;
		String login;
		double average;
		int grade;
		int studentID;
		
		
		System.out.println("Hello user! What's your first name?");
		firstName = userInput.nextLine();
		
		System.out.println("What's your last name?");
		lastName = userInput.nextLine();
		
		System.out.println("What's your login?");
		login = userInput.next();
		
		System.out.println("What's your school average?");
		average = userInput.nextDouble();
		
		System.out.println("What grade are you in?");
		grade = userInput.nextInt();
		
		System.out.println("What's your student ID?");
		studentID = userInput.nextInt();
	
		
		System.out.println("\n" + "Your information:");
		System.out.println(String.format( "%-10s" + login, "Login:") );
		System.out.println(String.format( "%-10s" + studentID, "ID:") );
		System.out.println(String.format( "%-10s" + lastName + ", " + firstName, "Name:") );
		System.out.println(String.format( "%-10s" + average, "Average:") );
		System.out.println(String.format( "%-10s" + grade, "Grade:") );
		
		userInput.close();

	}

}
