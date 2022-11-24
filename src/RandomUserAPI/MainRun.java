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
		System.out.println("3. Generate Random Password");
		System.out.println("4. Seeding");
		System.out.println("5. Nationalities");
		System.out.println("6. show Include Paramter");
		System.out.println("8. show Excluding Paramter");
		System.out.println("7. Exit the system ");
	}
		
		

	public static void main(String[] args) throws Throwable {
		Scanner sc = new Scanner(System.in);
		choicesFunction();
		
		do {

			int userInput = sc.nextInt();
			switch (userInput) {
			case 1:
				MultipltUser MultipltUserObject = new MultipltUser(); 
				MultipltUserObject.MultipltUserFunction();
				choicesFunction();
				break;
				
			case 2:
				Pagination PaginationObject = new Pagination(); 
				PaginationObject.showPagination();
				choicesFunction();
				
				
				break;
				

			case 3:
				RandomPassword randomPasswordObject = new RandomPassword(); 
				randomPasswordObject.passwordGenerator();
				choicesFunction();
				break;

				

			case 4:
				Seeding seedingObject = new Seeding();
				seedingObject.showSeed();
				choicesFunction();
				
				break;
				
			case 7:
				System.out.println("Exiting The System Bye See you Again :)!....");
				System.exit(0);
				
				break;
			case 8:
				ExcludingParamter excPara = new ExcludingParamter();
				excPara.showExcludingParamter();
				choicesFunction();
				break;
				
			
			case 6:
				IncludingParamter inclidePara = new IncludingParamter();
				inclidePara.showIncludeParamter();
				choicesFunction();
				break;
			case 5:
				//create object for class nationaltites
				Nationalities national = new Nationalities();
				national.showNationalities();
				choicesFunction();
				
				break;
			}

		} while (true);
	}

}
