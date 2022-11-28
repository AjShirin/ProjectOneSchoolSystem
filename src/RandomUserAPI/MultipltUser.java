package RandomUserAPI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.Gson;

public class MultipltUser {
	public static void MultipltUserFunction ()throws IOException, InterruptedException{
		for(int i=0;i<5;i++) {
		 HttpClient client = HttpClient.newHttpClient();
		    HttpRequest request = HttpRequest.newBuilder()
		            .uri(URI.create("https://randomuser.me/api/?results=5"))
		            .build();
		 

		    HttpResponse<String> response = client.send(request,
		            HttpResponse.BodyHandlers.ofString());
		    
		    String JsonR = response.body();
		    //System.out.println("The JSON is :" +JsonR);
		    
		    
		    Gson GsonObject = new Gson();
		    //Unkown unknownObj = GsonObject.fromJson(response.body().toString(),Unkown.class);
		    
		    /*Creating a file of JSON and saving */
		    try {
		         FileWriter file = new FileWriter("JSONFileWriter.txt");
		         file.write(JsonR.toString());
		         file.close();
		      } catch (IOException e) {
		         // TODO Auto-generated catch block
		         e.printStackTrace();
		      }
		      System.out.println("JSON file created");
		      
		      /*Read Json From File*/
		      Reader JSONReader = new BufferedReader(new FileReader("JSONFileWriter.txt"));
		      Unkown unknownObj = GsonObject.fromJson(JSONReader,Unkown.class);
	
		    System.out.println("*************************************************");
		    
		    System.out.println("The 1st Name is:"+unknownObj.getResults().get(0).getName().getFirst());
		    System.out.println("The  Email is:"+unknownObj.getResults().get(0).getEmail());
		    System.out.println("The  phone is:"+unknownObj.getResults().get(0).getPhone());
		    System.out.println("The  Gender is:"+unknownObj.getResults().get(0).getGender());
		    System.out.println("The  Dob is:"+unknownObj.getResults().get(0).getDob());
		}
	}
//		URL url=new URL("https://randomuser.me/api/");
//		HttpURLConnection conn=(HttpURLConnection) url.openConnection();
//		conn.setRequestMethod("Get");
//		conn.connect();
//		StringBuilder strbuilder=new StringBuilder();
//		int responscode=conn.getResponseCode();
//		if(responscode !=200) {
//			throw new RuntimeException("HttpresponseCode");
//		}
//		else
//		{
//			Scanner scanner=new Scanner(url.openStream());
//			while(scanner.hasNext()) {
//				strbuilder.append(scanner.nextLine());
//			}
//			
//			scanner.close();
//			
//		}
//		
//		Gson gson=new Gson();
//		Unkown result=gson.fromJson(strbuilder.toString(),Unkown.class);
//		}
		
	}		
	
