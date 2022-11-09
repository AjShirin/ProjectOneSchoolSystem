package Project1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Stack;

public class History {
static Stack<String> historySatck = new Stack<>();
	static void history() {
		 
//		FileOutputStream fileOut;
//		 ObjectOutputStream fOut = null;
//		 try {
//			 fileOut = new FileOutputStream("C:\\Users\\user020\\Desktop\\TMain\\Solo_Project_School_System-M\\result.txt");
//			 fOut = new ObjectOutputStream(fileOut);
////			 FileInputStream fileIn = new FileInputStream("C:\\Users\\user020\\Desktop\\TMain\\Solo_Project_School_System-M\\result.txt\");
////		        ObjectInputStream on = new ObjectInputStream(fileIn);
////		        return (Link) on.readObject()
//			 
//		 }
//		 catch (IOException e1) {
//			 e1.printStackTrace();
//		 } // end of using stack and  push data into file
		 
		System.out.println("***** The history is ******");
		
		// printing history
		// {@code true} if and only if this stack contains
		// no items; {@code false} otherwise.
	while (historySatck.empty() == false) {
		System.out.println(historySatck.pop());
		ObjectOutputStream out = null;
		FileOutputStream fout = null;
		 
		 try {
			 fout = new FileOutputStream("C:\\Users\\user020\\Desktop\\Eclipse\\Solo_Project_School_System-M\\result.txt");
			 out = new ObjectOutputStream(fout);
//			 FileInputStream fileIn = new FileInputStream("C:\\Users\\user020\\Desktop\\TMain\\Solo_Project_School_System-M\\result.txt\");
//		        ObjectInputStream on = new ObjectInputStream(fileIn);
//		        return (Link) on.readObject()
			 
		 }
		 catch (IOException e1) {
			 e1.printStackTrace();
		 } 
		 try {
			 out.writeObject(historySatck.toString());
		 }
		 catch (Exception e1) {
			 e1.printStackTrace();
		 }
		 try {
			 ObjectInputStream in = new ObjectInputStream(new FileInputStream("result.txt")) ;
			 School schoolObjectNew = (School) in.readObject();
			 System.out.println(schoolObjectNew.schoolName);
			 in.close();
			 
		 }
		 catch (Exception e1) {
			 System.out.println(e1);
		 }
	}
	}
}
		
		
//		
//		
//		
//		
//		
//		
//			try {
//			fOut.writeObject(historySatck.toString());
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//			e1.printStackTrace();
//			}
//	}
//	try {
//		        ObjectInputStream on = new ObjectInputStream(new FileInputStream("historyNew.txt"));
//		        School schoolVariable2 = (School) on.readObject();
//		      System.out.println(schoolVariable2.schoolName);
//		      on.close();
//;						}
//	catch(Exception e1) {
//		System.out.println(e1);
//	}
//	}
//
//}
