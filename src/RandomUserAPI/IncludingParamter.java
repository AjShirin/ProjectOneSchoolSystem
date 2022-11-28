package RandomUserAPI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.Gson;

public class IncludingParamter {
	public void showIncludeParamter() throws IOException, InterruptedException {
		System.out.println("what you want to appears for user from the choices:");
		System.out.println("___________________________________");
		System.out.println(
				"name\r\n"
				+ "nat\r\n"
				+ "email\r\n"
				+ "login\r\n"
				+ "location\r\n"
				+ "gender"
				);
		System.out.println("___________________________________");
		
		
		Scanner sc = new Scanner(System.in);
		String include = sc.next();

		
			HttpClient client = HttpClient.newHttpClient();
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create("https://randomuser.me/api/?inc="+include)).build();

			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

			String JsonR = response.body();
			System.out.println("THe JSON is :" + JsonR);
		
			Gson GsonObject = new Gson();
			//Unkown unknownObj = GsonObject.fromJson(response.body().toString(), Unkown.class);
			//System.out.println(response.body().formatted(null));
			
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
           if((unknownObj.getResults().get(0).getName()!= null)) {
		    System.out.println("The Name is:"+unknownObj.getResults().get(0).getName().getFirst());
           }
         
           
           else  if((unknownObj.getResults().get(0).getLocation()!=null)) {
		    	 System.out.println("The location is:"+unknownObj.getResults().get(0).getLocation().getState());
			
          }
          else  if((unknownObj.getResults().get(0).getEmail()!=null)) {
		    	 System.out.println("The email is:"+unknownObj.getResults().get(0).getEmail());
			
        }
          else  if((unknownObj.getResults().get(0).getLogin()!=null)) {
		    	 System.out.println("The login is:"+unknownObj.getResults().get(0).getLogin());
			
     } 
     
          else  if((unknownObj.getResults().get(0).getNat()!=null)) {
  		    	 System.out.println("The nat is:"+unknownObj.getResults().get(0).getNat());
  			
    } 
          else  if((unknownObj.getResults().get(0).getGender()!=null)) {
		    	 System.out.println("The gender is:"+unknownObj.getResults().get(0).getGender());
			
 }

		
	}
}
