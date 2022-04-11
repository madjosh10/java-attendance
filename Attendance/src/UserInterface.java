/*
 * Josh 4/11/2022
 */

import java.util.Random;
import java.util.Scanner;

public class UserInterface {
	
	static int present;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int count = 0;
	
		System.out.println("Mr.<name>'s class");
		System.out.println("----------------------");
		System.out.println("Insert TOTAL number of students");
		int userInput = scan.nextInt();
		
		scan.close();
		Student[] studentCount = new Student[userInput];
		
		System.out.println("This class has " + userInput + " students.");
		System.out.println("Now time to take roll");
		
		while(count < userInput) {
			
			Student newStudent = new Student("John", "Doe " + (count+1));
			studentCount[count] = newStudent;
			count++;
		}
		System.out.println("---------------------");
		
		for (Student i: studentCount) {
			System.out.println(i.toString());
			if(i.getPresent()) {
				try {
					present++;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("\nThere are " + present + " students present today.");
		
	}

} // end UserInterface