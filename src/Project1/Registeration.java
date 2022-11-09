package Project1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Registeration {
	static boolean isExitMain = true;
	static boolean isExitSubject = true;
	static boolean isExitSubMenue = true;
	
	Currency currencyObj = new Currency(); // ...
	
	static Set<String> hashEmailSet = new HashSet<String>(); //...
	static Set<String> hashEmailSetUnique = new HashSet<String>();
	static List<School> schoolList = new ArrayList<>();
	//static List<Student> studentList = new ArrayList<>();
	static List<String> listDuplicateEmail = new ArrayList<>();
	//static School schoolObject = new School();

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
	

	static void registeration() {
			Scanner sc = new Scanner(System.in);
			History historyObject = new History();
//			new History();
//			new HashSet<String>();
//			Set<String> hashEmailSetUnique = new HashSet<String>();
//			List<String> schoolList = new ArrayList<>();
//			List<String> listDuplicateEmail = new ArrayList<>();
			 ObjectOutputStream out = null ;
			 FileOutputStream fout = null;
			 
			 try {
				 fout= new FileOutputStream("C:\\Users\\user020\\Desktop\\Eclipse\\Solo_Project_School_System-M\\result.txt");
				 out = new ObjectOutputStream (fout);
//					out.writeObject(historySatck);
//					out.flush();
//					out.close();
					System.out.println("congratz it has been added to the file !!");
				}
				catch (IOException e1)
				{
					e1.printStackTrace();
				}

			 
			
			isExitMain = Boolean.TRUE;
			while (isExitMain) {
				School schoolObject = new School(); // Creating object for school
				System.out.println("Enter School Name: ");
				String schoolInput = sc.next();
				historyObject.historySatck.push(schoolInput);

				schoolObject.setSchoolName(schoolInput);// object chaining
				schoolList.add(schoolObject);//...
				
				
//				try {
//					FileOutputStream fileOut = new FileOutputStream ("SerilizationFile.txt");
//					ObjectOutputStream out = new ObjectOutputStream (fileOut);
//					out.writeObject(historySatck);
//					out.flush();
//					out.close();
//					System.out.println("congratz it has been added to the file !!");
//				}
//				catch (Exception e)
//				{
//					System.out.println(e);
//				}

//				while(checkMark) {
//					try {
//				System.out.println("Enter Mark: ");
//				String markInput = sc.next();
//				Integer studentMarkInput = Integer.parseInt(markInput);
//				checkMark=false;
//				
//
//				markObject.setSubjectMark(studentMarkInput);
//				historySatck.push(markInput);
//				schoolList.add(schoolInput);
//				
//				subjectObject.marksArryList.add(markObject);
//				checkMark= false;
//					}
//					catch(Exception e) {
//						System.out.println("The Error is " + e.getMessage());
//						continue;
//					} 
//				}

				Student studentObject = new Student();// student object
				
				System.out.println("Enter Student ID:");
				int enrolNumber = sc.nextInt();
				String enrolmentNumber = Integer.toString(enrolNumber);
				
				historyObject.historySatck.push(enrolmentNumber);
				studentObject.setEnrolID(enrolNumber);

				System.out.println("Enter Student Name:");
				String studentNameInput = sc.next();
				historyObject.historySatck.push(studentNameInput);
				studentObject.setstudentName(studentNameInput);
				schoolObject.studentList.add(studentObject);
				studentObject.isWorking(); // taking from the student interface
				
//				System.out.println("Enter Student last name:");
//				String studentLastName = sc.next();
//				historySatck.push(studentLastName);
//				studentObject.last
				
				

				System.out.println("Enter Student Email:");
				String emailInput = sc.next();
				historyObject.historySatck.push(emailInput);
				studentObject.setStudentEmail(emailInput);
				schoolObject.studentList.add(studentObject);
				listDuplicateEmail.add(emailInput);
				hashEmailSetUnique.add(emailInput);

				isExitSubject = Boolean.TRUE;
				while (isExitSubject) {
					Subject subjectObject = new Subject();// Creating Object For Subject
					System.out.println("Enter Subject Name: ");
					String subjectNameInput = sc.next();
					subjectObject.setSubjectName(subjectNameInput);
					historyObject.historySatck.push(subjectNameInput);
					subjectObject.subjectAvailable();//taking from the subject interface
					

					Mark markObject = new Mark(); // Creating Object For Mark
					boolean checkMark = true;
					while(checkMark) {
						try {
					System.out.println("Enter Mark: ");
					String markInput = sc.next();
					Integer studentMarkInput = Integer.parseInt(markInput);
					checkMark=false;
					

					markObject.setSubjectMark(studentMarkInput);
					historyObject.historySatck.push(markInput);
					//subjectObject.schoolList.add(schoolInput);
					
					subjectObject.marksArryList.add(markObject);
					checkMark= false;
						}
						catch(Exception e) {
							System.out.println("The Error is " + e.getMessage());
							continue;
						} 
					}
					studentObject.listSubject.add(subjectObject);

					System.out.println("Press 1 To Add New Subject , Press 0 To Go Out Of The Option");
					int exitSubjectInput = sc.nextInt();
					String exitUserSubjectInput = Integer.toString(exitSubjectInput);
					historyObject.historySatck.push(exitUserSubjectInput);
					if (exitSubjectInput == 0) {

						isExitSubject = false;
					}
				}

				//School.studentList.add(studentObject);
				System.out.println("Press 1 To Add New Student , Press 0 To Go Out Of The Option");
				int exitStudentInput = sc.nextInt();
				String exitUserStudentInput = Integer.toString(exitStudentInput);
				historyObject.historySatck.push(exitUserStudentInput);
				
				if (exitStudentInput == 0) {
					isExitMain = false;
					// mainMenueFunction();
				}
				 mainMenueFunction();

			}
	 }
public void showReport() {
//	System.out.println("_____ ++++++Report:++++++_____");// for each method in array list
	for (School schoolVariable : schoolList){
		System.out.println(schoolVariable.schoolName);
		for (Student studentVariable : schoolVariable.studentList) {
			System.out.println("Student Name :" + studentVariable.getStudentName() + "\n The Email is :"
					+ studentVariable.getStudentEmail());
			for (Subject subjectVariable : studentVariable.listSubject) {
				for (Mark markVariable : subjectVariable.getMarksArryList()) {
					System.out.println("Student mark of " + subjectVariable.getSubjectName() + ":" + " "
							+ markVariable.getSubjectMark());

				}
			}
		}
	}
	
}
}
