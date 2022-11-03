package Project1;

//import java package 
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.*;

import java.math.BigInteger;
import java.util.*;

public class School  { // Implementing the Serializtion //implements Serializable
	int a = 1;
	private static String schoolName;

	static boolean isExitMain = true;
	static boolean isExitSubject = true;
	static boolean isExitSubMenue = true;
	static boolean isExitLogiIN = true;

	static List<Student> studentList = new ArrayList<>();
	Stack<String> historyStack = new Stack<>();

	// setter for student list
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	// getter for student list
	public List<Student> getStudentList() {
		return studentList;
	}

	// Getter school name
	public static String getSchoolName() {
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

	// Creating array to store the fibonacci value
	private static long[] fibonacciArrayStore;

	// Fibonacci function
	private static long fibonacciFunction(int number) {
		if (number <= 1) {
			return number;
		}

		if (fibonacciArrayStore[number] != 0) { // Primitive variables can never be null
			return fibonacciArrayStore[number];
		}
		long nthFibbonacciNumber = (fibonacciFunction(number - 1) + fibonacciFunction(number - 2));
		fibonacciArrayStore[number] = nthFibbonacciNumber;

		return nthFibbonacciNumber;

	}

	// Factorial function
	public static BigInteger calculationOfFactorial(int n) {
		BigInteger factorial = new BigInteger("1");
		for (int i = 2; i < n; i++) {
			factorial = factorial.multiply(BigInteger.valueOf(i));

		}
		return factorial;
	}
//		if(n == 1) {
//			System.out.println("factorial(" + n + ") = 1");
//			return 1;
//		} else {
//			System.out.println("factorial(" + n + ") = " + n + " * factorial(" + (n - 1) + ")");
//			return n * calculationOfFactorial(n - 1);
//		}
//	}

	public static void main(String[] args) {
		
		//using Stack and push data to file
		 FileOutputStream fileOut;
		 ObjectOutputStream fOut = null;

		 try {
			 fileOut = new FileOutputStream("C:\\Users\\user020\\Desktop\\TMain\\Solo_Project_School_System-M\\result.txt");
			 fOut = new ObjectOutputStream(fileOut);
//			 FileInputStream fileIn = new FileInputStream("C:\\Users\\user020\\Desktop\\TMain\\Solo_Project_School_System-M\\result.txt\");
//		        ObjectInputStream on = new ObjectInputStream(fileIn);
//		        return (Link) on.readObject()
			 
		 }
		 catch (IOException e1) {
			 e1.printStackTrace();
		 } // end of using stack and  push data into file
		 
		
				 
		Scanner sc = new Scanner(System.in);
    	Stack<String> historySatck = new Stack<>();
		Set<String> hashEmailSet = new HashSet<String>();
		Set<String> hashEmailSetUnique = new HashSet<String>();
		List<String> schoolList = new ArrayList<>();
		List<String> listDuplicateEmail = new ArrayList<>();
		
		
		 
//       ObjectOutputStream out = new ObjectOutputStream(file);

		//declaring Variables
		String username;
		String password;

		int currency;
		double feesAmount = 0;
		double amountCalulation = 0;
		double amount;
		
		 // Serialization 
//        try
//        {   
//            //Saving of object in a file
//            FileOutputStream file = new FileOutputStream("Serilaization.txt");
//            ObjectOutputStream out = new ObjectOutputStream(file);
//              
//            // Method for serialization of object
//            out.writeObject(historySatck);
//              
//            out.close();
//            file.close();
//              
//            System.out.println("Object has been serialized");
//  
//        }
//          
//        catch(IOException ex)
//        {
//            System.out.println("IOException is caught" + ex);
//        }
//		try {
//			FileOutputStream fileOut = new FileOutputStream ("SerilizationFile.txt");
//			ObjectOutputStream out = new ObjectOutputStream (fileOut);
//			out.writeObject(historySatck);
//			out.flush();
//			out.close();
//			//System.out.println("congratz it has been added to the file !!");
//		}
//		catch (Exception e)
//		{
//			System.out.println(e);
//		}

		while (isExitLogiIN) {
			System.out.print("\n Enter username:");// username:shirin
			username = sc.nextLine();
			try {
				if (!username.equals("shirin"))
				{
					throw new Exception ("Wrong Username, Please Try again.");
				}
			}
			catch (Exception e) {
				System.out.print(e.getMessage());
				continue;
			}
			System.out.print(" \nEnter password:");// password:ajmi
			password = sc.nextLine();
			try {
				if (!password.equals("ajmi"))
				{
					throw new Exception ("Wrong Password, Please Try again.");
				}
			}
			catch (Exception e) {
				System.out.print(e.getMessage());
				continue;
			}
			isExitLogiIN = false;
		}
//			if (username.equals("shirin") && password.equals("ajmi")) {
//				System.out.println("Horray!! Login Successful.. welcome To The Main Menue!");
//				userPass=false;
				//mainMenueFunction();

//			userPass = false;

		mainMenueFunction();
				do {
					

					int studentMenue = sc.nextInt();
					switch (studentMenue) {
					case 1:
						isExitMain = Boolean.TRUE;
						while (isExitMain) {
							School schoolObject = new School(); // Creating object for school
							System.out.println("Enter School Name: ");
							String schoolInput = sc.next();
							historySatck.push(schoolInput);

							schoolObject.setSchoolName(schoolInput);// object chaining
							
							
//							try {
//								FileOutputStream fileOut = new FileOutputStream ("SerilizationFile.txt");
//								ObjectOutputStream out = new ObjectOutputStream (fileOut);
//								out.writeObject(historySatck);
//								out.flush();
//								out.close();
//								System.out.println("congratz it has been added to the file !!");
//							}
//							catch (Exception e)
//							{
//								System.out.println(e);
//							}
							

							Student studentObject = new Student();// student object

							System.out.println("Enter Student ID:");
							int enrolNumber = sc.nextInt();
							String enrolmentNumber = Integer.toString(enrolNumber);
							historySatck.push(enrolmentNumber);
							studentObject.setEnrolID(enrolNumber);

							System.out.println("Enter Student Name:");
							String studentNameInput = sc.next();
							historySatck.push(studentNameInput);
							studentObject.setstudentName(studentNameInput);
							schoolObject.studentList.add(studentObject);

							System.out.println("Enter Student Email:");
							String emailInput = sc.next();
							historySatck.push(emailInput);
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
								historySatck.push(subjectNameInput);

								Mark markObject = new Mark(); // Creating Object For Mark
								boolean checkMark = true;
								while(checkMark) {
									try {
								System.out.println("Enter Mark: ");
								String markInput = sc.next();
								Integer studentMarkInput = Integer.parseInt(markInput);
								checkMark=false;
								

								markObject.setSubjectMark(studentMarkInput);
								historySatck.push(markInput);
								schoolList.add(schoolInput);
								
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
								historySatck.push(exitUserSubjectInput);
								if (exitSubjectInput == 0) {

									isExitSubject = false;
								}
							}

							schoolObject.studentList.add(studentObject);
							System.out.println("Press 1 To Add New Student , Press 0 To Go Out Of The Option");
							int exitStudentInput = sc.nextInt();
							String exitUserStudentInput = Integer.toString(exitStudentInput);
							historySatck.push(exitUserStudentInput);
							
							if (exitStudentInput == 0) {
								isExitMain = false;
								// mainMenueFunction();
							}
							 mainMenueFunction();

						}
							try {
								fOut.writeObject(historySatck);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
//							 FileInputStream file = new FileInputStream(fileName);
//						        ObjectInputStream on = new ObjectInputStream(file);
//						        return (Link) on.readObject();
						break;
					case 2:
						// Printing elements of HashSet object
						System.out.println(hashEmailSetUnique);
						// mainMenueFunction();
						break;

					case 3:
						for (String email : listDuplicateEmail) {
							if (hashEmailSet.add(email) == false) {
								System.out.println("The Deplicate email is: " + " " + email);

							}

						}
						// mainMenueFunction();

						break;

					case 4:
						System.out.println("_____ ++++++Report:++++++_____");// for each method in array list
						for (String schoolVariable : schoolList) {
							System.out.println(getSchoolName());
							for (Student studentVariable : studentList) {
								System.out.println("Student Name :" + studentVariable.getStudentName()
										+ "\n The Email is :" + studentVariable.getStudentEmail());
								for (Subject subjectVariable : studentVariable.listSubject) {
									for (Mark markVariable : subjectVariable.getMarksArryList()) {
										System.out.println("Student mark of " + subjectVariable.getSubjectName() + ":"
												+ " " + markVariable.getSubjectMark());
										// System.out.println("\tStudent Fees Amount: " + amountCalulation + "OMR");

									}
								}
							}
						}
						// mainMenueFunction();

						break;
					case 5:

						System.out.println("***** The history is ******");
						// printing history
						// {@code true} if and only if this stack contains
						// no items; {@code false} otherwise.
					while (historySatck.empty() == false) {
						System.out.println(historySatck.pop());
							try {
							fOut.writeObject(historySatck.toString());
							} catch (IOException e1) {
								// TODO Auto-generated catch block
							e1.printStackTrace();
							}
					}
					try {
						        ObjectInputStream on = new ObjectInputStream(new FileInputStream("historyNew.txt"));
						        School schoolVariable2 = (School) on.readObject();
						      System.out.println(schoolVariable2.schoolName);
						      on.close();
;						}
					catch(Exception e1) {
						System.out.println(e1);
					}
						
						
//						try {
//						ObjectInputStream in = new ObjectInputStream (new FileInputStream("SerilizationFile.txt"));
//						Stack stackVariableStream = (Stack)in.readObject();
//						System.out.println(stackVariableStream);
//						in.close();
//						}
//						catch (Exception e) {
//							System.out.println(e);
//						}
						
						 //mainMenueFunction();
						 
						break;
						
					case 6:

						do {
							System.out.println("\n***************************");
							System.out.println("\n******* Welcome To The Coding Problem Menue*******");
							System.out.println("Select One Of The Following Option To Continue...");
							System.out.println("1. Find The Factotrial");
							System.out.println("2. Back To The Main Menu");
							System.out.println("3. Find The Fibonacci");
							int codingProblemUserInput = sc.nextInt();
							switch (codingProblemUserInput) {

							case 1:
								// Factorial
								System.out.println("Enter A Number To Find Its  Factorial : ");
								int userFactorialNuumber = sc.nextInt();
								BigInteger factorial = calculationOfFactorial(userFactorialNuumber);

								System.out.println(
										"The Factorial of " + " " + userFactorialNuumber + " " + "is : " + factorial);

								// calFactorialFunction

//								int fact = 1;
//								int i = 1;
//								System.out.println("Enter a number to find its  factorial : ");
//								int userNum = sc.nextInt();
//								// counting the factorial using while loop
//								while (i <= userNum) {
//									fact = fact * i;
//									i++; // increment i by 1
//								}
//
//								// printing the result
//								System.out.println("\nFactorial of " + userNum + " is: " + fact);
								break;
							case 3:
								// Fibonacci
//								/* It is a sequence of numbers that starts with 0 and then 1 
//								   and then each number after that is the sum 
//								   of the previous 2 numbers */
								System.out.println("Enter The Fibonacci Number You Want To Find:");
								int number = sc.nextInt();

								fibonacciArrayStore = new long[number + 1]; // example to claculate 3 fibonnaci so index
																			// should be 4
								for (int i = 0; i <= number; i++) {
									System.out.print(fibonacciFunction(i) + " ");
								}

//							System.out.println("enter the length of the Fibonacci:");
//								int userFibonaccitLenght = sc.nextInt();
//								
//								int firstNumber = 0;
//								int secondNumber = 1;
//								int thirdNumber;
//								
//								System.out.println(firstNumber+ " " + secondNumber );
//								
//								
//								for (int i = 2; i < userFibonaccitLenght; i++) {
//									thirdNumber = firstNumber + secondNumber;
//									if(thirdNumber<=100) {
//										System.out.println(thirdNumber + " ");
//										firstNumber = secondNumber;
//										secondNumber = thirdNumber;
//									}
//								}

								break;
							case 2:
								isExitSubMenue = false;
								mainMenueFunction();

								break;
							}
						} while (isExitSubMenue);
						break;

					case 7:
						Map<String, Double> currencyMap = new HashMap<>();
						Map<String, Map<String, Double>> secondCurrencyMap = new HashMap<>();

						String currencyName = "Saudi Riyal";

						System.out.println("Enter student name who want to convert:");

						String studentConversionName = sc.next();
						historySatck.push(studentConversionName);

						System.out.println("Choose Currency you want to convert:\n" + "1. Saudi Riyal \n"
								+ " 2. United Arab Emirates Dirham \n" + " 3. Kuwaiti Dinar \n" + " 4. Qatari Rial ");

						currency = sc.nextInt();
						String currencyNew = Integer.toString(currency);
						historySatck.push(currencyNew);

						System.out.println("Enter Fees Amount");

						feesAmount = sc.nextDouble();
						String feesAmountNew = Double.toString(feesAmount);
						historySatck.push(feesAmountNew);

						if (currency == 1) {

							amountCalulation = feesAmount * 9.76;
							// Math.round(amountCal);

						}

						else if (currency == 2) {

							amountCalulation = feesAmount * 0.10;
//					Math.round(amountCal);
							currencyName = "AED";

						}

						else if (currency == 3) {

							amountCalulation = feesAmount * 1.24;
//					Math.round(amountCal);
							currencyName = "KWD";
//					System.out.printf("%.2f", amountCal);

						} else if (currency == 4) {

							amountCalulation = feesAmount * 0.11;
//					Math.round(amountCal);
							currencyName = "QAR";
//					System.out.printf("%.2f", amountCal);

						}
//				System.out.printf("%.2f", comparisionMap);

						currencyMap.put(currencyName, amountCalulation);
						secondCurrencyMap.put(studentConversionName, currencyMap);
//	    		System.out.println( currencyMap);

						// find the closest int for these floats
						// System.out.println(Math.round(comparisionMap));
						System.out.println(secondCurrencyMap);
						mainMenueFunction();

						// String formattedString = String.format("%.2f", comparisionMap);
//			System.out.println("%.2f",formattedString);
						break;

					case 8:
						System.out.println("Exiting The System Bye See you Again!....");
						System.exit(0);
						
						
						break;
					}

				} while (true);

			}
}

//			System.out.println("login  Failed Please Try Again :) ");
//
//		}isExitLogiIN=false;
//
//}
//
//}