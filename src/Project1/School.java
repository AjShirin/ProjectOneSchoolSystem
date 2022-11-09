package Project1;

//import java package 
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.*;

import java.math.BigInteger;
import java.util.*;

public class School { // Implementing the Serializtion //implements Serializable
	int a = 1;
	 String schoolName;
	//List<String> schoolList = new ArrayList<>();
	static boolean isExitMain = true;
	static boolean isExitSubject = true;
	static boolean isExitSubMenue = true;
	static boolean isExitLogiIN = true;
	
	//static Registeration registerationObject = new Registeration(); // Creating object for Registeration class

	 List<Student> studentList = new ArrayList<>();
	//Stack<String> historyStack = new Stack<>();
	
	// setter for student list
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	// getter for student list
	public List<Student> getStudentList() {
		return studentList;
	}

	// Getter school name
	public  String getSchoolName() {
		return schoolName;
	}

	// Setter from school Name
	public void setSchoolName(String SchoolName) {
		this.schoolName = SchoolName;
	}

	static void mainMenueFunction() {
		System.out.println("***************************");
		System.out.println("Welcome...Please Select one of the following options:");
		System.out.println("1. Registeration");
		System.out.println("2. Print unique Email");
		System.out.println("3. Print Repeated Email");
		System.out.println("4. Display Report");
		System.out.println("5. Show History");
		System.out.println("6. Coding problem ");
		System.out.println("7. Currency Converotr To OMR ");
		System.out.println("8. Exit the System");

	}

	public static void main(String[] args) throws Throwable {
		History historyObject = new History();
		
		ObjectOutputStream out = null;
		FileOutputStream fout=null;
		
		try {
			fout = new FileOutputStream(
					"C:\\Users\\user020\\Desktop\\Eclipse\\Solo_Project_School_System-M\\result.txt");
			out = new ObjectOutputStream(fout);

		} catch (IOException e1) {
			e1.printStackTrace();
		} // end of using stack and push data into file

		// using Stack and push data to file
//		
//		
//
//		try {
//			fileOut = new FileOutputStream(
//					"C:\\Users\\user020\\Desktop\\TMain\\Solo_Project_School_System-M\\result.txt");
//			fOut = new ObjectOutputStream(fileOut);
//
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		} // end of using stack and push data into file

		Scanner sc = new Scanner(System.in);
		Registeration registerationObject = new Registeration(); // Creating object for Registeration class
		List<School> schoolList = new ArrayList<>();
		
		
//		
//		Stack<String> historySatck = new Stack<>();
//		Set<String> hashEmailSet = new HashSet<String>();
//		Set<String> hashEmailSetUnique = new HashSet<String>();
////		List<String> schoolList = new ArrayList<>();
//		List<String> listDuplicateEmail = new ArrayList<>();

		// declaring Variables
		String username;
		String password;

		while (isExitLogiIN) {
			System.out.print("\n Enter username:");// username:shirin
			username = sc.nextLine();
			try {
				if (!username.equals("shirin")) {
					throw new Exception("Wrong Username, Please Try again.");
				}
			} catch (Exception e) {
				System.out.print(e.getMessage());
				continue;
			}
			System.out.print(" \nEnter password:");// password:ajmi
			password = sc.nextLine();
			try {
				if (!password.equals("ajmi")) {
					throw new Exception("Wrong Password, Please Try again.");
				}
			} catch (Exception e) {
				System.out.print(e.getMessage());
				continue;
			}
			isExitLogiIN = false;
		}

		mainMenueFunction();
		do {

			int studentMenue = sc.nextInt();
			switch (studentMenue) {
			case 1:
				School schoolVariable= new School();
				schoolVariable.finalize();
				registerationObject.registeration();
				break;
			case 2:
				// Printing elements of HashSet object
				System.out.println(registerationObject.hashEmailSetUnique);
				mainMenueFunction();
				break;

			case 3:
				for (String email : registerationObject.listDuplicateEmail) {
					if (registerationObject.hashEmailSet.add(email) == false) {
						System.out.println("The Deplicate email is: " + " " + email);

					}

				}
				mainMenueFunction();

				break;

			case 4:
				System.out.println("_____ ++++++Report:++++++_____");// ...
				registerationObject.showReport();
				mainMenueFunction();
//				for (String schoolVariable : schoolList) {
//					System.out.println(getSchoolName());
//					for (Student studentVariable : studentList) {
//						System.out.println("Student Name :" + studentVariable.getStudentName() + "\n The Email is :"
//								+ studentVariable.getStudentEmail());
//						for (Subject subjectVariable : studentVariable.listSubject) {
//							for (Mark markVariable : subjectVariable.getMarksArryList()) {
//								System.out.println("Student mark of " + subjectVariable.getSubjectName() + ":" + " "
//										+ markVariable.getSubjectMark());
//
//							}
//						}
//					}
//				}

				break;
			case 5:
				History.history();
				//History HistoryObject2 = new History(); // Creating object for ProblemSolving class
				//HistoryObject2.history();
				mainMenueFunction();
				break;

			case 6:
				ProblemSolving problemSolvingObject = new ProblemSolving(); // Creating object for ProblemSolving class
				problemSolvingObject.problemSolving();
				mainMenueFunction();

				break;
				
			case 7:
				Currency CurrencyObject = new Currency(); // Creating object for Currency class
				CurrencyObject.currecny();
				mainMenueFunction();

				break;
				
				
				

			case 8:
				System.out.println("Exiting The System Bye See you Again :)!....");
				System.exit(0);

				break;
			}

		} while (true);

	}
}