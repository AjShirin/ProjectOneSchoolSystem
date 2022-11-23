package RandomUserAPI;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


public class MainRun {
	

	static void choicesFunction() {
		
		System.out.println("***************************");
		System.out.println("Welcome...Please Select one of the following options:");
		System.out.println("1. Multiple User");
		System.out.println("2. Pagination");
		System.out.println("3. Password");
		System.out.println("4. Seeding");
		System.out.println("5. Exit the system ");
	}
		
		

	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner sc = new Scanner(System.in);
		choicesFunction();
		
		do {

			int userInput = sc.nextInt();
			switch (userInput) {
			case 1:
				MultipltUser MultipltUserObject = new MultipltUser(); 
				MultipltUserObject.MultipltUserFunction();
				
				break;
			case 2:
				
				break;

			case 3:
				

				break;

			case 4:
				
				break;
			}

		} while (true);
	}

}
